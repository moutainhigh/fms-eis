/**
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.DropSqlAction.java
 **/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IDropSqlService;
import org.fms.eis.webapp.vo.DropSqlVO;
import org.fms.eis.webapp.vo.SystemCommonConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@RequestMapping("DropSql")
public class DropSqlAction {

    @Autowired
    @Qualifier("dropSqlServiceImpl")
    private IDropSqlService dropSqlService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody DropSqlVO dropSqlVO) {
        int i = dropSqlService.insert(dropSqlVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody DropSqlVO dropSqlVO) {
        int i = dropSqlService.update(dropSqlVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<DropSqlVO> deleteList) throws Exception {
        HttpResult httpResult = dropSqlService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody DropSqlVO dropSqlVO) {
        DropSqlVO modelVo = dropSqlService.findByKey(dropSqlVO);

        if (modelVo != null) {
            return new HttpResult<DropSqlVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<DropSqlVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody DropSqlVO dropSqlVO) {

        return new HttpResultPagination(dropSqlVO, dropSqlService.findByWhere(dropSqlVO));
    }

    /**
     * 获取sql查询的字典
     *
     * @param dropCode [DROP_SQL]表的DROP_CODE
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=getBaseDropDict")
    public HttpResult<?> getBaseDropDict(@RequestBody String dropCode) {
        List<SystemCommonConfigVO> dictList = new ArrayList<>();
        if (dropCode != null) {
            DropSqlVO modelVO = new DropSqlVO();
            modelVO.setDropCode(dropCode);
            List<DropSqlVO> listVO = dropSqlService.findByWhere(modelVO);
            if (listVO != null && listVO.size() > 0) {
                dictList = dropSqlService.getBaseDropDict(listVO.get(0).getDropSql());
            }
        }
        return new HttpResult<>(HttpResult.SUCCESS, "获取成功!", dictList);
    }
}
