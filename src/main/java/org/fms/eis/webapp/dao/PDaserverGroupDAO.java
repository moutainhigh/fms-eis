/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PDaserverGroupDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PDaserverGroupDomain;

import java.util.List;

@TransactionDAO
public class PDaserverGroupDAO extends AbstractTransactionDAOSupport implements BaseDAO<PDaserverGroupDomain> {

	@Override
	public int insert(PDaserverGroupDomain testDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", testDomain);
	}

	@Override
	public int delete(PDaserverGroupDomain arg0) {
		return getPersistanceManager().delete(getNamespace() + ".delete", arg0);
	}

	@PaginationSupport
	@Override
	public PDaserverGroupDomain findByKey(PDaserverGroupDomain arg0) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", arg0);
	}

	@Override
	public List<PDaserverGroupDomain> findByWhere(PDaserverGroupDomain arg0) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", arg0);
	}

	@Override
	public int update(PDaserverGroupDomain arg0) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", arg0);
	}

}
