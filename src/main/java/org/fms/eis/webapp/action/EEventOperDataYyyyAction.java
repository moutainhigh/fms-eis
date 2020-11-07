/**
 * 用户操作明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EEventOperDataYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEEventOperDataYyyyService;
import org.fms.eis.webapp.vo.EEventOperDataYyyyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EEventOperDataYyyy")
public class EEventOperDataYyyyAction {

    @Autowired
    @Qualifier("EEventOperDataYyyyServiceImpl")
    private IEEventOperDataYyyyService eEventOperDataYyyyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EEventOperDataYyyyVO eEventOperDataYyyyVO) {
        int i = eEventOperDataYyyyService.insert(eEventOperDataYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EEventOperDataYyyyVO eEventOperDataYyyyVO) {
        int i = eEventOperDataYyyyService.update(eEventOperDataYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EEventOperDataYyyyVO> deleteList) throws Exception {
        HttpResult httpResult = eEventOperDataYyyyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EEventOperDataYyyyVO eEventOperDataYyyyVO) {
        EEventOperDataYyyyVO modelVo = eEventOperDataYyyyService.findByKey(eEventOperDataYyyyVO);

        if (modelVo != null) {
            return new HttpResult<EEventOperDataYyyyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EEventOperDataYyyyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EEventOperDataYyyyVO eEventOperDataYyyyVO) {

        return new HttpResultPagination(eEventOperDataYyyyVO, eEventOperDataYyyyService.findByWhere(eEventOperDataYyyyVO));
    }
}
