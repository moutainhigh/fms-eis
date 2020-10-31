/**
 * 采集任务明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PTaskDetailAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPTaskDetailService;
import org.fms.eis.webapp.vo.PTaskDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PTaskDetail")
public class PTaskDetailAction {

    @Autowired
    @Qualifier("PTaskDetailServiceImpl")
    private IPTaskDetailService pTaskDetailService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PTaskDetailVO pTaskDetailVO) {
        int i = pTaskDetailService.insert(pTaskDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PTaskDetailVO pTaskDetailVO) {
        int i = pTaskDetailService.update(pTaskDetailVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<PTaskDetailVO> deleteList) throws Exception {
        HttpResult httpResult = pTaskDetailService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PTaskDetailVO pTaskDetailVO) {
        PTaskDetailVO modelVo = pTaskDetailService.findByKey(pTaskDetailVO);

        if (modelVo != null) {
            return new HttpResult<PTaskDetailVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PTaskDetailVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PTaskDetailVO pTaskDetailVO) {

        return new HttpResultPagination(pTaskDetailVO, pTaskDetailService.findByWhere(pTaskDetailVO));
    }
}
