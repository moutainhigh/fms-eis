/**
 * 用户操作日志
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EEventOperYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEEventOperYyyyService;
import org.fms.eis.webapp.vo.EEventOperYyyyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EEventOperYyyy")
public class EEventOperYyyyAction {

    @Autowired
    @Qualifier("EEventOperYyyyServiceImpl")
    private IEEventOperYyyyService eEventOperYyyyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EEventOperYyyyVO eEventOperYyyyVO) {
        int i = eEventOperYyyyService.insert(eEventOperYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EEventOperYyyyVO eEventOperYyyyVO) {
        int i = eEventOperYyyyService.update(eEventOperYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EEventOperYyyyVO> deleteList) throws Exception {
        HttpResult httpResult = eEventOperYyyyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EEventOperYyyyVO eEventOperYyyyVO) {
        EEventOperYyyyVO modelVo = eEventOperYyyyService.findByKey(eEventOperYyyyVO);

        if (modelVo != null) {
            return new HttpResult<EEventOperYyyyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EEventOperYyyyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EEventOperYyyyVO eEventOperYyyyVO) {

        return new HttpResultPagination(eEventOperYyyyVO, eEventOperYyyyService.findByWhere(eEventOperYyyyVO));
    }
}
