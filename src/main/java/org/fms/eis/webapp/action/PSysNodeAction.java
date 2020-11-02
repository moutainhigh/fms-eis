/**
 * 系统节点
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.PSysNodeAction.java
 **/
package org.fms.eis.webapp.action;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.riozenc.titanTool.common.json.utils.JSONUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPSysNodeService;
import org.fms.eis.webapp.vo.PDaserverGroupVO;
import org.fms.eis.webapp.vo.PSysNodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@ControllerAdvice
@RequestMapping("PSysNode")
public class PSysNodeAction {

    @Autowired
    @Qualifier("PSysNodeServiceImpl")
    private IPSysNodeService pSysNodeService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody PSysNodeVO pSysNodeVO) {
        int i = pSysNodeService.insert(pSysNodeVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody PSysNodeVO pSysNodeVO) {
        int i = pSysNodeService.update(pSysNodeVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<PSysNodeVO> deleteList) throws Exception {
        HttpResult httpResult = pSysNodeService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody PSysNodeVO pSysNodeVO) {
        PSysNodeVO modelVo = pSysNodeService.findByKey(pSysNodeVO);

        if (modelVo != null) {
            return new HttpResult<PSysNodeVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<PSysNodeVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody PSysNodeVO pSysNodeVO) {

        return new HttpResultPagination(pSysNodeVO, pSysNodeService.findByWhere(pSysNodeVO));
    }

    /**
     *通过采集机组获取分配主机
     * @param pDaserverGroupVO 采集机组ID
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=findByDaserverGroup")
    public HttpResultPagination<?> findByDaserverGroup(@RequestBody PDaserverGroupVO pDaserverGroupVO) {
        List<PSysNodeVO> listVo=pSysNodeService.findByWhere(new PSysNodeVO());
        if (pDaserverGroupVO!=null&&listVo!=null&&listVo.size()>0){
            for (PSysNodeVO item : listVo) {
                //比较采集主机分组 0-未选中 1-选中
                int isSelect=item.getDaGroup()==pDaserverGroupVO.getId()?1:0;
                item.setIsSelect(isSelect);
            }
        }
        return new HttpResultPagination(pDaserverGroupVO, listVo);
    }

    /**
     *批量更新主机的采集机组
     * @param pDaserverGroupVO
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=updateListDaserverGroup")
    public HttpResult<?> updateListDaserverGroup(@RequestBody PDaserverGroupVO pDaserverGroupVO){
        if(pDaserverGroupVO!=null){
            List<PSysNodeVO> sysNodeVOList=pDaserverGroupVO.getListSysNodeVO();
            if(sysNodeVOList!=null&&sysNodeVOList.size()>0){
                for (PSysNodeVO item : sysNodeVOList) {
                    item.setDaGroup(pDaserverGroupVO.getId());
                }
                int num=pSysNodeService.updateListDaserverGroup(sysNodeVOList);
                if (num==sysNodeVOList.size()){
                    return new HttpResult<String>(HttpResult.SUCCESS, "保存成功，保存条数：" + num,null);
                }else{
                    return new HttpResult<String>(HttpResult.ERROR, "保存失败", null);
                }
            }else{
                return new HttpResult<String>(HttpResult.ERROR, "暂无保存内容", null);
            }
        }else{
            return new HttpResult<String>(HttpResult.ERROR, "参数传递错误!", null);
        }
    }
}
