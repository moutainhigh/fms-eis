/**
 * 测量点分钟电量
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpEngyMin202009DAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpEngyMin202009Domain;

import java.util.List;

@TransactionDAO
public class EMpEngyMin202009DAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpEngyMin202009Domain> {

	@Override
	public int insert(EMpEngyMin202009Domain eMpEngyMin202009Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpEngyMin202009Domain);
	}

	@Override
	public int delete(EMpEngyMin202009Domain eMpEngyMin202009Domain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpEngyMin202009Domain);
	}

	@Override
	public EMpEngyMin202009Domain findByKey(EMpEngyMin202009Domain eMpEngyMin202009Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpEngyMin202009Domain);
	}

	@PaginationSupport
	@Override
	public List<EMpEngyMin202009Domain> findByWhere(EMpEngyMin202009Domain eMpEngyMin202009Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpEngyMin202009Domain);
	}

	@Override
	public int update(EMpEngyMin202009Domain eMpEngyMin202009Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpEngyMin202009Domain);
	}

	   public int deleteList(List<EMpEngyMin202009Domain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
