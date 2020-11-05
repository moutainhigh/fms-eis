/**
 * 记录计量点新装及变更过程中的电能表，互感器，计量柜、计量屏，计量箱，失压仪，采集终端等设备的装拆信息实体，定义了设
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.SDevIrAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.ISDevIrService;
import org.fms.eis.webapp.vo.SDevIrVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("SDevIr")
public class SDevIrAction {

    @Autowired
    @Qualifier("SDevIrServiceImpl")
    private ISDevIrService sDevIrService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody SDevIrVO sDevIrVO) {
        int i = sDevIrService.insert(sDevIrVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody SDevIrVO sDevIrVO) {
        int i = sDevIrService.update(sDevIrVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<SDevIrVO> deleteList) throws Exception {
        HttpResult httpResult = sDevIrService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody SDevIrVO sDevIrVO) {
        SDevIrVO modelVo = sDevIrService.findByKey(sDevIrVO);

        if (modelVo != null) {
            return new HttpResult<SDevIrVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<SDevIrVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody SDevIrVO sDevIrVO) {

        return new HttpResultPagination(sDevIrVO, sDevIrService.findByWhere(sDevIrVO));
    }
}
