/**
 * 测量点日冻结需量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpXlDayYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.helper.EMpXlDayYyyyPara;
import org.fms.eis.webapp.service.IEMpXlDayYyyyService;
import org.fms.eis.webapp.vo.EMpXlDayYyyyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

@ControllerAdvice
@RequestMapping("EMpXlDayYyyy")
public class EMpXlDayYyyyAction {

    @Autowired
    @Qualifier("EMpXlDayYyyyServiceImpl")
    private IEMpXlDayYyyyService eMpXlDayYyyyService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody EMpXlDayYyyyVO eMpXlDayYyyyVO) {
        int i = eMpXlDayYyyyService.insert(eMpXlDayYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=update")
    public HttpResult<?> update(@RequestBody EMpXlDayYyyyVO eMpXlDayYyyyVO) {
        int i = eMpXlDayYyyyService.update(eMpXlDayYyyyVO);

        if (i > 0) {
            return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
        } else {
            return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=delete")
    public HttpResult<?> delete(@RequestBody List<EMpXlDayYyyyVO> deleteList) throws Exception {
        HttpResult httpResult = eMpXlDayYyyyService.deleteList(deleteList);
        return httpResult;
    }

    @ResponseBody
    @PostMapping(params = "method=findByKey")
    public HttpResult<?> findByKey(@RequestBody EMpXlDayYyyyVO eMpXlDayYyyyVO) {
        EMpXlDayYyyyVO modelVo = eMpXlDayYyyyService.findByKey(eMpXlDayYyyyVO);

        if (modelVo != null) {
            return new HttpResult<EMpXlDayYyyyVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        } else {
            return new HttpResult<EMpXlDayYyyyVO>(HttpResult.ERROR, "未检索到相关数据!", null);
        }

    }

    @ResponseBody
    @PostMapping(params = "method=findByWhere")
    public HttpResultPagination<?> findByWhere(@RequestBody EMpXlDayYyyyVO eMpXlDayYyyyVO) {

        return new HttpResultPagination(eMpXlDayYyyyVO, eMpXlDayYyyyService.findByWhere(eMpXlDayYyyyVO));
    }

    /**
     * 获取基础数据查询日需量数据
     *
     * @param paraBody
     * @return
     */
    @ResponseBody
    @PostMapping(params = "method=findByEMpXlDayYyyy")
    public HttpResultPagination<?> findByEMpXlDayYyyy(@RequestBody EMpXlDayYyyyPara paraBody) {
        //JSONObject obj = JSONObject.parseObject(body);
        //Date startDate = obj.getDate("startDate");//获取开始时间
        //Date endDate = obj.getDate("endDate");//获取结束时间
        //Integer pageCurrent = obj.getInteger("pageCurrent");//当前页
        //Integer pageSize = obj.getInteger("pageSize");//每页条数

        String sqlDbTable = "E_MP_XL_DAY_YYYY";//测量点日冻结需量表
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Integer sYear = Integer.parseInt(format.format(paraBody.getStartDate()));
        Integer eYear = Integer.parseInt(format.format(paraBody.getEndDate()));

        EMpXlDayYyyyVO conditionVO=new EMpXlDayYyyyVO();
        List<EMpXlDayYyyyVO> listVO = new ArrayList<>();
        for (int year = sYear; year <= eYear; year++) {

            conditionVO.setPageCurrent(sYear);
            // conditionVO.setPageSize();
        }


        return new HttpResultPagination(null, eMpXlDayYyyyService.findByWhere(null));
    }

}
