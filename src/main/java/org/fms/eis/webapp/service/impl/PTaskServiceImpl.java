/**
 * 采集任务
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PTaskServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PTaskDAO;
import org.fms.eis.webapp.domain.PTaskDomain;
import org.fms.eis.webapp.service.IPTaskService;
import org.fms.eis.webapp.vo.PTaskVO;

import java.util.*;

@TransactionService
public class PTaskServiceImpl implements IPTaskService {

    @TransactionDAO("read")
    private PTaskDAO pTaskReadDAO;

    @TransactionDAO("write")
    private PTaskDAO pTaskWriteDAO;

    @Override
    public int insert(PTaskVO pTaskVO) {
        return pTaskWriteDAO.insert(pTaskVO.vo2Domain());
    }

    @Override
    public int update(PTaskVO pTaskVO) {
        return pTaskWriteDAO.update(pTaskVO.vo2Domain());
    }

    @Override
    public int delete(PTaskVO pTaskVO) {
        return pTaskWriteDAO.delete(pTaskVO.vo2Domain());
    }

    @Override
    public PTaskVO findByKey(PTaskVO pTaskVO) {
        PTaskDomain model = pTaskReadDAO.findByKey(pTaskVO.vo2Domain());
        PTaskVO modelVo = new PTaskVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PTaskVO> findByWhere(PTaskVO pTaskVO) {
        PTaskDomain pTaskDomain = pTaskVO.vo2Domain();
        List<PTaskDomain> lstDomain = pTaskReadDAO.findByWhere(pTaskDomain);
        pTaskVO.setTotalRow(pTaskDomain.getTotalRow());
        pTaskVO.setPageCurrent(pTaskDomain.getPageCurrent());
        pTaskVO.setDbName(pTaskDomain.getDbName());
        pTaskVO.setPageSize(pTaskDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PTaskVO.class);
    }

}
