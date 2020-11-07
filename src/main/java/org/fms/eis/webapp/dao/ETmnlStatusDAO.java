/**
 * 终端状态信息
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.ETmnlStatusDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.ETmnlStatusDomain;

import java.util.List;

@TransactionDAO
public class ETmnlStatusDAO extends AbstractTransactionDAOSupport implements BaseDAO<ETmnlStatusDomain> {

	@Override
	public int insert(ETmnlStatusDomain eTmnlStatusDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eTmnlStatusDomain);
	}

	@Override
	public int delete(ETmnlStatusDomain eTmnlStatusDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eTmnlStatusDomain);
	}

	@Override
	public ETmnlStatusDomain findByKey(ETmnlStatusDomain eTmnlStatusDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eTmnlStatusDomain);
	}

	@PaginationSupport
	@Override
	public List<ETmnlStatusDomain> findByWhere(ETmnlStatusDomain eTmnlStatusDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eTmnlStatusDomain);
	}

	@Override
	public int update(ETmnlStatusDomain eTmnlStatusDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eTmnlStatusDomain);
	}

	   public int deleteList(List<ETmnlStatusDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
