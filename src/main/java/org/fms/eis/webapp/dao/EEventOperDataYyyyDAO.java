/**
 * 用户操作明细
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EEventOperDataYyyyDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EEventOperDataYyyyDomain;

import java.util.List;

@TransactionDAO
public class EEventOperDataYyyyDAO extends AbstractTransactionDAOSupport implements BaseDAO<EEventOperDataYyyyDomain> {

	@Override
	public int insert(EEventOperDataYyyyDomain eEventOperDataYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eEventOperDataYyyyDomain);
	}

	@Override
	public int delete(EEventOperDataYyyyDomain eEventOperDataYyyyDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eEventOperDataYyyyDomain);
	}

	@Override
	public EEventOperDataYyyyDomain findByKey(EEventOperDataYyyyDomain eEventOperDataYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eEventOperDataYyyyDomain);
	}

	@PaginationSupport
	@Override
	public List<EEventOperDataYyyyDomain> findByWhere(EEventOperDataYyyyDomain eEventOperDataYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eEventOperDataYyyyDomain);
	}

	@Override
	public int update(EEventOperDataYyyyDomain eEventOperDataYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eEventOperDataYyyyDomain);
	}

	   public int deleteList(List<EEventOperDataYyyyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
