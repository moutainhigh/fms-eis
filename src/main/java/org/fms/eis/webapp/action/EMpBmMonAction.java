/**
 * 测量点月冻结电能示值
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpBmMonAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpBmMonService;
import org.fms.eis.webapp.vo.EMpBmMonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("EMpBmMon")
public class EMpBmMonAction {

    @Autowired
    @Qualifier("EMpBmMonServiceImpl")
    private IEMpBmMonService eMpBmMonService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpBmMonVO eMpBmMonVO) {
        int i = eMpBmMonService.insert(eMpBmMonVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpBmMonVO eMpBmMonVO) {
        int i = eMpBmMonService.update(eMpBmMonVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpBmMonVO> deleteList) throws Exception {
        HttpResult httpResult = eMpBmMonService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpBmMonVO eMpBmMonVO) {
        EMpBmMonVO modelVo = eMpBmMonService.findByKey(eMpBmMonVO);

        if (modelVo != null) {
            return new HttpResult<EMpBmMonVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpBmMonVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpBmMonVO eMpBmMonVO) {

        return new HttpResultPagination(eMpBmMonVO, eMpBmMonService.findByWhere(eMpBmMonVO));
    }
}
