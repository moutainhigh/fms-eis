/**
 * 测量点电能示值曲线
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpBmCurveYyyymmDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpBmCurveYyyymmDomain;

import java.util.List;

@TransactionDAO
public class EMpBmCurveYyyymmDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpBmCurveYyyymmDomain> {

    @Override
    public int insert(EMpBmCurveYyyymmDomain eMpBmCurveYyyymmDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", eMpBmCurveYyyymmDomain);
    }

    @Override
    public int delete(EMpBmCurveYyyymmDomain eMpBmCurveYyyymmDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", eMpBmCurveYyyymmDomain);
    }

    @Override
    public EMpBmCurveYyyymmDomain findByKey(EMpBmCurveYyyymmDomain eMpBmCurveYyyymmDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", eMpBmCurveYyyymmDomain);
    }

    @PaginationSupport
    @Override
    public List<EMpBmCurveYyyymmDomain> findByWhere(EMpBmCurveYyyymmDomain eMpBmCurveYyyymmDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpBmCurveYyyymmDomain);
    }

    @Override
    public int update(EMpBmCurveYyyymmDomain eMpBmCurveYyyymmDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", eMpBmCurveYyyymmDomain);
    }

    public int deleteList(List<EMpBmCurveYyyymmDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
