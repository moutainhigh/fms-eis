/**
 * 采集主机组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PDaserverGroupAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
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
    public HttpResult<?> insert(@RequestBody PDaserverGroupVO pDaserverGroupVO) {
        int i = pDaserverGroupService.insert(pDaserverGroupVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PDaserverGroupVO pDaserverGroupVO) {
        int i = pDaserverGroupService.update(pDaserverGroupVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody PDaserverGroupVO pDaserverGroupVO) {
        int i = pDaserverGroupService.delete(pDaserverGroupVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PDaserverGroupVO pDaserverGroupVO) {
        PDaserverGroupVO modelVo = pDaserverGroupService.findByKey(pDaserverGroupVO);

        if (modelVo != null) {
            return new HttpResult<PDaserverGroupVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PDaserverGroupVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PDaserverGroupVO pDaserverGroupVO) {

        return new HttpResultPagination(pDaserverGroupVO, pDaserverGroupService.findByWhere(pDaserverGroupVO));
    }
}
