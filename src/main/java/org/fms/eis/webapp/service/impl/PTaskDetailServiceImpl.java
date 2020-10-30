/**
 * 采集任务明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PTaskDetailServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PTaskDetailDAO;
import org.fms.eis.webapp.domain.PTaskDetailDomain;
import org.fms.eis.webapp.service.IPTaskDetailService;
import org.fms.eis.webapp.vo.PTaskDetailVO;

import java.util.*;

@TransactionService
public class PTaskDetailServiceImpl implements IPTaskDetailService {

    @TransactionDAO("read")
    private PTaskDetailDAO pTaskDetailReadDAO;

    @TransactionDAO("write")
    private PTaskDetailDAO pTaskDetailWriteDAO;

    @Override
    public int insert(PTaskDetailVO pTaskDetailVO) {
        return pTaskDetailWriteDAO.insert(pTaskDetailVO.vo2Domain());
    }

    @Override
    public int update(PTaskDetailVO pTaskDetailVO) {
        return pTaskDetailWriteDAO.update(pTaskDetailVO.vo2Domain());
    }

    @Override
    public int delete(PTaskDetailVO pTaskDetailVO) {
        return pTaskDetailWriteDAO.delete(pTaskDetailVO.vo2Domain());
    }

    @Override
    public PTaskDetailVO findByKey(PTaskDetailVO pTaskDetailVO) {
        PTaskDetailDomain model = pTaskDetailReadDAO.findByKey(pTaskDetailVO.vo2Domain());
        PTaskDetailVO modelVo = new PTaskDetailVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PTaskDetailVO> findByWhere(PTaskDetailVO pTaskDetailVO) {
        PTaskDetailDomain pTaskDetailDomain = pTaskDetailVO.vo2Domain();
        List<PTaskDetailDomain> lstDomain = pTaskDetailReadDAO.findByWhere(pTaskDetailDomain);
        pTaskDetailVO.setTotalRow(pTaskDetailDomain.getTotalRow());
        pTaskDetailVO.setPageCurrent(pTaskDetailDomain.getPageCurrent());
        pTaskDetailVO.setDbName(pTaskDetailDomain.getDbName());
        pTaskDetailVO.setPageSize(pTaskDetailDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PTaskDetailVO.class);
    }

}
