/**
 * 采集任务
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PTaskAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPTaskService;
import org.fms.eis.webapp.service.IPTaskTplDetailService;
import org.fms.eis.webapp.service.IPTaskTplService;
import org.fms.eis.webapp.service.impl.PTaskDetailServiceImpl;
import org.fms.eis.webapp.service.impl.PTaskTplDetailServiceImpl;
import org.fms.eis.webapp.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@RequestMapping("PTask")
public class PTaskAction {

    @Autowired
    @Qualifier("PTaskServiceImpl")
    private IPTaskService pTaskService;

    @Autowired
    @Qualifier("PTaskTplDetailServiceImpl")
    private IPTaskTplDetailService pTaskTplDetailService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PTaskVO pTaskVO) {
        int i = pTaskService.insert(pTaskVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PTaskVO pTaskVO) {
        int i = pTaskService.update(pTaskVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<PTaskVO> deleteList) throws Exception {
        HttpResult httpResult = pTaskService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PTaskVO pTaskVO) {
        PTaskVO modelVo = pTaskService.findByKey(pTaskVO);

        if (modelVo != null) {
            return new HttpResult<PTaskVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PTaskVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PTaskVO pTaskVO) {

        return new HttpResultPagination(pTaskVO, pTaskService.findByWhere(pTaskVO));
    }

    /**
     * 通过任务模板获取任务列表
     * @param pTaskTplVO 任务模板ID
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=findByTaskTpl")
    public HttpResultPagination<?> findByTaskTpl(@RequestBody PTaskTplVO pTaskTplVO) {
        PTaskTplDetailVO pTaskTplDetailVO = new PTaskTplDetailVO();
        List<PTaskVO> listVo = pTaskService.findByWhere(new PTaskVO());
        if (pTaskTplVO != null) {
            pTaskTplDetailVO.setTplId(pTaskTplVO.getId());
            pTaskTplDetailVO.setPageCurrent(pTaskTplVO.getPageCurrent());
            pTaskTplDetailVO.setPageSize(pTaskTplVO.getPageSize());

            List<PTaskTplDetailVO> pTaskTplDetailVOList = pTaskTplDetailService.findByWhere(pTaskTplDetailVO);
            //获取选中点集合
            List<Long> taskIDList = pTaskTplDetailVOList.stream().map(PTaskTplDetailVO::getTaskId).collect(Collectors.toList());
            //判断设置选中状态
            if (taskIDList != null && taskIDList.size() > 0 && listVo != null && listVo.size() > 0) {
                for (PTaskVO item : listVo) {
                    int isSelect = taskIDList.contains(item.getId()) ? 1 : 0;
                    item.setIsSelect(isSelect);
                }
            }
        }
        return new HttpResultPagination(pTaskTplDetailVO, listVo);
    }
}
