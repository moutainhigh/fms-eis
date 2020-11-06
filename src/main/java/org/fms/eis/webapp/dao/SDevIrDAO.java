/**
 * 设备装拆记录表
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.SDevIrDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.SDevIrDomain;

import java.util.List;

@TransactionDAO
public class SDevIrDAO extends AbstractTransactionDAOSupport implements BaseDAO<SDevIrDomain> {

    @Override
    public int insert(SDevIrDomain sDevIrDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", sDevIrDomain);
    }

    @Override
    public int delete(SDevIrDomain sDevIrDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", sDevIrDomain);
    }

    @Override
    public SDevIrDomain findByKey(SDevIrDomain sDevIrDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", sDevIrDomain);
    }

    @PaginationSupport
    @Override
    public List<SDevIrDomain> findByWhere(SDevIrDomain sDevIrDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", sDevIrDomain);
    }

    @Override
    public int update(SDevIrDomain sDevIrDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", sDevIrDomain);
    }

    public int deleteList(List<SDevIrDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
