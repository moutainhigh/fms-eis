/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PSysCalcSchemeServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PSysCalcSchemeDAO;
import org.fms.eis.webapp.domain.PSysCalcSchemeDomain;
import org.fms.eis.webapp.service.IPSysCalcSchemeService;
import org.fms.eis.webapp.vo.PSysCalcSchemeVO;

import java.util.*;

@TransactionService
public class PSysCalcSchemeServiceImpl implements IPSysCalcSchemeService {

    @TransactionDAO("read")
    private PSysCalcSchemeDAO testReadDAO;

    @TransactionDAO("write")
    private PSysCalcSchemeDAO testWriteDAO;

    @Override
    public int insert(PSysCalcSchemeVO testVO) {
        return testWriteDAO.insert(testVO.vo2Domain());
    }

    @Override
    public int update(PSysCalcSchemeVO testVO) {
        return testWriteDAO.update(testVO.vo2Domain());
    }

    @Override
    public int delete(PSysCalcSchemeVO testVO) {
        return testWriteDAO.delete(testVO.vo2Domain());
    }

    @Override
    public PSysCalcSchemeVO findByKey(PSysCalcSchemeVO testVO) {
        PSysCalcSchemeDomain model = testReadDAO.findByKey(testVO.vo2Domain());
        PSysCalcSchemeVO modelVo = new PSysCalcSchemeVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PSysCalcSchemeVO> findByWhere(PSysCalcSchemeVO testVO) {
        List<PSysCalcSchemeDomain> lstDomain = testReadDAO.findByWhere(testVO.vo2Domain());
        List<PSysCalcSchemeVO> lstVo = new ArrayList<PSysCalcSchemeVO>();
        ;
        for (PSysCalcSchemeDomain item : lstDomain) {
            lstVo.add(item.domain2VO());
        }
        return lstVo;
    }

}
