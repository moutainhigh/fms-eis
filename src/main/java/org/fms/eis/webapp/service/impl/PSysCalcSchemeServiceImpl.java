/**
 * 计算方案
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PSysCalcSchemeServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PSysCalcSchemeDAO;
import org.fms.eis.webapp.domain.PSysCalcSchemeDomain;
import org.fms.eis.webapp.service.IPSysCalcSchemeService;
import org.fms.eis.webapp.vo.PSysCalcSchemeVO;

import java.util.*;

@TransactionService
public class PSysCalcSchemeServiceImpl implements IPSysCalcSchemeService {

    @TransactionDAO("read")
    private PSysCalcSchemeDAO pSysCalcSchemeReadDAO;

    @TransactionDAO("write")
    private PSysCalcSchemeDAO pSysCalcSchemeWriteDAO;

    @Override
    public int insert(PSysCalcSchemeVO pSysCalcSchemeVO) {
        return pSysCalcSchemeWriteDAO.insert(pSysCalcSchemeVO.vo2Domain());
    }

    @Override
    public int update(PSysCalcSchemeVO pSysCalcSchemeVO) {
        return pSysCalcSchemeWriteDAO.update(pSysCalcSchemeVO.vo2Domain());
    }

    @Override
    public int delete(PSysCalcSchemeVO pSysCalcSchemeVO) {
        return pSysCalcSchemeWriteDAO.delete(pSysCalcSchemeVO.vo2Domain());
    }

    @Override
    public PSysCalcSchemeVO findByKey(PSysCalcSchemeVO pSysCalcSchemeVO) {
        PSysCalcSchemeDomain model = pSysCalcSchemeReadDAO.findByKey(pSysCalcSchemeVO.vo2Domain());
        PSysCalcSchemeVO modelVo = new PSysCalcSchemeVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PSysCalcSchemeVO> findByWhere(PSysCalcSchemeVO pSysCalcSchemeVO) {
        PSysCalcSchemeDomain pSysCalcSchemeDomain = pSysCalcSchemeVO.vo2Domain();
        List<PSysCalcSchemeDomain> lstDomain = pSysCalcSchemeReadDAO.findByWhere(pSysCalcSchemeDomain);
        pSysCalcSchemeVO.setTotalRow(pSysCalcSchemeDomain.getTotalRow());
        pSysCalcSchemeVO.setPageCurrent(pSysCalcSchemeDomain.getPageCurrent());
        pSysCalcSchemeVO.setDbName(pSysCalcSchemeDomain.getDbName());
        pSysCalcSchemeVO.setPageSize(pSysCalcSchemeDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PSysCalcSchemeVO.class);
    }

}
