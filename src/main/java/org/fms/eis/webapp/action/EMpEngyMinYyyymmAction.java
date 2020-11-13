/**
 * 测量点分钟电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpEngyMinYyyymmAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpEngyMinYyyymmService;
import org.fms.eis.webapp.vo.EMpEngyMinYyyymmVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpEngyMinYyyymm")
public class EMpEngyMinYyyymmAction {

    @Autowired
    @Qualifier("EMpEngyMinYyyymmServiceImpl")
    private IEMpEngyMinYyyymmService eMpEngyMinYyyymmService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {
        int i = eMpEngyMinYyyymmService.insert(eMpEngyMinYyyymmVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {
        int i = eMpEngyMinYyyymmService.update(eMpEngyMinYyyymmVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpEngyMinYyyymmVO> deleteList) throws Exception {
        HttpResult httpResult = eMpEngyMinYyyymmService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {
        EMpEngyMinYyyymmVO modelVo = eMpEngyMinYyyymmService.findByKey(eMpEngyMinYyyymmVO);

        if (modelVo != null) {
            return new HttpResult<EMpEngyMinYyyymmVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpEngyMinYyyymmVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {

        return new HttpResultPagination(eMpEngyMinYyyymmVO, eMpEngyMinYyyymmService.findByWhere(eMpEngyMinYyyymmVO));
    }
}
