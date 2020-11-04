/**
 * 测量点电能示值曲线
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpBmCurve202009Action.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpBmCurve202009Service;
import org.fms.eis.webapp.vo.EMpBmCurve202009VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpBmCurve202009")
public class EMpBmCurve202009Action {

    @Autowired
    @Qualifier("EMpBmCurve202009ServiceImpl")
    private IEMpBmCurve202009Service eMpBmCurve202009Service;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpBmCurve202009VO eMpBmCurve202009VO) {
        int i = eMpBmCurve202009Service.insert(eMpBmCurve202009VO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpBmCurve202009VO eMpBmCurve202009VO) {
        int i = eMpBmCurve202009Service.update(eMpBmCurve202009VO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpBmCurve202009VO> deleteList) throws Exception {
        HttpResult httpResult = eMpBmCurve202009Service.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpBmCurve202009VO eMpBmCurve202009VO) {
        EMpBmCurve202009VO modelVo = eMpBmCurve202009Service.findByKey(eMpBmCurve202009VO);

        if (modelVo != null) {
            return new HttpResult<EMpBmCurve202009VO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpBmCurve202009VO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpBmCurve202009VO eMpBmCurve202009VO) {

        return new HttpResultPagination(eMpBmCurve202009VO, eMpBmCurve202009Service.findByWhere(eMpBmCurve202009VO));
    }
}
