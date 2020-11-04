/**
 * 测量点日电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpEngyDay2020Action.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpEngyDay2020Service;
import org.fms.eis.webapp.vo.EMpEngyDay2020VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpEngyDay2020")
public class EMpEngyDay2020Action {

    @Autowired
    @Qualifier("EMpEngyDay2020ServiceImpl")
    private IEMpEngyDay2020Service eMpEngyDay2020Service;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpEngyDay2020VO eMpEngyDay2020VO) {
        int i = eMpEngyDay2020Service.insert(eMpEngyDay2020VO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpEngyDay2020VO eMpEngyDay2020VO) {
        int i = eMpEngyDay2020Service.update(eMpEngyDay2020VO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpEngyDay2020VO> deleteList) throws Exception {
        HttpResult httpResult = eMpEngyDay2020Service.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpEngyDay2020VO eMpEngyDay2020VO) {
        EMpEngyDay2020VO modelVo = eMpEngyDay2020Service.findByKey(eMpEngyDay2020VO);

        if (modelVo != null) {
            return new HttpResult<EMpEngyDay2020VO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpEngyDay2020VO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpEngyDay2020VO eMpEngyDay2020VO) {

        return new HttpResultPagination(eMpEngyDay2020VO, eMpEngyDay2020Service.findByWhere(eMpEngyDay2020VO));
    }
}
