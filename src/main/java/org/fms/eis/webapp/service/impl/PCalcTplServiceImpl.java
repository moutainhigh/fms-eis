/**
 * 计算方案模板
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PCalcTplServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PCalcTplDAO;
import org.fms.eis.webapp.domain.PCalcTplDomain;
import org.fms.eis.webapp.service.IPCalcTplService;
import org.fms.eis.webapp.vo.PCalcTplVO;

import java.util.*;

@TransactionService
public class PCalcTplServiceImpl implements IPCalcTplService {

    @TransactionDAO("read")
    private PCalcTplDAO pCalcTplReadDAO;

    @TransactionDAO("write")
    private PCalcTplDAO pCalcTplWriteDAO;

    @Override
    public int insert(PCalcTplVO pCalcTplVO) {
        return pCalcTplWriteDAO.insert(pCalcTplVO.vo2Domain());
    }

    @Override
    public int update(PCalcTplVO pCalcTplVO) {
        return pCalcTplWriteDAO.update(pCalcTplVO.vo2Domain());
    }

    @Override
    public int delete(PCalcTplVO pCalcTplVO) {
        return pCalcTplWriteDAO.delete(pCalcTplVO.vo2Domain());
    }

    @Override
    public PCalcTplVO findByKey(PCalcTplVO pCalcTplVO) {
        PCalcTplDomain model = pCalcTplReadDAO.findByKey(pCalcTplVO.vo2Domain());
        PCalcTplVO modelVo = new PCalcTplVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PCalcTplVO> findByWhere(PCalcTplVO pCalcTplVO) {
        PCalcTplDomain pCalcTplDomain = pCalcTplVO.vo2Domain();
        List<PCalcTplDomain> lstDomain = pCalcTplReadDAO.findByWhere(pCalcTplDomain);
        pCalcTplVO.setTotalRow(pCalcTplDomain.getTotalRow());
        pCalcTplVO.setPageCurrent(pCalcTplDomain.getPageCurrent());
        pCalcTplVO.setDbName(pCalcTplDomain.getDbName());
        pCalcTplVO.setPageSize(pCalcTplDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PCalcTplVO.class);
    }

}
