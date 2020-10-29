/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PSysNodeAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
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
    public HttpResult<?> insert(@RequestBody PSysNodeVO _PSysNodeVO) {
        int i = pSysNodeService.insert(_PSysNodeVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PSysNodeVO _pSysNodeVO) {
        int i = pSysNodeService.update(_pSysNodeVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody PSysNodeVO _PSysNodeVO) {
        int i = pSysNodeService.delete(_PSysNodeVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PSysNodeVO _PSysNodeVO) {
        PSysNodeVO modelVo = pSysNodeService.findByKey(_PSysNodeVO);

        if (modelVo != null)
            return new HttpResult<PSysNodeVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        else
            return new HttpResult<PSysNodeVO>(HttpResult.ERROR, "获取失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResult<?> findByWhere(@RequestBody PSysNodeVO _PSysNodeVO) {
        List<PSysNodeVO> listVo = pSysNodeService.findByWhere(_PSysNodeVO);

        if (listVo != null)
            return new HttpResult<List<PSysNodeVO>>(HttpResult.SUCCESS, "查询成功", listVo);
        else
            return new HttpResult<List<PSysNodeVO>>(HttpResult.ERROR, "查询失败", null);

    }
}
