/**
 * 台区表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.TgInfoServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.TgInfoDAO;
import org.fms.eis.webapp.domain.TgInfoDomain;
import org.fms.eis.webapp.service.ITgInfoService;
import org.fms.eis.webapp.vo.TgInfoVO;

import java.util.*;

@TransactionService
public class TgInfoServiceImpl implements ITgInfoService {

    @TransactionDAO("read")
    private TgInfoDAO tgInfoReadDAO;

    @TransactionDAO("write")
    private TgInfoDAO tgInfoWriteDAO;

    @Override
    public int insert(TgInfoVO tgInfoVO) {
        return tgInfoWriteDAO.insert(tgInfoVO.vo2Domain());
    }

    @Override
    public int update(TgInfoVO tgInfoVO) {
        return tgInfoWriteDAO.update(tgInfoVO.vo2Domain());
    }

    @Override
    public int delete(TgInfoVO tgInfoVO) {
        return tgInfoWriteDAO.delete(tgInfoVO.vo2Domain());
    }

    @Override
    public TgInfoVO findByKey(TgInfoVO tgInfoVO) {
        TgInfoDomain model = tgInfoReadDAO.findByKey(tgInfoVO.vo2Domain());
        TgInfoVO modelVo = new TgInfoVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<TgInfoVO> findByWhere(TgInfoVO tgInfoVO) {
        TgInfoDomain tgInfoDomain = tgInfoVO.vo2Domain();
        List<TgInfoDomain> lstDomain = tgInfoReadDAO.findByWhere(tgInfoDomain);
        tgInfoVO.setTotalRow(tgInfoDomain.getTotalRow());
        tgInfoVO.setPageCurrent(tgInfoDomain.getPageCurrent());
        tgInfoVO.setDbName(tgInfoDomain.getDbName());
        tgInfoVO.setPageSize(tgInfoDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, TgInfoVO.class);
    }

}
