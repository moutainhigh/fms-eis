/**
 * 通道组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PChnlGroupServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PChnlGroupDAO;
import org.fms.eis.webapp.domain.PChnlGroupDomain;
import org.fms.eis.webapp.domain.PChnlGroupStaticDomain;
import org.fms.eis.webapp.service.IPChnlGroupService;
import org.fms.eis.webapp.vo.PChnlGroupStaticVO;
import org.fms.eis.webapp.vo.PChnlGroupVO;

import java.util.*;

@TransactionService
public class PChnlGroupServiceImpl implements IPChnlGroupService {

    @TransactionDAO("read")
    private PChnlGroupDAO pChnlGroupReadDAO;

    @TransactionDAO("write")
    private PChnlGroupDAO pChnlGroupWriteDAO;

    @Override
    public int insert(PChnlGroupVO pChnlGroupVO) {
        return pChnlGroupWriteDAO.insert(pChnlGroupVO.vo2Domain());
    }

    @Override
    public int update(PChnlGroupVO pChnlGroupVO) {
        return pChnlGroupWriteDAO.update(pChnlGroupVO.vo2Domain());
    }

    @Override
    public int delete(PChnlGroupVO pChnlGroupVO) {
        return pChnlGroupWriteDAO.delete(pChnlGroupVO.vo2Domain());
    }

    @Override
    public PChnlGroupVO findByKey(PChnlGroupVO pChnlGroupVO) {
        PChnlGroupDomain model = pChnlGroupReadDAO.findByKey(pChnlGroupVO.vo2Domain());
        PChnlGroupVO modelVo = new PChnlGroupVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PChnlGroupVO> findByWhere(PChnlGroupVO pChnlGroupVO) {
        PChnlGroupDomain pChnlGroupDomain = pChnlGroupVO.vo2Domain();
        List<PChnlGroupDomain> lstDomain = pChnlGroupReadDAO.findByWhere(pChnlGroupDomain);
        pChnlGroupVO.setTotalRow(pChnlGroupDomain.getTotalRow());
        pChnlGroupVO.setPageCurrent(pChnlGroupDomain.getPageCurrent());
        pChnlGroupVO.setDbName(pChnlGroupDomain.getDbName());
        pChnlGroupVO.setPageSize(pChnlGroupDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PChnlGroupVO.class);
    }

    @Override
    public List<PChnlGroupStaticVO> findByWhereStatic(PChnlGroupStaticVO pChnlGroupVO) {
        PChnlGroupStaticDomain pChnlGroupStaticDomain = pChnlGroupVO.vo2Domain();
        List<PChnlGroupStaticDomain> lstDomain = pChnlGroupReadDAO.findByWhereStatic(pChnlGroupStaticDomain);
        pChnlGroupVO.setTotalRow(pChnlGroupStaticDomain.getTotalRow());
        pChnlGroupVO.setPageCurrent(pChnlGroupStaticDomain.getPageCurrent());
        pChnlGroupVO.setDbName(pChnlGroupStaticDomain.getDbName());
        pChnlGroupVO.setPageSize(pChnlGroupStaticDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PChnlGroupStaticVO.class);
    }
}
