/**
 * 电量考核单元月电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.ESumEngyMonAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IESumEngyMonService;
import org.fms.eis.webapp.vo.ESumEngyMonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("ESumEngyMon")
public class ESumEngyMonAction {

    @Autowired
    @Qualifier("ESumEngyMonServiceImpl")
    private IESumEngyMonService eSumEngyMonService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody ESumEngyMonVO eSumEngyMonVO) {
        int i = eSumEngyMonService.insert(eSumEngyMonVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody ESumEngyMonVO eSumEngyMonVO) {
        int i = eSumEngyMonService.update(eSumEngyMonVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<ESumEngyMonVO> deleteList) throws Exception {
        HttpResult httpResult = eSumEngyMonService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody ESumEngyMonVO eSumEngyMonVO) {
        ESumEngyMonVO modelVo = eSumEngyMonService.findByKey(eSumEngyMonVO);

        if (modelVo != null) {
            return new HttpResult<ESumEngyMonVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<ESumEngyMonVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody ESumEngyMonVO eSumEngyMonVO) {

        return new HttpResultPagination(eSumEngyMonVO, eSumEngyMonService.findByWhere(eSumEngyMonVO));
    }
}
