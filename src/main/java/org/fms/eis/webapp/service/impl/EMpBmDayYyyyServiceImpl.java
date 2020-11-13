/**
 * 测量点日冻结电能示值
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpBmDayYyyyServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpBmDayYyyyDAO;
import org.fms.eis.webapp.domain.EMpBmDayYyyyDomain;
import org.fms.eis.webapp.service.IEMpBmDayYyyyService;
import org.fms.eis.webapp.vo.EMpBmDayYyyyVO;

import java.util.*;

@TransactionService
public class EMpBmDayYyyyServiceImpl implements IEMpBmDayYyyyService {

    @TransactionDAO("read")
    private EMpBmDayYyyyDAO eMpBmDayYyyyReadDAO;

    @TransactionDAO("write")
    private EMpBmDayYyyyDAO eMpBmDayYyyyWriteDAO;

    @Override
    public int insert(EMpBmDayYyyyVO eMpBmDayYyyyVO) {
        return eMpBmDayYyyyWriteDAO.insert(eMpBmDayYyyyVO.vo2Domain());
    }

    @Override
    public int update(EMpBmDayYyyyVO eMpBmDayYyyyVO) {
        return eMpBmDayYyyyWriteDAO.update(eMpBmDayYyyyVO.vo2Domain());
    }

    @Override
    public int delete(EMpBmDayYyyyVO eMpBmDayYyyyVO) {
        return eMpBmDayYyyyWriteDAO.delete(eMpBmDayYyyyVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpBmDayYyyyVO> deleteList) throws Exception {
        int num = eMpBmDayYyyyWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpBmDayYyyyDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpBmDayYyyyVO findByKey(EMpBmDayYyyyVO eMpBmDayYyyyVO) {
        EMpBmDayYyyyDomain model = eMpBmDayYyyyReadDAO.findByKey(eMpBmDayYyyyVO.vo2Domain());
        EMpBmDayYyyyVO modelVo = new EMpBmDayYyyyVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpBmDayYyyyVO> findByWhere(EMpBmDayYyyyVO eMpBmDayYyyyVO) {
        EMpBmDayYyyyDomain eMpBmDayYyyyDomain = eMpBmDayYyyyVO.vo2Domain();
        List<EMpBmDayYyyyDomain> lstDomain = eMpBmDayYyyyReadDAO.findByWhere(eMpBmDayYyyyDomain);
        eMpBmDayYyyyVO.setTotalRow(eMpBmDayYyyyDomain.getTotalRow());
        eMpBmDayYyyyVO.setPageCurrent(eMpBmDayYyyyDomain.getPageCurrent());
        eMpBmDayYyyyVO.setDbName(eMpBmDayYyyyDomain.getDbName());
        eMpBmDayYyyyVO.setPageSize(eMpBmDayYyyyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpBmDayYyyyVO.class);
    }

}
