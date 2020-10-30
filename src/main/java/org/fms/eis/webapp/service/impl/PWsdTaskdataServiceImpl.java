/**
 * 规约数据单元
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PWsdTaskdataServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PWsdTaskdataDAO;
import org.fms.eis.webapp.domain.PWsdTaskdataDomain;
import org.fms.eis.webapp.service.IPWsdTaskdataService;
import org.fms.eis.webapp.vo.PWsdTaskdataVO;

import java.util.*;

@TransactionService
public class PWsdTaskdataServiceImpl implements IPWsdTaskdataService {

    @TransactionDAO("read")
    private PWsdTaskdataDAO pWsdTaskdataReadDAO;

    @TransactionDAO("write")
    private PWsdTaskdataDAO pWsdTaskdataWriteDAO;

    @Override
    public int insert(PWsdTaskdataVO pWsdTaskdataVO) {
        return pWsdTaskdataWriteDAO.insert(pWsdTaskdataVO.vo2Domain());
    }

    @Override
    public int update(PWsdTaskdataVO pWsdTaskdataVO) {
        return pWsdTaskdataWriteDAO.update(pWsdTaskdataVO.vo2Domain());
    }

    @Override
    public int delete(PWsdTaskdataVO pWsdTaskdataVO) {
        return pWsdTaskdataWriteDAO.delete(pWsdTaskdataVO.vo2Domain());
    }

    @Override
    public PWsdTaskdataVO findByKey(PWsdTaskdataVO pWsdTaskdataVO) {
        PWsdTaskdataDomain model = pWsdTaskdataReadDAO.findByKey(pWsdTaskdataVO.vo2Domain());
        PWsdTaskdataVO modelVo = new PWsdTaskdataVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PWsdTaskdataVO> findByWhere(PWsdTaskdataVO pWsdTaskdataVO) {
        PWsdTaskdataDomain pWsdTaskdataDomain = pWsdTaskdataVO.vo2Domain();
        List<PWsdTaskdataDomain> lstDomain = pWsdTaskdataReadDAO.findByWhere(pWsdTaskdataDomain);
        pWsdTaskdataVO.setTotalRow(pWsdTaskdataDomain.getTotalRow());
        pWsdTaskdataVO.setPageCurrent(pWsdTaskdataDomain.getPageCurrent());
        pWsdTaskdataVO.setDbName(pWsdTaskdataDomain.getDbName());
        pWsdTaskdataVO.setPageSize(pWsdTaskdataDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PWsdTaskdataVO.class);
    }

}
