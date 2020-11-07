/**
 * 追加电量表
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpAppendDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpAppendDomain;

import java.util.List;

@TransactionDAO
public class EMpAppendDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpAppendDomain> {

	@Override
	public int insert(EMpAppendDomain eMpAppendDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpAppendDomain);
	}

	@Override
	public int delete(EMpAppendDomain eMpAppendDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpAppendDomain);
	}

	@Override
	public EMpAppendDomain findByKey(EMpAppendDomain eMpAppendDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpAppendDomain);
	}

	@PaginationSupport
	@Override
	public List<EMpAppendDomain> findByWhere(EMpAppendDomain eMpAppendDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpAppendDomain);
	}

	@Override
	public int update(EMpAppendDomain eMpAppendDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpAppendDomain);
	}

	   public int deleteList(List<EMpAppendDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
