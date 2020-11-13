/**
 * 测量点日冻结需量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpXlDayYyyyServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import jdk.nashorn.internal.ir.ReturnNode;
import org.fms.eis.webapp.dao.EMpXlDayYyyyDAO;
import org.fms.eis.webapp.domain.EMpXlDayYyyyDomain;
import org.fms.eis.webapp.helper.EMpXlDayYyyyPara;
import org.fms.eis.webapp.service.IEMpXlDayYyyyService;
import org.fms.eis.webapp.vo.EMpXlDayYyyyVO;

import java.util.*;

@TransactionService
public class EMpXlDayYyyyServiceImpl implements IEMpXlDayYyyyService {

    @TransactionDAO("read")
    private EMpXlDayYyyyDAO eMpXlDayYyyyReadDAO;

    @TransactionDAO("write")
    private EMpXlDayYyyyDAO eMpXlDayYyyyWriteDAO;

    @Override
    public int insert(EMpXlDayYyyyVO eMpXlDayYyyyVO) {
        return eMpXlDayYyyyWriteDAO.insert(eMpXlDayYyyyVO.vo2Domain());
    }

    @Override
    public int update(EMpXlDayYyyyVO eMpXlDayYyyyVO) {
        return eMpXlDayYyyyWriteDAO.update(eMpXlDayYyyyVO.vo2Domain());
    }

    @Override
    public int delete(EMpXlDayYyyyVO eMpXlDayYyyyVO) {
        return eMpXlDayYyyyWriteDAO.delete(eMpXlDayYyyyVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpXlDayYyyyVO> deleteList) throws Exception {
        int num = eMpXlDayYyyyWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpXlDayYyyyDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpXlDayYyyyVO findByKey(EMpXlDayYyyyVO eMpXlDayYyyyVO) {
        EMpXlDayYyyyDomain model = eMpXlDayYyyyReadDAO.findByKey(eMpXlDayYyyyVO.vo2Domain());
        EMpXlDayYyyyVO modelVo = new EMpXlDayYyyyVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpXlDayYyyyVO> findByWhere(EMpXlDayYyyyVO eMpXlDayYyyyVO) {
        EMpXlDayYyyyDomain eMpXlDayYyyyDomain = eMpXlDayYyyyVO.vo2Domain();
        List<EMpXlDayYyyyDomain> lstDomain = eMpXlDayYyyyReadDAO.findByWhere(eMpXlDayYyyyDomain);
        eMpXlDayYyyyVO.setTotalRow(eMpXlDayYyyyDomain.getTotalRow());
        eMpXlDayYyyyVO.setPageCurrent(eMpXlDayYyyyDomain.getPageCurrent());
        eMpXlDayYyyyVO.setDbName(eMpXlDayYyyyDomain.getDbName());
        eMpXlDayYyyyVO.setPageSize(eMpXlDayYyyyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpXlDayYyyyVO.class);
    }

    @Override
    public int getCountByWhere(EMpXlDayYyyyPara para) {
        return eMpXlDayYyyyReadDAO.getCountByWhere(para);
    }

    @Override
    public List<EMpXlDayYyyyVO> getListByWhere(EMpXlDayYyyyPara para) {
        List<EMpXlDayYyyyDomain> lstDomain = eMpXlDayYyyyReadDAO.getListByWhere(para);
        return ReflectUtil.cast(lstDomain, EMpXlDayYyyyVO.class);
    }

    @Override
    public int insertList(List<EMpXlDayYyyyVO> list) {
        return eMpXlDayYyyyWriteDAO.insertList(ReflectUtil.cast(list, EMpXlDayYyyyVO.class));
    }
}
