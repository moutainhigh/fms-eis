/**
 * 测量点瞬时量曲线表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpSslCurveYyyymmAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpSslCurveYyyymmService;
import org.fms.eis.webapp.vo.EMpSslCurveYyyymmVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpSslCurveYyyymm")
public class EMpSslCurveYyyymmAction {

    @Autowired
    @Qualifier("EMpSslCurveYyyymmServiceImpl")
    private IEMpSslCurveYyyymmService eMpSslCurveYyyymmService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {
        int i = eMpSslCurveYyyymmService.insert(eMpSslCurveYyyymmVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {
        int i = eMpSslCurveYyyymmService.update(eMpSslCurveYyyymmVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpSslCurveYyyymmVO> deleteList) throws Exception {
        HttpResult httpResult = eMpSslCurveYyyymmService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {
        EMpSslCurveYyyymmVO modelVo = eMpSslCurveYyyymmService.findByKey(eMpSslCurveYyyymmVO);

        if (modelVo != null) {
            return new HttpResult<EMpSslCurveYyyymmVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpSslCurveYyyymmVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {

        return new HttpResultPagination(eMpSslCurveYyyymmVO, eMpSslCurveYyyymmService.findByWhere(eMpSslCurveYyyymmVO));
    }
}
