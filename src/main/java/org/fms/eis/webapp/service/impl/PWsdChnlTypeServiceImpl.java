/**
 * 采集主机组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PWsdChnlTypeServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PWsdChnlTypeDAO;
import org.fms.eis.webapp.domain.PWsdChnlTypeDomain;
import org.fms.eis.webapp.service.IPWsdChnlTypeService;
import org.fms.eis.webapp.vo.PWsdChnlTypeVO;

import java.util.*;

@TransactionService
public class PWsdChnlTypeServiceImpl implements IPWsdChnlTypeService {

    @TransactionDAO("read")
    private PWsdChnlTypeDAO pWsdChnlTypeReadDAO;

    @TransactionDAO("write")
    private PWsdChnlTypeDAO pWsdChnlTypeWriteDAO;

    @Override
    public int insert(PWsdChnlTypeVO pWsdChnlTypeVO) {
        return pWsdChnlTypeWriteDAO.insert(pWsdChnlTypeVO.vo2Domain());
    }

    @Override
    public int update(PWsdChnlTypeVO pWsdChnlTypeVO) {
        return pWsdChnlTypeWriteDAO.update(pWsdChnlTypeVO.vo2Domain());
    }

    @Override
    public int delete(PWsdChnlTypeVO pWsdChnlTypeVO) {
        return pWsdChnlTypeWriteDAO.delete(pWsdChnlTypeVO.vo2Domain());
    }

    @Override
    public PWsdChnlTypeVO findByKey(PWsdChnlTypeVO pWsdChnlTypeVO) {
        PWsdChnlTypeDomain model = pWsdChnlTypeReadDAO.findByKey(pWsdChnlTypeVO.vo2Domain());
        PWsdChnlTypeVO modelVo = new PWsdChnlTypeVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PWsdChnlTypeVO> findByWhere(PWsdChnlTypeVO pWsdChnlTypeVO) {
        PWsdChnlTypeDomain pWsdChnlTypeDomain = pWsdChnlTypeVO.vo2Domain();
        List<PWsdChnlTypeDomain> lstDomain = pWsdChnlTypeReadDAO.findByWhere(pWsdChnlTypeDomain);
        pWsdChnlTypeVO.setTotalRow(pWsdChnlTypeDomain.getTotalRow());
        pWsdChnlTypeVO.setPageCurrent(pWsdChnlTypeDomain.getPageCurrent());
        pWsdChnlTypeVO.setDbName(pWsdChnlTypeDomain.getDbName());
        pWsdChnlTypeVO.setPageSize(pWsdChnlTypeDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PWsdChnlTypeVO.class);
    }

}
