/**
 * 测量点
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PMpedAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import com.sun.javafx.collections.MappingChange;
import org.fms.eis.webapp.service.IPMpedService;
import org.fms.eis.webapp.vo.PMpedVO;
import org.fms.eis.webapp.vo.PTaskTplVO;
import org.fms.eis.webapp.vo.PWsdProtocolVO;
import org.fms.eis.webapp.vo.RCpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@RequestMapping("PMped")
public class PMpedAction {

    @Autowired
    @Qualifier("PMpedServiceImpl")
    private IPMpedService pMpedService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PMpedVO pMpedVO) {
        int i = pMpedService.insert(pMpedVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PMpedVO pMpedVO) {
        int i = pMpedService.update(pMpedVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<PMpedVO> deleteList) throws Exception {
        HttpResult httpResult = pMpedService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PMpedVO pMpedVO) {
        PMpedVO modelVo = pMpedService.findByKey(pMpedVO);

        if (modelVo != null) {
            return new HttpResult<PMpedVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PMpedVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PMpedVO pMpedVO) {

        return new HttpResultPagination(pMpedVO, pMpedService.findByWhere(pMpedVO));
    }

    /**
     * 通过采集点获取关联的测量点对象
     *
     * @param rCpVO 采集点对象
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=findByRelRCp")
    public HttpResult<?> findByRelRCp(@RequestBody RCpVO rCpVO) {
        if (rCpVO != null) {
            PMpedVO pMpedVO = new PMpedVO();
            pMpedVO.setTgId(rCpVO.getRelaObjId());
            pMpedVO.setCpId(rCpVO.getId());
            List<PMpedVO> pMpedVOList = pMpedService.findByWhere(pMpedVO);//获取该采集点下的测量点
            return new HttpResult<Object>(HttpResult.SUCCESS, "获取成功", pMpedVOList);
        } else {
            return new HttpResult<PMpedVO>(HttpResult.ERROR, "参数传递错误!", null);
        }
    }

    /**
     * 通过采集点获取未关联的测量点对象
     *
     * @param rCpVO 采集点对象
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=findByNoRelRCp")
    public HttpResult<?> findByNoRelRCp(@RequestBody RCpVO rCpVO) {
        if (rCpVO != null) {
            PMpedVO pMpedVO = new PMpedVO();
            pMpedVO.setTgId(rCpVO.getRelaObjId());
            List<PMpedVO> listVO = pMpedService.findByWhere(pMpedVO);//获取该台区下的所有测量点
            List<PMpedVO> pMpedVOList = new ArrayList<>();
            if (listVO.size() > 0) {
                pMpedVOList = listVO.stream()
                        .filter((PMpedVO s) -> s.getCpId() != rCpVO.getId())
                        .collect(Collectors.toList());//不存在关系
            }
            return new HttpResult<Object>(HttpResult.SUCCESS, "获取成功", pMpedVOList);
        } else {
            return new HttpResult<PMpedVO>(HttpResult.ERROR, "参数传递错误!", null);
        }
    }

    /**
     * 批量更新测量点与采集点关系
     *
     * @param listVO 测量点集合
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=updateList")
    public HttpResult<?> updateList(@RequestBody List<PMpedVO> listVO) {
        int i = pMpedService.updateList(listVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "保存成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "保存失败", null);
        }

    }
}
