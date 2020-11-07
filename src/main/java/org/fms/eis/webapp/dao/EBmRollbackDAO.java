/**
 * 电能示值回收表
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EBmRollbackDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EBmRollbackDomain;

import java.util.List;

@TransactionDAO
public class EBmRollbackDAO extends AbstractTransactionDAOSupport implements BaseDAO<EBmRollbackDomain> {

    @Override
    public int insert(EBmRollbackDomain eBmRollbackDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", eBmRollbackDomain);
    }

    @Override
    public int delete(EBmRollbackDomain eBmRollbackDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", eBmRollbackDomain);
    }

    @Override
    public EBmRollbackDomain findByKey(EBmRollbackDomain eBmRollbackDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", eBmRollbackDomain);
    }

    @PaginationSupport
    @Override
    public List<EBmRollbackDomain> findByWhere(EBmRollbackDomain eBmRollbackDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", eBmRollbackDomain);
    }

    @Override
    public int update(EBmRollbackDomain eBmRollbackDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", eBmRollbackDomain);
    }

    public int deleteList(List<EBmRollbackDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
