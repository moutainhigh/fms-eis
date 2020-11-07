/**
 * 用户登录日志
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EEventLoginAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEEventLoginService;
import org.fms.eis.webapp.vo.EEventLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EEventLogin")
public class EEventLoginAction {

    @Autowired
    @Qualifier("EEventLoginServiceImpl")
    private IEEventLoginService eEventLoginService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EEventLoginVO eEventLoginVO) {
        int i = eEventLoginService.insert(eEventLoginVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EEventLoginVO eEventLoginVO) {
        int i = eEventLoginService.update(eEventLoginVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EEventLoginVO> deleteList) throws Exception {
        HttpResult httpResult = eEventLoginService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EEventLoginVO eEventLoginVO) {
        EEventLoginVO modelVo = eEventLoginService.findByKey(eEventLoginVO);

        if (modelVo != null) {
            return new HttpResult<EEventLoginVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EEventLoginVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EEventLoginVO eEventLoginVO) {

        return new HttpResultPagination(eEventLoginVO, eEventLoginService.findByWhere(eEventLoginVO));
    }
}
