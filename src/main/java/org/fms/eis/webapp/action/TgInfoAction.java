/**
 * 台区表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.TgInfoAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.ITgInfoService;
import org.fms.eis.webapp.vo.TgInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("TgInfo")
public class TgInfoAction {

    @Autowired
    @Qualifier("tgInfoServiceImpl")
    private ITgInfoService tgInfoService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody TgInfoVO tgInfoVO) {
        int i = tgInfoService.insert(tgInfoVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody TgInfoVO tgInfoVO) {
        int i = tgInfoService.update(tgInfoVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody TgInfoVO tgInfoVO) {
        int i = tgInfoService.delete(tgInfoVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody TgInfoVO tgInfoVO) {
        TgInfoVO modelVo = tgInfoService.findByKey(tgInfoVO);

        if (modelVo != null) {
            return new HttpResult<TgInfoVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<TgInfoVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody TgInfoVO tgInfoVO) {

        return new HttpResultPagination(tgInfoVO, tgInfoService.findByWhere(tgInfoVO));
    }
}
