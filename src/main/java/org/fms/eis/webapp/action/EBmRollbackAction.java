/**
 * 电能示值回收表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EBmRollbackAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEBmRollbackService;
import org.fms.eis.webapp.vo.EBmRollbackVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EBmRollback")
public class EBmRollbackAction {

    @Autowired
    @Qualifier("EBmRollbackServiceImpl")
    private IEBmRollbackService eBmRollbackService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EBmRollbackVO eBmRollbackVO) {
        int i = eBmRollbackService.insert(eBmRollbackVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EBmRollbackVO eBmRollbackVO) {
        int i = eBmRollbackService.update(eBmRollbackVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EBmRollbackVO> deleteList) throws Exception {
        HttpResult httpResult = eBmRollbackService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EBmRollbackVO eBmRollbackVO) {
        EBmRollbackVO modelVo = eBmRollbackService.findByKey(eBmRollbackVO);

        if (modelVo != null) {
            return new HttpResult<EBmRollbackVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EBmRollbackVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EBmRollbackVO eBmRollbackVO) {

        return new HttpResultPagination(eBmRollbackVO, eBmRollbackService.findByWhere(eBmRollbackVO));
    }
}
