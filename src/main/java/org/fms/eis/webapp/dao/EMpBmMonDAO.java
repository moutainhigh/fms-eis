/**
 * 测量点月冻结电能示值
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpBmMonDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpBmMonDomain;

import java.util.List;

@TransactionDAO
public class EMpBmMonDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpBmMonDomain> {

	@Override
	public int insert(EMpBmMonDomain eMpBmMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpBmMonDomain);
	}

	@Override
	public int delete(EMpBmMonDomain eMpBmMonDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpBmMonDomain);
	}

	@Override
	public EMpBmMonDomain findByKey(EMpBmMonDomain eMpBmMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpBmMonDomain);
	}

	@PaginationSupport
	@Override
	public List<EMpBmMonDomain> findByWhere(EMpBmMonDomain eMpBmMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpBmMonDomain);
	}

	@Override
	public int update(EMpBmMonDomain eMpBmMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpBmMonDomain);
	}

	   public int deleteList(List<EMpBmMonDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
