/**
 * 计算任务
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PCalcTaskAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPCalcTaskService;
import org.fms.eis.webapp.vo.PCalcTaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PCalcTask")
public class PCalcTaskAction {

    @Autowired
    @Qualifier("PCalcTaskServiceImpl")
    private IPCalcTaskService pCalcTaskService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PCalcTaskVO pCalcTaskVO) {
        int i = pCalcTaskService.insert(pCalcTaskVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PCalcTaskVO pCalcTaskVO) {
        int i = pCalcTaskService.update(pCalcTaskVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody PCalcTaskVO pCalcTaskVO) {
        int i = pCalcTaskService.delete(pCalcTaskVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PCalcTaskVO pCalcTaskVO) {
        PCalcTaskVO modelVo = pCalcTaskService.findByKey(pCalcTaskVO);

        if (modelVo != null) {
            return new HttpResult<PCalcTaskVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PCalcTaskVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PCalcTaskVO pCalcTaskVO) {

        return new HttpResultPagination(pCalcTaskVO, pCalcTaskService.findByWhere(pCalcTaskVO));
    }
}
