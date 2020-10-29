/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.TestDAO.java
 **/
package org.fms.eis.webapp.dao;

import java.util.List;

import com.riozenc.titanTool.annotation.PaginationSupport;
import org.fms.eis.webapp.domain.TestDomain;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;

@TransactionDAO
public class TestDAO extends AbstractTransactionDAOSupport implements BaseDAO<TestDomain> {

    @Override
    public int insert(TestDomain testDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", testDomain);
    }

    @Override
    public int delete(TestDomain arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @PaginationSupport
    @Override
    public TestDomain findByKey(TestDomain arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<TestDomain> findByWhere(TestDomain arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int update(TestDomain arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

}
