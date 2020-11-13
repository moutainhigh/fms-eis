/**
 * 测量点月电量
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpEngyMonDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpEngyMonDomain;

import java.util.List;

@TransactionDAO
public class EMpEngyMonDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpEngyMonDomain> {

	@Override
	public int insert(EMpEngyMonDomain eMpEngyMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpEngyMonDomain);
	}

	@Override
	public int delete(EMpEngyMonDomain eMpEngyMonDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpEngyMonDomain);
	}

	@Override
	public EMpEngyMonDomain findByKey(EMpEngyMonDomain eMpEngyMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpEngyMonDomain);
	}

	@PaginationSupport
	@Override
	public List<EMpEngyMonDomain> findByWhere(EMpEngyMonDomain eMpEngyMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpEngyMonDomain);
	}

	@Override
	public int update(EMpEngyMonDomain eMpEngyMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpEngyMonDomain);
	}

	   public int deleteList(List<EMpEngyMonDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
