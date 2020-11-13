/**
 * 测量点日电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpEngyDayYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpEngyDayYyyyService;
import org.fms.eis.webapp.vo.EMpEngyDayYyyyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpEngyDayYyyy")
public class EMpEngyDayYyyyAction {

    @Autowired
    @Qualifier("EMpEngyDayYyyyServiceImpl")
    private IEMpEngyDayYyyyService eMpEngyDayYyyyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {
        int i = eMpEngyDayYyyyService.insert(eMpEngyDayYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {
        int i = eMpEngyDayYyyyService.update(eMpEngyDayYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpEngyDayYyyyVO> deleteList) throws Exception {
        HttpResult httpResult = eMpEngyDayYyyyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {
        EMpEngyDayYyyyVO modelVo = eMpEngyDayYyyyService.findByKey(eMpEngyDayYyyyVO);

        if (modelVo != null) {
            return new HttpResult<EMpEngyDayYyyyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpEngyDayYyyyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {

        return new HttpResultPagination(eMpEngyDayYyyyVO, eMpEngyDayYyyyService.findByWhere(eMpEngyDayYyyyVO));
    }
}
