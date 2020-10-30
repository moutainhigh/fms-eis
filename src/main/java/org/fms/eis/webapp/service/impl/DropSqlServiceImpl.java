/**
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.DropSqlServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.DropSqlDAO;
import org.fms.eis.webapp.domain.DropSqlDomain;
import org.fms.eis.webapp.service.IDropSqlService;
import org.fms.eis.webapp.vo.DropSqlVO;

import java.util.*;

@TransactionService
public class DropSqlServiceImpl implements IDropSqlService {

    @TransactionDAO("read")
    private DropSqlDAO dropSqlReadDAO;

    @TransactionDAO("write")
    private DropSqlDAO dropSqlWriteDAO;

    @Override
    public int insert(DropSqlVO dropSqlVO) {
        return dropSqlWriteDAO.insert(dropSqlVO.vo2Domain());
    }

    @Override
    public int update(DropSqlVO dropSqlVO) {
        return dropSqlWriteDAO.update(dropSqlVO.vo2Domain());
    }

    @Override
    public int delete(DropSqlVO dropSqlVO) {
        return dropSqlWriteDAO.delete(dropSqlVO.vo2Domain());
    }

    @Override
    public DropSqlVO findByKey(DropSqlVO dropSqlVO) {
        DropSqlDomain model = dropSqlReadDAO.findByKey(dropSqlVO.vo2Domain());
        DropSqlVO modelVo = new DropSqlVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<DropSqlVO> findByWhere(DropSqlVO dropSqlVO) {
        DropSqlDomain dropSqlDomain = dropSqlVO.vo2Domain();
        List<DropSqlDomain> lstDomain = dropSqlReadDAO.findByWhere(dropSqlDomain);
        dropSqlVO.setTotalRow(dropSqlDomain.getTotalRow());
        dropSqlVO.setPageCurrent(dropSqlDomain.getPageCurrent());
        dropSqlVO.setDbName(dropSqlDomain.getDbName());
        dropSqlVO.setPageSize(dropSqlDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, DropSqlVO.class);
    }

}
