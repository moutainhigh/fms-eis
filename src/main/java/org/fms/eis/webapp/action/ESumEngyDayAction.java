/**
 * 电量考核单元日电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.ESumEngyDayAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IESumEngyDayService;
import org.fms.eis.webapp.vo.ESumEngyDayVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("ESumEngyDay")
public class ESumEngyDayAction {

    @Autowired
    @Qualifier("ESumEngyDayServiceImpl")
    private IESumEngyDayService eSumEngyDayService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody ESumEngyDayVO eSumEngyDayVO) {
        int i = eSumEngyDayService.insert(eSumEngyDayVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody ESumEngyDayVO eSumEngyDayVO) {
        int i = eSumEngyDayService.update(eSumEngyDayVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<ESumEngyDayVO> deleteList) throws Exception {
        HttpResult httpResult = eSumEngyDayService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody ESumEngyDayVO eSumEngyDayVO) {
        ESumEngyDayVO modelVo = eSumEngyDayService.findByKey(eSumEngyDayVO);

        if (modelVo != null) {
            return new HttpResult<ESumEngyDayVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<ESumEngyDayVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody ESumEngyDayVO eSumEngyDayVO) {

        return new HttpResultPagination(eSumEngyDayVO, eSumEngyDayService.findByWhere(eSumEngyDayVO));
    }
}
