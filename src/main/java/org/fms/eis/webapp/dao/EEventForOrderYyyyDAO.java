/**
 * 工单相关异常事件
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EEventForOrderYyyyDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EEventForOrderYyyyDomain;

import java.util.List;

@TransactionDAO
public class EEventForOrderYyyyDAO extends AbstractTransactionDAOSupport implements BaseDAO<EEventForOrderYyyyDomain> {

	@Override
	public int insert(EEventForOrderYyyyDomain eEventForOrderYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eEventForOrderYyyyDomain);
	}

	@Override
	public int delete(EEventForOrderYyyyDomain eEventForOrderYyyyDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eEventForOrderYyyyDomain);
	}

	@Override
	public EEventForOrderYyyyDomain findByKey(EEventForOrderYyyyDomain eEventForOrderYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eEventForOrderYyyyDomain);
	}

	@PaginationSupport
	@Override
	public List<EEventForOrderYyyyDomain> findByWhere(EEventForOrderYyyyDomain eEventForOrderYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eEventForOrderYyyyDomain);
	}

	@Override
	public int update(EEventForOrderYyyyDomain eEventForOrderYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eEventForOrderYyyyDomain);
	}

	   public int deleteList(List<EEventForOrderYyyyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
