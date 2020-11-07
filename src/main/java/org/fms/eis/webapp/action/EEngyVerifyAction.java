/**
 * 表码电量审核
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EEngyVerifyAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEEngyVerifyService;
import org.fms.eis.webapp.vo.EEngyVerifyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EEngyVerify")
public class EEngyVerifyAction {

    @Autowired
    @Qualifier("EEngyVerifyServiceImpl")
    private IEEngyVerifyService eEngyVerifyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EEngyVerifyVO eEngyVerifyVO) {
        int i = eEngyVerifyService.insert(eEngyVerifyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EEngyVerifyVO eEngyVerifyVO) {
        int i = eEngyVerifyService.update(eEngyVerifyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EEngyVerifyVO> deleteList) throws Exception {
        HttpResult httpResult = eEngyVerifyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EEngyVerifyVO eEngyVerifyVO) {
        EEngyVerifyVO modelVo = eEngyVerifyService.findByKey(eEngyVerifyVO);

        if (modelVo != null) {
            return new HttpResult<EEngyVerifyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EEngyVerifyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EEngyVerifyVO eEngyVerifyVO) {

        return new HttpResultPagination(eEngyVerifyVO, eEngyVerifyService.findByWhere(eEngyVerifyVO));
    }
}
