/**
 * 测量点瞬时量曲线表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpSslCurve202009Action.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpSslCurve202009Service;
import org.fms.eis.webapp.vo.EMpSslCurve202009VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpSslCurve202009")
public class EMpSslCurve202009Action {

    @Autowired
    @Qualifier("EMpSslCurve202009ServiceImpl")
    private IEMpSslCurve202009Service eMpSslCurve202009Service;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpSslCurve202009VO eMpSslCurve202009VO) {
        int i = eMpSslCurve202009Service.insert(eMpSslCurve202009VO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpSslCurve202009VO eMpSslCurve202009VO) {
        int i = eMpSslCurve202009Service.update(eMpSslCurve202009VO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpSslCurve202009VO> deleteList) throws Exception {
        HttpResult httpResult = eMpSslCurve202009Service.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpSslCurve202009VO eMpSslCurve202009VO) {
        EMpSslCurve202009VO modelVo = eMpSslCurve202009Service.findByKey(eMpSslCurve202009VO);

        if (modelVo != null) {
            return new HttpResult<EMpSslCurve202009VO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpSslCurve202009VO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpSslCurve202009VO eMpSslCurve202009VO) {

        return new HttpResultPagination(eMpSslCurve202009VO, eMpSslCurve202009Service.findByWhere(eMpSslCurve202009VO));
    }
}
