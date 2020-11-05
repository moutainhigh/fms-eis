/**
 * 测量点
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PMpedDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PMpedDomain;

import java.util.List;

@TransactionDAO
public class PMpedDAO extends AbstractTransactionDAOSupport implements BaseDAO<PMpedDomain> {

	@Override
	public int insert(PMpedDomain pMpedDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", pMpedDomain);
	}

	@Override
	public int delete(PMpedDomain pMpedDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", pMpedDomain);
	}

	@Override
	public PMpedDomain findByKey(PMpedDomain pMpedDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", pMpedDomain);
	}

	@PaginationSupport
	@Override
	public List<PMpedDomain> findByWhere(PMpedDomain pMpedDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", pMpedDomain);
	}

	@Override
	public int update(PMpedDomain pMpedDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", pMpedDomain);
	}

	   public int deleteList(List<PMpedDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
