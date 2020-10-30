/**
 * 下拉表 -迟子曰改
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.SystemCommonConfigServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.SystemCommonConfigDAO;
import org.fms.eis.webapp.domain.SystemCommonConfigDomain;
import org.fms.eis.webapp.service.ISystemCommonConfigService;
import org.fms.eis.webapp.vo.SystemCommonConfigVO;

import java.util.*;

@TransactionService
public class SystemCommonConfigServiceImpl implements ISystemCommonConfigService {

    @TransactionDAO("read")
    private SystemCommonConfigDAO systemCommonConfigReadDAO;

    @TransactionDAO("write")
    private SystemCommonConfigDAO systemCommonConfigWriteDAO;

    @Override
    public int insert(SystemCommonConfigVO systemCommonConfigVO) {
        return systemCommonConfigWriteDAO.insert(systemCommonConfigVO.vo2Domain());
    }

    @Override
    public int update(SystemCommonConfigVO systemCommonConfigVO) {
        return systemCommonConfigWriteDAO.update(systemCommonConfigVO.vo2Domain());
    }

    @Override
    public int delete(SystemCommonConfigVO systemCommonConfigVO) {
        return systemCommonConfigWriteDAO.delete(systemCommonConfigVO.vo2Domain());
    }

    @Override
    public SystemCommonConfigVO findByKey(SystemCommonConfigVO systemCommonConfigVO) {
        SystemCommonConfigDomain model = systemCommonConfigReadDAO.findByKey(systemCommonConfigVO.vo2Domain());
        SystemCommonConfigVO modelVo = new SystemCommonConfigVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<SystemCommonConfigVO> findByWhere(SystemCommonConfigVO systemCommonConfigVO) {
        SystemCommonConfigDomain systemCommonConfigDomain = systemCommonConfigVO.vo2Domain();
        List<SystemCommonConfigDomain> lstDomain = systemCommonConfigReadDAO.findByWhere(systemCommonConfigDomain);
        systemCommonConfigVO.setTotalRow(systemCommonConfigDomain.getTotalRow());
        systemCommonConfigVO.setPageCurrent(systemCommonConfigDomain.getPageCurrent());
        systemCommonConfigVO.setDbName(systemCommonConfigDomain.getDbName());
        systemCommonConfigVO.setPageSize(systemCommonConfigDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, SystemCommonConfigVO.class);
    }

}
