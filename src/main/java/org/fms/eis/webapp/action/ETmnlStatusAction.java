/**
 * 终端状态信息
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.ETmnlStatusAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IETmnlStatusService;
import org.fms.eis.webapp.vo.ETmnlStatusVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("ETmnlStatus")
public class ETmnlStatusAction {

    @Autowired
    @Qualifier("ETmnlStatusServiceImpl")
    private IETmnlStatusService eTmnlStatusService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody ETmnlStatusVO eTmnlStatusVO) {
        int i = eTmnlStatusService.insert(eTmnlStatusVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody ETmnlStatusVO eTmnlStatusVO) {
        int i = eTmnlStatusService.update(eTmnlStatusVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<ETmnlStatusVO> deleteList) throws Exception {
        HttpResult httpResult = eTmnlStatusService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody ETmnlStatusVO eTmnlStatusVO) {
        ETmnlStatusVO modelVo = eTmnlStatusService.findByKey(eTmnlStatusVO);

        if (modelVo != null) {
            return new HttpResult<ETmnlStatusVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<ETmnlStatusVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody ETmnlStatusVO eTmnlStatusVO) {

        return new HttpResultPagination(eTmnlStatusVO, eTmnlStatusService.findByWhere(eTmnlStatusVO));
    }
}
