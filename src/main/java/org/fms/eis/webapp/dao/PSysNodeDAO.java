/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PSysNodeDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PSysNodeDomain;

import java.util.List;

@TransactionDAO
public class PSysNodeDAO extends AbstractTransactionDAOSupport implements BaseDAO<PSysNodeDomain> {

    @Override
    public int insert(PSysNodeDomain testDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", testDomain);
    }

    @Override
    public int delete(PSysNodeDomain arg0) {
        return getPersistanceManager().delete(getNamespace() + ".delete", arg0);
    }

    @PaginationSupport
    @Override
    public PSysNodeDomain findByKey(PSysNodeDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", arg0);
    }

    @Override
    public List<PSysNodeDomain> findByWhere(PSysNodeDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", arg0);
    }

    @Override
    public int update(PSysNodeDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", arg0);
    }

}
