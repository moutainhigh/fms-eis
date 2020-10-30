/**
 * 规约任务类型（※相当于原来变电站采集的规约数据类型表与负控采集的任务类型合并的表。对于厂站系列为电量、15分钟电量、瞬时量等；对于负荷、低压系列为一类、二类数据等）
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PWsdProtocolTaskServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PWsdProtocolTaskDAO;
import org.fms.eis.webapp.domain.PWsdProtocolTaskDomain;
import org.fms.eis.webapp.service.IPWsdProtocolTaskService;
import org.fms.eis.webapp.vo.PWsdProtocolTaskVO;

import java.util.*;

@TransactionService
public class PWsdProtocolTaskServiceImpl implements IPWsdProtocolTaskService {

    @TransactionDAO("read")
    private PWsdProtocolTaskDAO pWsdProtocolTaskReadDAO;

    @TransactionDAO("write")
    private PWsdProtocolTaskDAO pWsdProtocolTaskWriteDAO;

    @Override
    public int insert(PWsdProtocolTaskVO pWsdProtocolTaskVO) {
        return pWsdProtocolTaskWriteDAO.insert(pWsdProtocolTaskVO.vo2Domain());
    }

    @Override
    public int update(PWsdProtocolTaskVO pWsdProtocolTaskVO) {
        return pWsdProtocolTaskWriteDAO.update(pWsdProtocolTaskVO.vo2Domain());
    }

    @Override
    public int delete(PWsdProtocolTaskVO pWsdProtocolTaskVO) {
        return pWsdProtocolTaskWriteDAO.delete(pWsdProtocolTaskVO.vo2Domain());
    }

    @Override
    public PWsdProtocolTaskVO findByKey(PWsdProtocolTaskVO pWsdProtocolTaskVO) {
        PWsdProtocolTaskDomain model = pWsdProtocolTaskReadDAO.findByKey(pWsdProtocolTaskVO.vo2Domain());
        PWsdProtocolTaskVO modelVo = new PWsdProtocolTaskVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PWsdProtocolTaskVO> findByWhere(PWsdProtocolTaskVO pWsdProtocolTaskVO) {
        PWsdProtocolTaskDomain pWsdProtocolTaskDomain = pWsdProtocolTaskVO.vo2Domain();
        List<PWsdProtocolTaskDomain> lstDomain = pWsdProtocolTaskReadDAO.findByWhere(pWsdProtocolTaskDomain);
        pWsdProtocolTaskVO.setTotalRow(pWsdProtocolTaskDomain.getTotalRow());
        pWsdProtocolTaskVO.setPageCurrent(pWsdProtocolTaskDomain.getPageCurrent());
        pWsdProtocolTaskVO.setDbName(pWsdProtocolTaskDomain.getDbName());
        pWsdProtocolTaskVO.setPageSize(pWsdProtocolTaskDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PWsdProtocolTaskVO.class);
    }

}
