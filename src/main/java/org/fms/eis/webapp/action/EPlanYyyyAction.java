/**
 * 电力计划表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EPlanYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEPlanYyyyService;
import org.fms.eis.webapp.vo.EPlanYyyyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EPlanYyyy")
public class EPlanYyyyAction {

    @Autowired
    @Qualifier("EPlanYyyyServiceImpl")
    private IEPlanYyyyService ePlanYyyyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EPlanYyyyVO ePlanYyyyVO) {
        int i = ePlanYyyyService.insert(ePlanYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EPlanYyyyVO ePlanYyyyVO) {
        int i = ePlanYyyyService.update(ePlanYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EPlanYyyyVO> deleteList) throws Exception {
        HttpResult httpResult = ePlanYyyyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EPlanYyyyVO ePlanYyyyVO) {
        EPlanYyyyVO modelVo = ePlanYyyyService.findByKey(ePlanYyyyVO);

        if (modelVo != null) {
            return new HttpResult<EPlanYyyyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EPlanYyyyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EPlanYyyyVO ePlanYyyyVO) {

        return new HttpResultPagination(ePlanYyyyVO, ePlanYyyyService.findByWhere(ePlanYyyyVO));
    }
}
