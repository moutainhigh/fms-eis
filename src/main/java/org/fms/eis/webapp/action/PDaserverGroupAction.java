/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PDaserverGroupAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPDaserverGroupService;
import org.fms.eis.webapp.vo.PDaserverGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PDaserverGroup")
public class PDaserverGroupAction {

    @Autowired
    @Qualifier("PDaserverGroupServiceImpl")
    private IPDaserverGroupService pDaserverGroupService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PDaserverGroupVO _PDaserverGroupVO) {
        int i = pDaserverGroupService.insert(_PDaserverGroupVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PDaserverGroupVO _pDaserverGroupVO) {
        int i = pDaserverGroupService.update(_pDaserverGroupVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody PDaserverGroupVO _PDaserverGroupVO) {
        int i = pDaserverGroupService.delete(_PDaserverGroupVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PDaserverGroupVO _PDaserverGroupVO) {
        PDaserverGroupVO modelVo = pDaserverGroupService.findByKey(_PDaserverGroupVO);

        if (modelVo != null)
            return new HttpResult<PDaserverGroupVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        else
            return new HttpResult<PDaserverGroupVO>(HttpResult.ERROR, "获取失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResult<?> findByWhere(@RequestBody PDaserverGroupVO _PDaserverGroupVO) {
        List<PDaserverGroupVO> listVo = pDaserverGroupService.findByWhere(_PDaserverGroupVO);

        if (listVo != null)
            return new HttpResult<List<PDaserverGroupVO>>(HttpResult.SUCCESS, "查询成功", listVo);
        else
            return new HttpResult<List<PDaserverGroupVO>>(HttpResult.ERROR, "查询失败", null);

    }
}
