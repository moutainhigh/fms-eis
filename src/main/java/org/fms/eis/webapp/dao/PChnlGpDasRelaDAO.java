/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PChnlGpDasRelaDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PChnlGpDasRelaDomain;

import java.util.List;

@TransactionDAO
public class PChnlGpDasRelaDAO extends AbstractTransactionDAOSupport implements BaseDAO<PChnlGpDasRelaDomain> {

    @Override
    public int insert(PChnlGpDasRelaDomain testDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", testDomain);
    }

    @Override
    public int delete(PChnlGpDasRelaDomain arg0) {
        return getPersistanceManager().delete(getNamespace() + ".delete", arg0);
    }

    @PaginationSupport
    @Override
    public PChnlGpDasRelaDomain findByKey(PChnlGpDasRelaDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", arg0);
    }

    @Override
    public List<PChnlGpDasRelaDomain> findByWhere(PChnlGpDasRelaDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", arg0);
    }

    @Override
    public int update(PChnlGpDasRelaDomain arg0) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", arg0);
    }

}
