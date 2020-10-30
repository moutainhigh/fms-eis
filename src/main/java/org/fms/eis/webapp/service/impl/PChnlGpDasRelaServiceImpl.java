/**
 * 通道组主机关系
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PChnlGpDasRelaServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PChnlGpDasRelaDAO;
import org.fms.eis.webapp.domain.PChnlGpDasRelaDomain;
import org.fms.eis.webapp.service.IPChnlGpDasRelaService;
import org.fms.eis.webapp.vo.PChnlGpDasRelaVO;

import java.util.*;

@TransactionService
public class PChnlGpDasRelaServiceImpl implements IPChnlGpDasRelaService {

    @TransactionDAO("read")
    private PChnlGpDasRelaDAO pChnlGpDasRelaReadDAO;

    @TransactionDAO("write")
    private PChnlGpDasRelaDAO pChnlGpDasRelaWriteDAO;

    @Override
    public int insert(PChnlGpDasRelaVO pChnlGpDasRelaVO) {
        return pChnlGpDasRelaWriteDAO.insert(pChnlGpDasRelaVO.vo2Domain());
    }

    @Override
    public int update(PChnlGpDasRelaVO pChnlGpDasRelaVO) {
        return pChnlGpDasRelaWriteDAO.update(pChnlGpDasRelaVO.vo2Domain());
    }

    @Override
    public int delete(PChnlGpDasRelaVO pChnlGpDasRelaVO) {
        return pChnlGpDasRelaWriteDAO.delete(pChnlGpDasRelaVO.vo2Domain());
    }

    @Override
    public PChnlGpDasRelaVO findByKey(PChnlGpDasRelaVO pChnlGpDasRelaVO) {
        PChnlGpDasRelaDomain model = pChnlGpDasRelaReadDAO.findByKey(pChnlGpDasRelaVO.vo2Domain());
        PChnlGpDasRelaVO modelVo = new PChnlGpDasRelaVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PChnlGpDasRelaVO> findByWhere(PChnlGpDasRelaVO pChnlGpDasRelaVO) {
        PChnlGpDasRelaDomain pChnlGpDasRelaDomain = pChnlGpDasRelaVO.vo2Domain();
        List<PChnlGpDasRelaDomain> lstDomain = pChnlGpDasRelaReadDAO.findByWhere(pChnlGpDasRelaDomain);
        pChnlGpDasRelaVO.setTotalRow(pChnlGpDasRelaDomain.getTotalRow());
        pChnlGpDasRelaVO.setPageCurrent(pChnlGpDasRelaDomain.getPageCurrent());
        pChnlGpDasRelaVO.setDbName(pChnlGpDasRelaDomain.getDbName());
        pChnlGpDasRelaVO.setPageSize(pChnlGpDasRelaDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PChnlGpDasRelaVO.class);
    }

}
