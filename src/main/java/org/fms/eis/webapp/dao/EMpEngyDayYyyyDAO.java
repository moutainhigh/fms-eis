/**
 * 测量点日电量
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpEngyDayYyyyDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpEngyDayYyyyDomain;

import java.util.List;

@TransactionDAO
public class EMpEngyDayYyyyDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpEngyDayYyyyDomain> {

	@Override
	public int insert(EMpEngyDayYyyyDomain eMpEngyDayYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpEngyDayYyyyDomain);
	}

	@Override
	public int delete(EMpEngyDayYyyyDomain eMpEngyDayYyyyDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpEngyDayYyyyDomain);
	}

	@Override
	public EMpEngyDayYyyyDomain findByKey(EMpEngyDayYyyyDomain eMpEngyDayYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpEngyDayYyyyDomain);
	}

	@PaginationSupport
	@Override
	public List<EMpEngyDayYyyyDomain> findByWhere(EMpEngyDayYyyyDomain eMpEngyDayYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpEngyDayYyyyDomain);
	}

	@Override
	public int update(EMpEngyDayYyyyDomain eMpEngyDayYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpEngyDayYyyyDomain);
	}

	   public int deleteList(List<EMpEngyDayYyyyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
