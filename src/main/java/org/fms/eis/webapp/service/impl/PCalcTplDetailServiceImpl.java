/**
 * 计算方案模板明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PCalcTplDetailServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PCalcTplDetailDAO;
import org.fms.eis.webapp.domain.PCalcTplDetailDomain;
import org.fms.eis.webapp.service.IPCalcTplDetailService;
import org.fms.eis.webapp.vo.PCalcTplDetailVO;

import java.util.*;

@TransactionService
public class PCalcTplDetailServiceImpl implements IPCalcTplDetailService {

    @TransactionDAO("read")
    private PCalcTplDetailDAO pCalcTplDetailReadDAO;

    @TransactionDAO("write")
    private PCalcTplDetailDAO pCalcTplDetailWriteDAO;

    @Override
    public int insert(PCalcTplDetailVO pCalcTplDetailVO) {
        return pCalcTplDetailWriteDAO.insert(pCalcTplDetailVO.vo2Domain());
    }

    @Override
    public int update(PCalcTplDetailVO pCalcTplDetailVO) {
        return pCalcTplDetailWriteDAO.update(pCalcTplDetailVO.vo2Domain());
    }

    @Override
    public int delete(PCalcTplDetailVO pCalcTplDetailVO) {
        return pCalcTplDetailWriteDAO.delete(pCalcTplDetailVO.vo2Domain());
    }

    @Override
    public PCalcTplDetailVO findByKey(PCalcTplDetailVO pCalcTplDetailVO) {
        PCalcTplDetailDomain model = pCalcTplDetailReadDAO.findByKey(pCalcTplDetailVO.vo2Domain());
        PCalcTplDetailVO modelVo = new PCalcTplDetailVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PCalcTplDetailVO> findByWhere(PCalcTplDetailVO pCalcTplDetailVO) {
        PCalcTplDetailDomain pCalcTplDetailDomain = pCalcTplDetailVO.vo2Domain();
        List<PCalcTplDetailDomain> lstDomain = pCalcTplDetailReadDAO.findByWhere(pCalcTplDetailDomain);
        pCalcTplDetailVO.setTotalRow(pCalcTplDetailDomain.getTotalRow());
        pCalcTplDetailVO.setPageCurrent(pCalcTplDetailDomain.getPageCurrent());
        pCalcTplDetailVO.setDbName(pCalcTplDetailDomain.getDbName());
        pCalcTplDetailVO.setPageSize(pCalcTplDetailDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PCalcTplDetailVO.class);
    }

}
