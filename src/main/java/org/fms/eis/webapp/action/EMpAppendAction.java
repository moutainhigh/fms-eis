/**
 * 追加电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpAppendAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpAppendService;
import org.fms.eis.webapp.vo.EMpAppendVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpAppend")
public class EMpAppendAction {

    @Autowired
    @Qualifier("EMpAppendServiceImpl")
    private IEMpAppendService eMpAppendService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpAppendVO eMpAppendVO) {
        int i = eMpAppendService.insert(eMpAppendVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpAppendVO eMpAppendVO) {
        int i = eMpAppendService.update(eMpAppendVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpAppendVO> deleteList) throws Exception {
        HttpResult httpResult = eMpAppendService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpAppendVO eMpAppendVO) {
        EMpAppendVO modelVo = eMpAppendService.findByKey(eMpAppendVO);

        if (modelVo != null) {
            return new HttpResult<EMpAppendVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpAppendVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpAppendVO eMpAppendVO) {

        return new HttpResultPagination(eMpAppendVO, eMpAppendService.findByWhere(eMpAppendVO));
    }
}
