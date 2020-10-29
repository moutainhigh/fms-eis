/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PChnlGroupAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPChnlGroupService;
import org.fms.eis.webapp.vo.PChnlGroupVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PChnlGroup")
public class PChnlGroupAction {

    @Autowired
    @Qualifier("PChnlGroupServiceImpl")
    private IPChnlGroupService pChnlGroupService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PChnlGroupVO _PChnlGroupVO) {
        int i = pChnlGroupService.insert(_PChnlGroupVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PChnlGroupVO _pChnlGroupVO) {
        int i = pChnlGroupService.update(_pChnlGroupVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody PChnlGroupVO _PChnlGroupVO) {
        int i = pChnlGroupService.delete(_PChnlGroupVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PChnlGroupVO _PChnlGroupVO) {
        PChnlGroupVO modelVo = pChnlGroupService.findByKey(_PChnlGroupVO);

        if (modelVo != null)
            return new HttpResult<PChnlGroupVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        else
            return new HttpResult<PChnlGroupVO>(HttpResult.ERROR, "获取失败", null);

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResult<?> findByWhere(@RequestBody PChnlGroupVO _PChnlGroupVO) {
        List<PChnlGroupVO> listVo = pChnlGroupService.findByWhere(_PChnlGroupVO);

        if (listVo != null)
            return new HttpResult<List<PChnlGroupVO>>(HttpResult.SUCCESS, "查询成功", listVo);
        else
            return new HttpResult<List<PChnlGroupVO>>(HttpResult.ERROR, "查询失败", null);

    }
}
