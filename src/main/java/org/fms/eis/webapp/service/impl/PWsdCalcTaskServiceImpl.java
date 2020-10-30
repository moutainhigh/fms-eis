/**
 * 计算任务类型定义表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PWsdCalcTaskServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PWsdCalcTaskDAO;
import org.fms.eis.webapp.domain.PWsdCalcTaskDomain;
import org.fms.eis.webapp.service.IPWsdCalcTaskService;
import org.fms.eis.webapp.vo.PWsdCalcTaskVO;

import java.util.*;

@TransactionService
public class PWsdCalcTaskServiceImpl implements IPWsdCalcTaskService {

    @TransactionDAO("read")
    private PWsdCalcTaskDAO pWsdCalcTaskReadDAO;

    @TransactionDAO("write")
    private PWsdCalcTaskDAO pWsdCalcTaskWriteDAO;

    @Override
    public int insert(PWsdCalcTaskVO pWsdCalcTaskVO) {
        return pWsdCalcTaskWriteDAO.insert(pWsdCalcTaskVO.vo2Domain());
    }

    @Override
    public int update(PWsdCalcTaskVO pWsdCalcTaskVO) {
        return pWsdCalcTaskWriteDAO.update(pWsdCalcTaskVO.vo2Domain());
    }

    @Override
    public int delete(PWsdCalcTaskVO pWsdCalcTaskVO) {
        return pWsdCalcTaskWriteDAO.delete(pWsdCalcTaskVO.vo2Domain());
    }

    @Override
    public PWsdCalcTaskVO findByKey(PWsdCalcTaskVO pWsdCalcTaskVO) {
        PWsdCalcTaskDomain model = pWsdCalcTaskReadDAO.findByKey(pWsdCalcTaskVO.vo2Domain());
        PWsdCalcTaskVO modelVo = new PWsdCalcTaskVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PWsdCalcTaskVO> findByWhere(PWsdCalcTaskVO pWsdCalcTaskVO) {
        PWsdCalcTaskDomain pWsdCalcTaskDomain = pWsdCalcTaskVO.vo2Domain();
        List<PWsdCalcTaskDomain> lstDomain = pWsdCalcTaskReadDAO.findByWhere(pWsdCalcTaskDomain);
        pWsdCalcTaskVO.setTotalRow(pWsdCalcTaskDomain.getTotalRow());
        pWsdCalcTaskVO.setPageCurrent(pWsdCalcTaskDomain.getPageCurrent());
        pWsdCalcTaskVO.setDbName(pWsdCalcTaskDomain.getDbName());
        pWsdCalcTaskVO.setPageSize(pWsdCalcTaskDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PWsdCalcTaskVO.class);
    }

}
