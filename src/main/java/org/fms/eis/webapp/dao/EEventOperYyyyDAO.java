/**
 * 用户操作日志
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EEventOperYyyyDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EEventOperYyyyDomain;

import java.util.List;

@TransactionDAO
public class EEventOperYyyyDAO extends AbstractTransactionDAOSupport implements BaseDAO<EEventOperYyyyDomain> {

	@Override
	public int insert(EEventOperYyyyDomain eEventOperYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eEventOperYyyyDomain);
	}

	@Override
	public int delete(EEventOperYyyyDomain eEventOperYyyyDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eEventOperYyyyDomain);
	}

	@Override
	public EEventOperYyyyDomain findByKey(EEventOperYyyyDomain eEventOperYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eEventOperYyyyDomain);
	}

	@PaginationSupport
	@Override
	public List<EEventOperYyyyDomain> findByWhere(EEventOperYyyyDomain eEventOperYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eEventOperYyyyDomain);
	}

	@Override
	public int update(EEventOperYyyyDomain eEventOperYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eEventOperYyyyDomain);
	}

	   public int deleteList(List<EEventOperYyyyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
