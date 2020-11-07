/**
 * 电力计划表
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EPlanYyyyDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EPlanYyyyDomain;

import java.util.List;

@TransactionDAO
public class EPlanYyyyDAO extends AbstractTransactionDAOSupport implements BaseDAO<EPlanYyyyDomain> {

	@Override
	public int insert(EPlanYyyyDomain ePlanYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", ePlanYyyyDomain);
	}

	@Override
	public int delete(EPlanYyyyDomain ePlanYyyyDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", ePlanYyyyDomain);
	}

	@Override
	public EPlanYyyyDomain findByKey(EPlanYyyyDomain ePlanYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", ePlanYyyyDomain);
	}

	@PaginationSupport
	@Override
	public List<EPlanYyyyDomain> findByWhere(EPlanYyyyDomain ePlanYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", ePlanYyyyDomain);
	}

	@Override
	public int update(EPlanYyyyDomain ePlanYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", ePlanYyyyDomain);
	}

	   public int deleteList(List<EPlanYyyyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
