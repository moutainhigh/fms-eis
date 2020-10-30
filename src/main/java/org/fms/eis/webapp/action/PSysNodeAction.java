/**
 * 系统节点
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PSysNodeAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPSysNodeService;
import org.fms.eis.webapp.vo.PSysNodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PSysNode")
public class PSysNodeAction {

    @Autowired
    @Qualifier("PSysNodeServiceImpl")
    private IPSysNodeService pSysNodeService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PSysNodeVO pSysNodeVO) {
        int i = pSysNodeService.insert(pSysNodeVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PSysNodeVO pSysNodeVO) {
        int i = pSysNodeService.update(pSysNodeVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody PSysNodeVO pSysNodeVO) {
        int i = pSysNodeService.delete(pSysNodeVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PSysNodeVO pSysNodeVO) {
        PSysNodeVO modelVo = pSysNodeService.findByKey(pSysNodeVO);

        if (modelVo != null) {
            return new HttpResult<PSysNodeVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PSysNodeVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PSysNodeVO pSysNodeVO) {

        return new HttpResultPagination(pSysNodeVO, pSysNodeService.findByWhere(pSysNodeVO));
    }
}
