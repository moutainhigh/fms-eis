/**
 * 测量点月冻结需量表
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpXlMonDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpXlMonDomain;

import java.util.List;

@TransactionDAO
public class EMpXlMonDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpXlMonDomain> {

    @Override
    public int insert(EMpXlMonDomain eMpXlMonDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", eMpXlMonDomain);
    }

    @Override
    public int delete(EMpXlMonDomain eMpXlMonDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", eMpXlMonDomain);
    }

    @Override
    public EMpXlMonDomain findByKey(EMpXlMonDomain eMpXlMonDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", eMpXlMonDomain);
    }

    @PaginationSupport
    @Override
    public List<EMpXlMonDomain> findByWhere(EMpXlMonDomain eMpXlMonDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpXlMonDomain);
    }

    @Override
    public int update(EMpXlMonDomain eMpXlMonDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", eMpXlMonDomain);
    }

    public int deleteList(List<EMpXlMonDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
