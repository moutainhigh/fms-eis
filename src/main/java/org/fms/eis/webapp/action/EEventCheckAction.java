/**
 * 异常检测事件
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EEventCheckAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEEventCheckService;
import org.fms.eis.webapp.vo.EEventCheckVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EEventCheck")
public class EEventCheckAction {

    @Autowired
    @Qualifier("EEventCheckServiceImpl")
    private IEEventCheckService eEventCheckService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EEventCheckVO eEventCheckVO) {
        int i = eEventCheckService.insert(eEventCheckVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EEventCheckVO eEventCheckVO) {
        int i = eEventCheckService.update(eEventCheckVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EEventCheckVO> deleteList) throws Exception {
        HttpResult httpResult = eEventCheckService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EEventCheckVO eEventCheckVO) {
        EEventCheckVO modelVo = eEventCheckService.findByKey(eEventCheckVO);

        if (modelVo != null) {
            return new HttpResult<EEventCheckVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EEventCheckVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EEventCheckVO eEventCheckVO) {

        return new HttpResultPagination(eEventCheckVO, eEventCheckService.findByWhere(eEventCheckVO));
    }
}
