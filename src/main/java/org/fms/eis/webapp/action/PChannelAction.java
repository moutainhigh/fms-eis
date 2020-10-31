/**
 * 通道参数表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PChannelAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPChannelService;
import org.fms.eis.webapp.vo.PChannelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PChannel")
public class PChannelAction {

    @Autowired
    @Qualifier("PChannelServiceImpl")
    private IPChannelService pChannelService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PChannelVO pChannelVO) {
        int i = pChannelService.insert(pChannelVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PChannelVO pChannelVO) {
        int i = pChannelService.update(pChannelVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<PChannelVO> deleteList) throws Exception {
        HttpResult httpResult = pChannelService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PChannelVO pChannelVO) {
        PChannelVO modelVo = pChannelService.findByKey(pChannelVO);

        if (modelVo != null) {
            return new HttpResult<PChannelVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PChannelVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PChannelVO pChannelVO) {

        return new HttpResultPagination(pChannelVO, pChannelService.findByWhere(pChannelVO));
    }
}
