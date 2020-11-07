/**
 * 主站设备事件
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EEventDevDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EEventDevDomain;

import java.util.List;

@TransactionDAO
public class EEventDevDAO extends AbstractTransactionDAOSupport implements BaseDAO<EEventDevDomain> {

	@Override
	public int insert(EEventDevDomain eEventDevDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eEventDevDomain);
	}

	@Override
	public int delete(EEventDevDomain eEventDevDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eEventDevDomain);
	}

	@Override
	public EEventDevDomain findByKey(EEventDevDomain eEventDevDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eEventDevDomain);
	}

	@PaginationSupport
	@Override
	public List<EEventDevDomain> findByWhere(EEventDevDomain eEventDevDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eEventDevDomain);
	}

	@Override
	public int update(EEventDevDomain eEventDevDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eEventDevDomain);
	}

	   public int deleteList(List<EEventDevDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
