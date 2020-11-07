/**
 * 主站设备事件
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EEventDevAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEEventDevService;
import org.fms.eis.webapp.vo.EEventDevVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EEventDev")
public class EEventDevAction {

    @Autowired
    @Qualifier("EEventDevServiceImpl")
    private IEEventDevService eEventDevService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EEventDevVO eEventDevVO) {
        int i = eEventDevService.insert(eEventDevVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EEventDevVO eEventDevVO) {
        int i = eEventDevService.update(eEventDevVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EEventDevVO> deleteList) throws Exception {
        HttpResult httpResult = eEventDevService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EEventDevVO eEventDevVO) {
        EEventDevVO modelVo = eEventDevService.findByKey(eEventDevVO);

        if (modelVo != null) {
            return new HttpResult<EEventDevVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EEventDevVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EEventDevVO eEventDevVO) {

        return new HttpResultPagination(eEventDevVO, eEventDevService.findByWhere(eEventDevVO));
    }
}
