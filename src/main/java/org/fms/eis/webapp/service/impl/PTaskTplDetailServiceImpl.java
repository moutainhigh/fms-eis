/**
 * 采集任务模板明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PTaskTplDetailServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PTaskTplDetailDAO;
import org.fms.eis.webapp.domain.PTaskTplDetailDomain;
import org.fms.eis.webapp.service.IPTaskTplDetailService;
import org.fms.eis.webapp.vo.PTaskTplDetailVO;

import java.util.*;

@TransactionService
public class PTaskTplDetailServiceImpl implements IPTaskTplDetailService {

    @TransactionDAO("read")
    private PTaskTplDetailDAO pTaskTplDetailReadDAO;

    @TransactionDAO("write")
    private PTaskTplDetailDAO pTaskTplDetailWriteDAO;

    @Override
    public int insert(PTaskTplDetailVO pTaskTplDetailVO) {
        return pTaskTplDetailWriteDAO.insert(pTaskTplDetailVO.vo2Domain());
    }

    @Override
    public int update(PTaskTplDetailVO pTaskTplDetailVO) {
        return pTaskTplDetailWriteDAO.update(pTaskTplDetailVO.vo2Domain());
    }

    @Override
    public int delete(PTaskTplDetailVO pTaskTplDetailVO) {
        return pTaskTplDetailWriteDAO.delete(pTaskTplDetailVO.vo2Domain());
    }

    @Override
    public PTaskTplDetailVO findByKey(PTaskTplDetailVO pTaskTplDetailVO) {
        PTaskTplDetailDomain model = pTaskTplDetailReadDAO.findByKey(pTaskTplDetailVO.vo2Domain());
        PTaskTplDetailVO modelVo = new PTaskTplDetailVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PTaskTplDetailVO> findByWhere(PTaskTplDetailVO pTaskTplDetailVO) {
        PTaskTplDetailDomain pTaskTplDetailDomain = pTaskTplDetailVO.vo2Domain();
        List<PTaskTplDetailDomain> lstDomain = pTaskTplDetailReadDAO.findByWhere(pTaskTplDetailDomain);
        pTaskTplDetailVO.setTotalRow(pTaskTplDetailDomain.getTotalRow());
        pTaskTplDetailVO.setPageCurrent(pTaskTplDetailDomain.getPageCurrent());
        pTaskTplDetailVO.setDbName(pTaskTplDetailDomain.getDbName());
        pTaskTplDetailVO.setPageSize(pTaskTplDetailDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PTaskTplDetailVO.class);
    }

}
