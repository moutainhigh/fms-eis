/**
 * 测量点日冻结电能示值
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpBmDayYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpBmDayYyyyService;
import org.fms.eis.webapp.vo.EMpBmDayYyyyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpBmDayYyyy")
public class EMpBmDayYyyyAction {

    @Autowired
    @Qualifier("EMpBmDayYyyyServiceImpl")
    private IEMpBmDayYyyyService eMpBmDayYyyyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpBmDayYyyyVO eMpBmDayYyyyVO) {
        int i = eMpBmDayYyyyService.insert(eMpBmDayYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpBmDayYyyyVO eMpBmDayYyyyVO) {
        int i = eMpBmDayYyyyService.update(eMpBmDayYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpBmDayYyyyVO> deleteList) throws Exception {
        HttpResult httpResult = eMpBmDayYyyyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpBmDayYyyyVO eMpBmDayYyyyVO) {
        EMpBmDayYyyyVO modelVo = eMpBmDayYyyyService.findByKey(eMpBmDayYyyyVO);

        if (modelVo != null) {
            return new HttpResult<EMpBmDayYyyyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpBmDayYyyyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpBmDayYyyyVO eMpBmDayYyyyVO) {

        return new HttpResultPagination(eMpBmDayYyyyVO, eMpBmDayYyyyService.findByWhere(eMpBmDayYyyyVO));
    }
}
