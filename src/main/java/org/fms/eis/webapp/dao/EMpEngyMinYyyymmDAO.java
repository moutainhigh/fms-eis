/**
 * 测量点分钟电量
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpEngyMinYyyymmDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpEngyMinYyyymmDomain;

import java.util.List;

@TransactionDAO
public class EMpEngyMinYyyymmDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpEngyMinYyyymmDomain> {

	@Override
	public int insert(EMpEngyMinYyyymmDomain eMpEngyMinYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpEngyMinYyyymmDomain);
	}

	@Override
	public int delete(EMpEngyMinYyyymmDomain eMpEngyMinYyyymmDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpEngyMinYyyymmDomain);
	}

	@Override
	public EMpEngyMinYyyymmDomain findByKey(EMpEngyMinYyyymmDomain eMpEngyMinYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpEngyMinYyyymmDomain);
	}

	@PaginationSupport
	@Override
	public List<EMpEngyMinYyyymmDomain> findByWhere(EMpEngyMinYyyymmDomain eMpEngyMinYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpEngyMinYyyymmDomain);
	}

	@Override
	public int update(EMpEngyMinYyyymmDomain eMpEngyMinYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpEngyMinYyyymmDomain);
	}

	   public int deleteList(List<EMpEngyMinYyyymmDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
