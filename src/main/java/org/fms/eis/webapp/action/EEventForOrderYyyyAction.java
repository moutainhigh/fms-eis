/**
 * 工单相关异常事件
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EEventForOrderYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEEventForOrderYyyyService;
import org.fms.eis.webapp.vo.EEventForOrderYyyyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EEventForOrderYyyy")
public class EEventForOrderYyyyAction {

    @Autowired
    @Qualifier("EEventForOrderYyyyServiceImpl")
    private IEEventForOrderYyyyService eEventForOrderYyyyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EEventForOrderYyyyVO eEventForOrderYyyyVO) {
        int i = eEventForOrderYyyyService.insert(eEventForOrderYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EEventForOrderYyyyVO eEventForOrderYyyyVO) {
        int i = eEventForOrderYyyyService.update(eEventForOrderYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EEventForOrderYyyyVO> deleteList) throws Exception {
        HttpResult httpResult = eEventForOrderYyyyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EEventForOrderYyyyVO eEventForOrderYyyyVO) {
        EEventForOrderYyyyVO modelVo = eEventForOrderYyyyService.findByKey(eEventForOrderYyyyVO);

        if (modelVo != null) {
            return new HttpResult<EEventForOrderYyyyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EEventForOrderYyyyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EEventForOrderYyyyVO eEventForOrderYyyyVO) {

        return new HttpResultPagination(eEventForOrderYyyyVO, eEventForOrderYyyyService.findByWhere(eEventForOrderYyyyVO));
    }
}
