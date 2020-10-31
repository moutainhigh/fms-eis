/**
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.DropSqlDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.DropSqlDomain;

import java.util.List;

@TransactionDAO
public class DropSqlDAO extends AbstractTransactionDAOSupport implements BaseDAO<DropSqlDomain> {

    @Override
    public int insert(DropSqlDomain dropSqlDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", dropSqlDomain);
    }

    @Override
    public int delete(DropSqlDomain dropSqlDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", dropSqlDomain);
    }

    @Override
    public DropSqlDomain findByKey(DropSqlDomain dropSqlDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", dropSqlDomain);
    }

    @PaginationSupport
    @Override
    public List<DropSqlDomain> findByWhere(DropSqlDomain dropSqlDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", dropSqlDomain);
    }

    @Override
    public int update(DropSqlDomain dropSqlDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", dropSqlDomain);
    }

    public int deleteList(List<DropSqlDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
