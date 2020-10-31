/**
 * 规约定义表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PWsdProtocolAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPWsdProtocolService;
import org.fms.eis.webapp.vo.PWsdProtocolVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PWsdProtocol")
public class PWsdProtocolAction {

    @Autowired
    @Qualifier("PWsdProtocolServiceImpl")
    private IPWsdProtocolService pWsdProtocolService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PWsdProtocolVO pWsdProtocolVO) {
        int i = pWsdProtocolService.insert(pWsdProtocolVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PWsdProtocolVO pWsdProtocolVO) {
        int i = pWsdProtocolService.update(pWsdProtocolVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<PWsdProtocolVO> deleteList) throws Exception {
        HttpResult httpResult = pWsdProtocolService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PWsdProtocolVO pWsdProtocolVO) {
        PWsdProtocolVO modelVo = pWsdProtocolService.findByKey(pWsdProtocolVO);

        if (modelVo != null) {
            return new HttpResult<PWsdProtocolVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PWsdProtocolVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PWsdProtocolVO pWsdProtocolVO) {

        return new HttpResultPagination(pWsdProtocolVO, pWsdProtocolService.findByWhere(pWsdProtocolVO));
    }
}
