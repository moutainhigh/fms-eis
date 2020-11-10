/**
 * 测量点月冻结需量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpXlMonAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpXlMonService;
import org.fms.eis.webapp.vo.EMpXlMonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpXlMon")
public class EMpXlMonAction {

    @Autowired
    @Qualifier("EMpXlMonServiceImpl")
    private IEMpXlMonService eMpXlMonService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpXlMonVO eMpXlMonVO) {
        int i = eMpXlMonService.insert(eMpXlMonVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpXlMonVO eMpXlMonVO) {
        int i = eMpXlMonService.update(eMpXlMonVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpXlMonVO> deleteList) throws Exception {
        HttpResult httpResult = eMpXlMonService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpXlMonVO eMpXlMonVO) {
        EMpXlMonVO modelVo = eMpXlMonService.findByKey(eMpXlMonVO);

        if (modelVo != null) {
            return new HttpResult<EMpXlMonVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpXlMonVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpXlMonVO eMpXlMonVO) {

        return new HttpResultPagination(eMpXlMonVO, eMpXlMonService.findByWhere(eMpXlMonVO));
    }
}
