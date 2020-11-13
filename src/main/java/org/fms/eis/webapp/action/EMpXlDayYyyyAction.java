/**
 * 测量点日冻结需量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.action.EMpXlDayYyyyAction.java
 **/
package org.fms.eis.webapp.action;

import com.alibaba.fastjson.JSONObject;
import com.riozenc.titanTool.mybatis.pagination.Page;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.helper.EMpXlDayYyyyPara;
import org.fms.eis.webapp.helper.UtilityHelper;
import org.fms.eis.webapp.service.IEMpXlDayYyyyService;
import org.fms.eis.webapp.vo.EMpXlDayYyyyVO;
import org.fms.eis.webapp.vo.PTaskRelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.print.SunPageSelection;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.*;

@ControllerAdvice
@RequestMapping("EMpXlDayYyyy")
public class EMpXlDayYyyyAction {

    @Autowired
    @Qualifier("EMpXlDayYyyyServiceImpl")
    private IEMpXlDayYyyyService eMpXlDayYyyyService;

    //测量点日冻结需量表
    private final String tableName = "E_MP_XL_DAY_YYYY";

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
        Page page = new Page();
        page.setPageCurrent(paraBody.getPageCurrent());
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Integer sYear = Integer.parseInt(format.format(paraBody.getStartDate()));//开始年份
        Integer eYear = Integer.parseInt(format.format(paraBody.getEndDate()));//结束年份
        Map<Integer, Integer> yearRowNumMap = new HashMap<>();//map(年,条目数)
        List<EMpXlDayYyyyVO> listVO = new ArrayList<>();
        for (int year = sYear; year <= eYear; year++) {
            paraBody.setTableName(tableName.replace("YYYY", Integer.toString(year)));//当前表名
            int currRowNum = eMpXlDayYyyyService.getCountByWhere(paraBody);
            yearRowNumMap.put(year, currRowNum);
        }
        int startNum = (paraBody.getPageCurrent() - 1) * paraBody.getPageSize();//>startNum
        int endNum = paraBody.getPageCurrent() * paraBody.getPageSize();//<=endNum
        int currNum = 0;//总条目数
        for (Integer key : yearRowNumMap.keySet()) {
            int keyRowNum = yearRowNumMap.get(key);//当前年份符合条目数
            if (currNum + keyRowNum > startNum) {
                int skipNum = 0;
                int takeNum = 0;
                if (currNum > startNum) {
                    skipNum = 0;
                    takeNum = currNum + keyRowNum > endNum ? (endNum - currNum) : keyRowNum;
                } else {
                    skipNum = startNum - currNum;
                    takeNum = currNum + keyRowNum > endNum ? (endNum - currNum - skipNum) : keyRowNum - skipNum;
                }
                paraBody.setSkipNum(skipNum);//跳过多少条
                paraBody.setTakeNum(takeNum);//设置获取条目数
                paraBody.setTableName(tableName.replace("YYYY", Integer.toString(key)));//当前表名
                List<EMpXlDayYyyyVO> currListVO = eMpXlDayYyyyService.getListByWhere(paraBody);
                listVO.addAll(currListVO);
            }
            currNum += keyRowNum;
        }
        page.setTotalRow(currNum);
        return new HttpResultPagination(page, listVO);
    }

    @ResponseBody
    @PostMapping(params = "method=addTestRow")
    public HttpResult<?> addTestRow(@RequestBody String body) {
        JSONObject obj = JSONObject.parseObject(body);
        String tableName = obj.getString("tableName");
        Integer time = obj.getInteger("time");
        List<EMpXlDayYyyyVO> list = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            //Integer num= UtilityHelper.getDaysOfMonth(UtilityHelper.getDate(time,i,1));
            for (int j = 1; j <= 28; j++) {
                Random random = new Random();

                EMpXlDayYyyyVO model = new EMpXlDayYyyyVO();
                model.setMpedId(BigDecimal.valueOf(1));
                model.setDataTime(UtilityHelper.getDate(time, i, j));
                model.setColTime(UtilityHelper.getDate(time, i, j));
                model.setP1r0(BigDecimal.valueOf(j));
                model.setP2r0(BigDecimal.valueOf(j));

                model.setP1r0Dt(tableName + time);
                list.add(model);
            }
        }
        eMpXlDayYyyyService.insertList(list);
        return new HttpResult<String>(HttpResult.SUCCESS, "获取成功", "");
    }
}
