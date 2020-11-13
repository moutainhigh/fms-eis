/**
 * 测量点电能示值曲线
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpBmCurveYyyymmAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpBmCurveYyyymmService;
import org.fms.eis.webapp.vo.EMpBmCurveYyyymmVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpBmCurveYyyymm")
public class EMpBmCurveYyyymmAction {

    @Autowired
    @Qualifier("EMpBmCurveYyyymmServiceImpl")
    private IEMpBmCurveYyyymmService eMpBmCurveYyyymmService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {
        int i = eMpBmCurveYyyymmService.insert(eMpBmCurveYyyymmVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {
        int i = eMpBmCurveYyyymmService.update(eMpBmCurveYyyymmVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpBmCurveYyyymmVO> deleteList) throws Exception {
        HttpResult httpResult = eMpBmCurveYyyymmService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {
        EMpBmCurveYyyymmVO modelVo = eMpBmCurveYyyymmService.findByKey(eMpBmCurveYyyymmVO);

        if (modelVo != null) {
            return new HttpResult<EMpBmCurveYyyymmVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpBmCurveYyyymmVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {

        return new HttpResultPagination(eMpBmCurveYyyymmVO, eMpBmCurveYyyymmService.findByWhere(eMpBmCurveYyyymmVO));
    }
}
