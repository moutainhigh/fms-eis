/**
 * 采集任务明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PTaskDetailAction.java
 **/
package org.fms.eis.webapp.action;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.riozenc.titanTool.common.json.utils.JSONUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.fms.eis.webapp.service.IPTaskDetailService;
import org.fms.eis.webapp.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.riozenc.titanTool.common.json.utils.GsonUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.alibaba.fastjson.JSONObject;

@ControllerAdvice
@RequestMapping("PTaskDetail")
public class PTaskDetailAction {

    @Autowired
    @Qualifier("PTaskDetailServiceImpl")
    private IPTaskDetailService pTaskDetailService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PTaskDetailVO pTaskDetailVO) {
        int i = pTaskDetailService.insert(pTaskDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PTaskDetailVO pTaskDetailVO) {
        int i = pTaskDetailService.update(pTaskDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }
    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<PTaskDetailVO> deleteList) throws Exception {
        int i = pTaskDetailService.deleteList(deleteList);
        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);
        }
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PTaskDetailVO pTaskDetailVO) {
        PTaskDetailVO modelVo = pTaskDetailService.findByKey(pTaskDetailVO);

        if (modelVo != null) {
            return new HttpResult<PTaskDetailVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PTaskDetailVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PTaskDetailVO pTaskDetailVO) {

        return new HttpResultPagination(pTaskDetailVO, pTaskDetailService.findByWhere(pTaskDetailVO));
    }

    /**
     * 通过任务获取任务包含的数据项
     *
     * @param modelVO 任务
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=findByTaskRel")
    public HttpResult<?> findByTaskRel(@RequestBody PTaskRelVO modelVO) {
        if (modelVO != null) {
            PWsdTaskdataRelVO pWsdTaskdataRelVO = new PWsdTaskdataRelVO();
            pWsdTaskdataRelVO.setProtocolId(modelVO.getProtocolId());//设置规约
            pWsdTaskdataRelVO.setInfopointType(modelVO.getPnType());//设置信息点类型
            pWsdTaskdataRelVO.setTaskID(modelVO.getTaskId());//设置任务ID
            List<PWsdTaskdataRelVO> listVO = pTaskDetailService.findByTaskRel(pWsdTaskdataRelVO);
            return new HttpResult<List<PWsdTaskdataRelVO>>(HttpResult.SUCCESS, "获取成功", listVO);
        } else {
            return new HttpResult<PWsdTaskdataVO>(HttpResult.ERROR, "参数传递错误!", null);
        }
    }

    /**
     * 通过任务获取任务未包含的数据项
     *
     * @param modelVO 任务
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=findByTaskNoRel")
    public HttpResult<?> findByTaskNoRel(@RequestBody PTaskRelVO modelVO) {
        if (modelVO != null) {
            PWsdTaskdataRelVO pWsdTaskdataRelVO = new PWsdTaskdataRelVO();
            pWsdTaskdataRelVO.setProtocolId(modelVO.getProtocolId());//设置规约
            pWsdTaskdataRelVO.setInfopointType(modelVO.getPnType());//设置信息点类型
            pWsdTaskdataRelVO.setTaskID(modelVO.getTaskId());//设置任务ID
            List<PWsdTaskdataRelVO> listVO = pTaskDetailService.findByTaskNoRel(pWsdTaskdataRelVO);
            return new HttpResult<List<PWsdTaskdataRelVO>>(HttpResult.SUCCESS, "获取成功", listVO);
        } else {
            return new HttpResult<PWsdTaskdataVO>(HttpResult.ERROR, "参数传递错误!", null);
        }
    }

    /**
     * 保存任务数据项与任务关系
     *
     * @param body taskID：任务ID  taskDataList：数据项对象
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=saveTaskDataRel")
    public HttpResult<?> saveTaskDataRel(@RequestBody String body) {
        JSONObject obj = JSONObject.parseObject(body);
        String taskID = obj.getString("taskID");
        List<PWsdTaskdataRelVO> listRelVO =obj.getObject("taskDataList",List.class);
        PTaskDetailVO delVO = new PTaskDetailVO();
        delVO.setTaskId(Long.parseLong(taskID));
        List<PTaskDetailVO> delList = pTaskDetailService.findByWhere(delVO);
        if (delList.size() > 0) {
            if (pTaskDetailService.deleteList(delList) == 0) {
                return new HttpResult<String>(HttpResult.ERROR, "保存失败!", null);
            }
        }
        if (listRelVO.size() > 0) {
            List<PTaskDetailVO> insertList = new ArrayList<>();
            for (PWsdTaskdataRelVO item : listRelVO) {
                PTaskDetailVO insertModel = new PTaskDetailRelVO();
                insertModel.setTaskId(item.getTaskID());
                insertModel.setInfopointType(item.getInfopointType());
                insertModel.setDataId(item.getId());
                insertModel.setWeight(item.getRelWeight());
            }
            if (pTaskDetailService.insertList(insertList) == 0) {
                return new HttpResult<String>(HttpResult.ERROR, "保存失败!", null);
            }
        }
        return new HttpResult<String>(HttpResult.ERROR, "保存成功!", null);
    }
}
