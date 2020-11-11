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
import org.fms.eis.webapp.vo.PTaskRelVO;
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

        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Integer sYear = Integer.parseInt(format.format(paraBody.getStartDate()));
        Integer eYear = Integer.parseInt(format.format(paraBody.getEndDate()));

        Map<Integer, Integer> rowNumList = new HashMap<>();
        List<EMpXlDayYyyyVO> listVO = new ArrayList<>();
        for (int year = sYear; year <= eYear; year++) {
            int currRowNum = eMpXlDayYyyyService.getCountByWhere(paraBody);
            rowNumList.put(year, currRowNum);
        }
        int startNum = (paraBody.getPageCurrent() - 1) * paraBody.getPageSize();
        int endNum = paraBody.getPageCurrent() * paraBody.getPageSize();
        int currNum = 0;
        paraBody.setPageCurrent(0);
        for (int year = sYear; year <= eYear; year++) {

            int keyRowNum = rowNumList.get(year);
            if (currNum > endNum) {
                if (currNum <= startNum) {
                    continue;
                } else {
                    List<EMpXlDayYyyyVO> currListVO;
                    if (currNum + keyRowNum > endNum) {
                        paraBody.setPageSize(endNum - currNum);
                    } else {
                        paraBody.setPageSize(keyRowNum);
                    }
                    String currTableName = tableName.replace("YYYY", Integer.toString(year));//当前表名
                    paraBody.setTableName(currTableName);
                    currListVO = eMpXlDayYyyyService.getListByWhere(paraBody);
                    listVO.addAll(currListVO);
                }
            } else {
                break;
            }
            currNum += keyRowNum;
        }
        paraBody.setTotalRow(currNum);
        return new HttpResultPagination(paraBody, listVO);
    }
}
