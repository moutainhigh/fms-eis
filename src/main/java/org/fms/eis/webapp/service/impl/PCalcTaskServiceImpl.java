/**
 * 计算任务
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PCalcTaskServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PCalcTaskDAO;
import org.fms.eis.webapp.domain.PCalcTaskDomain;
import org.fms.eis.webapp.service.IPCalcTaskService;
import org.fms.eis.webapp.vo.PCalcTaskVO;

import java.util.*;

@TransactionService
public class PCalcTaskServiceImpl implements IPCalcTaskService {

    @TransactionDAO("read")
    private PCalcTaskDAO pCalcTaskReadDAO;

    @TransactionDAO("write")
    private PCalcTaskDAO pCalcTaskWriteDAO;

    @Override
    public int insert(PCalcTaskVO pCalcTaskVO) {
        return pCalcTaskWriteDAO.insert(pCalcTaskVO.vo2Domain());
    }

    @Override
    public int update(PCalcTaskVO pCalcTaskVO) {
        return pCalcTaskWriteDAO.update(pCalcTaskVO.vo2Domain());
    }

    @Override
    public int delete(PCalcTaskVO pCalcTaskVO) {
        return pCalcTaskWriteDAO.delete(pCalcTaskVO.vo2Domain());
    }

    @Override
    public PCalcTaskVO findByKey(PCalcTaskVO pCalcTaskVO) {
        PCalcTaskDomain model = pCalcTaskReadDAO.findByKey(pCalcTaskVO.vo2Domain());
        PCalcTaskVO modelVo = new PCalcTaskVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PCalcTaskVO> findByWhere(PCalcTaskVO pCalcTaskVO) {
        PCalcTaskDomain pCalcTaskDomain = pCalcTaskVO.vo2Domain();
        List<PCalcTaskDomain> lstDomain = pCalcTaskReadDAO.findByWhere(pCalcTaskDomain);
        pCalcTaskVO.setTotalRow(pCalcTaskDomain.getTotalRow());
        pCalcTaskVO.setPageCurrent(pCalcTaskDomain.getPageCurrent());
        pCalcTaskVO.setDbName(pCalcTaskDomain.getDbName());
        pCalcTaskVO.setPageSize(pCalcTaskDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PCalcTaskVO.class);
    }

}
