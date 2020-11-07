/**
 * 异常检测事件
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EEventCheckDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EEventCheckDomain;

import java.util.List;

@TransactionDAO
public class EEventCheckDAO extends AbstractTransactionDAOSupport implements BaseDAO<EEventCheckDomain> {

	@Override
	public int insert(EEventCheckDomain eEventCheckDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eEventCheckDomain);
	}

	@Override
	public int delete(EEventCheckDomain eEventCheckDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eEventCheckDomain);
	}

	@Override
	public EEventCheckDomain findByKey(EEventCheckDomain eEventCheckDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eEventCheckDomain);
	}

	@PaginationSupport
	@Override
	public List<EEventCheckDomain> findByWhere(EEventCheckDomain eEventCheckDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eEventCheckDomain);
	}

	@Override
	public int update(EEventCheckDomain eEventCheckDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eEventCheckDomain);
	}

	   public int deleteList(List<EEventCheckDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
