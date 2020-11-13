/**
 * 测量点月电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpEngyMonAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpEngyMonService;
import org.fms.eis.webapp.vo.EMpEngyMonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpEngyMon")
public class EMpEngyMonAction {

    @Autowired
    @Qualifier("EMpEngyMonServiceImpl")
    private IEMpEngyMonService eMpEngyMonService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpEngyMonVO eMpEngyMonVO) {
        int i = eMpEngyMonService.insert(eMpEngyMonVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpEngyMonVO eMpEngyMonVO) {
        int i = eMpEngyMonService.update(eMpEngyMonVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpEngyMonVO> deleteList) throws Exception {
        HttpResult httpResult = eMpEngyMonService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpEngyMonVO eMpEngyMonVO) {
        EMpEngyMonVO modelVo = eMpEngyMonService.findByKey(eMpEngyMonVO);

        if (modelVo != null) {
            return new HttpResult<EMpEngyMonVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpEngyMonVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpEngyMonVO eMpEngyMonVO) {

        return new HttpResultPagination(eMpEngyMonVO, eMpEngyMonService.findByWhere(eMpEngyMonVO));
    }
}
