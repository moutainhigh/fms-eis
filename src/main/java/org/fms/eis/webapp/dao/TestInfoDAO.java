/**
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.TestInfoDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.TestInfoDomain;

import java.util.List;

@TransactionDAO
public class TestInfoDAO extends AbstractTransactionDAOSupport implements BaseDAO<TestInfoDomain> {

    @Override
    public int insert(TestInfoDomain testInfoDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", testInfoDomain);
    }

    @Override
    public int delete(TestInfoDomain testInfoDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", testInfoDomain);
    }

    @Override
    public TestInfoDomain findByKey(TestInfoDomain testInfoDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", testInfoDomain);
    }

    @PaginationSupport
    @Override
    public List<TestInfoDomain> findByWhere(TestInfoDomain testInfoDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", testInfoDomain);
    }

    @Override
    public int update(TestInfoDomain testInfoDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", testInfoDomain);
    }

}
