/**
 * 采集点
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.RCpServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.RCpDAO;
import org.fms.eis.webapp.domain.RCpDomain;
import org.fms.eis.webapp.service.IRCpService;
import org.fms.eis.webapp.vo.RCpVO;

import java.util.*;

@TransactionService
public class RCpServiceImpl implements IRCpService {

    @TransactionDAO("read")
    private RCpDAO rCpReadDAO;

    @TransactionDAO("write")
    private RCpDAO rCpWriteDAO;

    @Override
    public int insert(RCpVO rCpVO) {
        return rCpWriteDAO.insert(rCpVO.vo2Domain());
    }

    @Override
    public int update(RCpVO rCpVO) {
        return rCpWriteDAO.update(rCpVO.vo2Domain());
    }

    @Override
    public int delete(RCpVO rCpVO) {
        return rCpWriteDAO.delete(rCpVO.vo2Domain());
    }

    @Override
    public RCpVO findByKey(RCpVO rCpVO) {
        RCpDomain model = rCpReadDAO.findByKey(rCpVO.vo2Domain());
        RCpVO modelVo = new RCpVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<RCpVO> findByWhere(RCpVO rCpVO) {
        RCpDomain rCpDomain = rCpVO.vo2Domain();
        List<RCpDomain> lstDomain = rCpReadDAO.findByWhere(rCpDomain);
        rCpVO.setTotalRow(rCpDomain.getTotalRow());
        rCpVO.setPageCurrent(rCpDomain.getPageCurrent());
        rCpVO.setDbName(rCpDomain.getDbName());
        rCpVO.setPageSize(rCpDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, RCpVO.class);
    }

}
