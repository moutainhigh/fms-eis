/**
 * 采集任务模板明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PTaskTplDetailAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPTaskTplDetailService;
import org.fms.eis.webapp.vo.PTaskTplDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PTaskTplDetail")
public class PTaskTplDetailAction {

    @Autowired
    @Qualifier("PTaskTplDetailServiceImpl")
    private IPTaskTplDetailService pTaskTplDetailService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PTaskTplDetailVO pTaskTplDetailVO) {
        int i = pTaskTplDetailService.insert(pTaskTplDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PTaskTplDetailVO pTaskTplDetailVO) {
        int i = pTaskTplDetailService.update(pTaskTplDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody PTaskTplDetailVO pTaskTplDetailVO) {
        int i = pTaskTplDetailService.delete(pTaskTplDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PTaskTplDetailVO pTaskTplDetailVO) {
        PTaskTplDetailVO modelVo = pTaskTplDetailService.findByKey(pTaskTplDetailVO);

        if (modelVo != null) {
            return new HttpResult<PTaskTplDetailVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PTaskTplDetailVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PTaskTplDetailVO pTaskTplDetailVO) {

        return new HttpResultPagination(pTaskTplDetailVO, pTaskTplDetailService.findByWhere(pTaskTplDetailVO));
    }
}
