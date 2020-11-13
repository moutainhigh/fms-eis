/**
 * 电量考核单元分钟电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.ESumEngyMinYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IESumEngyMinYyyyService;
import org.fms.eis.webapp.vo.ESumEngyMinYyyyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("ESumEngyMinYyyy")
public class ESumEngyMinYyyyAction {

    @Autowired
    @Qualifier("ESumEngyMinYyyyServiceImpl")
    private IESumEngyMinYyyyService eSumEngyMinYyyyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {
        int i = eSumEngyMinYyyyService.insert(eSumEngyMinYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {
        int i = eSumEngyMinYyyyService.update(eSumEngyMinYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<ESumEngyMinYyyyVO> deleteList) throws Exception {
        HttpResult httpResult = eSumEngyMinYyyyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {
        ESumEngyMinYyyyVO modelVo = eSumEngyMinYyyyService.findByKey(eSumEngyMinYyyyVO);

        if (modelVo != null) {
            return new HttpResult<ESumEngyMinYyyyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<ESumEngyMinYyyyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {

        return new HttpResultPagination(eSumEngyMinYyyyVO, eSumEngyMinYyyyService.findByWhere(eSumEngyMinYyyyVO));
    }
}
