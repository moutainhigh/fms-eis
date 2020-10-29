/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PChnlGpDasRelaServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PChnlGpDasRelaDAO;
import org.fms.eis.webapp.domain.PChnlGpDasRelaDomain;
import org.fms.eis.webapp.service.IPChnlGpDasRelaService;
import org.fms.eis.webapp.vo.PChnlGpDasRelaVO;

import java.util.*;

@TransactionService
public class PChnlGpDasRelaServiceImpl implements IPChnlGpDasRelaService {

    @TransactionDAO("read")
    private PChnlGpDasRelaDAO testReadDAO;

    @TransactionDAO("write")
    private PChnlGpDasRelaDAO testWriteDAO;

    @Override
    public int insert(PChnlGpDasRelaVO testVO) {
        return testWriteDAO.insert(testVO.vo2Domain());
    }

    @Override
    public int update(PChnlGpDasRelaVO testVO) {
        return testWriteDAO.update(testVO.vo2Domain());
    }

    @Override
    public int delete(PChnlGpDasRelaVO testVO) {
        return testWriteDAO.delete(testVO.vo2Domain());
    }

    @Override
    public PChnlGpDasRelaVO findByKey(PChnlGpDasRelaVO testVO) {
        PChnlGpDasRelaDomain model = testReadDAO.findByKey(testVO.vo2Domain());
        PChnlGpDasRelaVO modelVo = new PChnlGpDasRelaVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PChnlGpDasRelaVO> findByWhere(PChnlGpDasRelaVO testVO) {
        List<PChnlGpDasRelaDomain> lstDomain = testReadDAO.findByWhere(testVO.vo2Domain());
        List<PChnlGpDasRelaVO> lstVo = new ArrayList<PChnlGpDasRelaVO>();
        ;
        for (PChnlGpDasRelaDomain item : lstDomain) {
            lstVo.add(item.domain2VO());
        }
        return lstVo;
    }

}
