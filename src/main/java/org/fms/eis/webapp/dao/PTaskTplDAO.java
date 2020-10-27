/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PTaskTplDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PTaskTplDomain;

import java.util.List;

@TransactionDAO
public class PTaskTplDAO extends AbstractTransactionDAOSupport implements BaseDAO<PTaskTplDomain> {

	@Override
	public int insert(PTaskTplDomain testDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", testDomain);
	}

	@Override
	public int delete(PTaskTplDomain arg0) {
		return getPersistanceManager().delete(getNamespace() + ".delete", arg0);
	}

	@PaginationSupport
	@Override
	public PTaskTplDomain findByKey(PTaskTplDomain arg0) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", arg0);
	}

	@Override
	public List<PTaskTplDomain> findByWhere(PTaskTplDomain arg0) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", arg0);
	}

	@Override
	public int update(PTaskTplDomain arg0) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", arg0);
	}

}
