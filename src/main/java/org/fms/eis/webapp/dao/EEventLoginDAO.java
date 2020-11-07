/**
 * 用户登录日志
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EEventLoginDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EEventLoginDomain;

import java.util.List;

@TransactionDAO
public class EEventLoginDAO extends AbstractTransactionDAOSupport implements BaseDAO<EEventLoginDomain> {

	@Override
	public int insert(EEventLoginDomain eEventLoginDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eEventLoginDomain);
	}

	@Override
	public int delete(EEventLoginDomain eEventLoginDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eEventLoginDomain);
	}

	@Override
	public EEventLoginDomain findByKey(EEventLoginDomain eEventLoginDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eEventLoginDomain);
	}

	@PaginationSupport
	@Override
	public List<EEventLoginDomain> findByWhere(EEventLoginDomain eEventLoginDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eEventLoginDomain);
	}

	@Override
	public int update(EEventLoginDomain eEventLoginDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eEventLoginDomain);
	}

	   public int deleteList(List<EEventLoginDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
