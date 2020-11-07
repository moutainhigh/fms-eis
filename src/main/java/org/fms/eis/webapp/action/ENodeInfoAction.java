/**
 * 系统节点运行信息
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.ENodeInfoAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IENodeInfoService;
import org.fms.eis.webapp.vo.ENodeInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("ENodeInfo")
public class ENodeInfoAction {

    @Autowired
    @Qualifier("ENodeInfoServiceImpl")
    private IENodeInfoService eNodeInfoService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody ENodeInfoVO eNodeInfoVO) {
        int i = eNodeInfoService.insert(eNodeInfoVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody ENodeInfoVO eNodeInfoVO) {
        int i = eNodeInfoService.update(eNodeInfoVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<ENodeInfoVO> deleteList) throws Exception {
        HttpResult httpResult = eNodeInfoService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody ENodeInfoVO eNodeInfoVO) {
        ENodeInfoVO modelVo = eNodeInfoService.findByKey(eNodeInfoVO);

        if (modelVo != null) {
            return new HttpResult<ENodeInfoVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<ENodeInfoVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody ENodeInfoVO eNodeInfoVO) {

        return new HttpResultPagination(eNodeInfoVO, eNodeInfoService.findByWhere(eNodeInfoVO));
    }
}
