/**
 * 计算方案模板明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PCalcTplDetailAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPCalcTplDetailService;
import org.fms.eis.webapp.vo.PCalcTplDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PCalcTplDetail")
public class PCalcTplDetailAction {

    @Autowired
    @Qualifier("PCalcTplDetailServiceImpl")
    private IPCalcTplDetailService pCalcTplDetailService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PCalcTplDetailVO pCalcTplDetailVO) {
        int i = pCalcTplDetailService.insert(pCalcTplDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PCalcTplDetailVO pCalcTplDetailVO) {
        int i = pCalcTplDetailService.update(pCalcTplDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<PCalcTplDetailVO> deleteList) throws Exception {
        HttpResult httpResult = pCalcTplDetailService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PCalcTplDetailVO pCalcTplDetailVO) {
        PCalcTplDetailVO modelVo = pCalcTplDetailService.findByKey(pCalcTplDetailVO);

        if (modelVo != null) {
            return new HttpResult<PCalcTplDetailVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PCalcTplDetailVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PCalcTplDetailVO pCalcTplDetailVO) {

        return new HttpResultPagination(pCalcTplDetailVO, pCalcTplDetailService.findByWhere(pCalcTplDetailVO));
    }
}
