/**
 * 测量点瞬时量曲线表
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpSslCurveYyyymmDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpSslCurveYyyymmDomain;

import java.util.List;

@TransactionDAO
public class EMpSslCurveYyyymmDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpSslCurveYyyymmDomain> {

	@Override
	public int insert(EMpSslCurveYyyymmDomain eMpSslCurveYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpSslCurveYyyymmDomain);
	}

	@Override
	public int delete(EMpSslCurveYyyymmDomain eMpSslCurveYyyymmDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpSslCurveYyyymmDomain);
	}

	@Override
	public EMpSslCurveYyyymmDomain findByKey(EMpSslCurveYyyymmDomain eMpSslCurveYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpSslCurveYyyymmDomain);
	}

	@PaginationSupport
	@Override
	public List<EMpSslCurveYyyymmDomain> findByWhere(EMpSslCurveYyyymmDomain eMpSslCurveYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpSslCurveYyyymmDomain);
	}

	@Override
	public int update(EMpSslCurveYyyymmDomain eMpSslCurveYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpSslCurveYyyymmDomain);
	}

	   public int deleteList(List<EMpSslCurveYyyymmDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
