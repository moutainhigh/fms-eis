/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PChnlGroupDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PChnlGroupDomain;

import java.util.List;

@TransactionDAO
public class PChnlGroupDAO extends AbstractTransactionDAOSupport implements BaseDAO<PChnlGroupDomain> {

    @Override
    public int insert(PChnlGroupDomain testDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", testDomain);
    }

    @Override
    public int delete(PChnlGroupDomain arg0) {
        return getPersistanceManager().delete(getNamespace() + ".delete", arg0);
    }

    @PaginationSupport
    @Override
    public PChnlGroupDomain findByKey(PChnlGroupDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", arg0);
    }

    @Override
    public List<PChnlGroupDomain> findByWhere(PChnlGroupDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", arg0);
    }

    @Override
    public int update(PChnlGroupDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", arg0);
    }

}
