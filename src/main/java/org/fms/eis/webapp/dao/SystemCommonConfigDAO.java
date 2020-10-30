/**
 * 下拉表 -迟子曰改
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.SystemCommonConfigDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.SystemCommonConfigDomain;

import java.util.List;

@TransactionDAO
public class SystemCommonConfigDAO extends AbstractTransactionDAOSupport implements BaseDAO<SystemCommonConfigDomain> {

    @Override
    public int insert(SystemCommonConfigDomain systemCommonConfigDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", systemCommonConfigDomain);
    }

    @Override
    public int delete(SystemCommonConfigDomain systemCommonConfigDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", systemCommonConfigDomain);
    }

    @Override
    public SystemCommonConfigDomain findByKey(SystemCommonConfigDomain systemCommonConfigDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", systemCommonConfigDomain);
    }

    @PaginationSupport
    @Override
    public List<SystemCommonConfigDomain> findByWhere(SystemCommonConfigDomain systemCommonConfigDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", systemCommonConfigDomain);
    }

    @Override
    public int update(SystemCommonConfigDomain systemCommonConfigDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", systemCommonConfigDomain);
    }

}
