/**
 * 表码电量审核
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EEngyVerifyDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EEngyVerifyDomain;

import java.util.List;

@TransactionDAO
public class EEngyVerifyDAO extends AbstractTransactionDAOSupport implements BaseDAO<EEngyVerifyDomain> {

	@Override
	public int insert(EEngyVerifyDomain eEngyVerifyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eEngyVerifyDomain);
	}

	@Override
	public int delete(EEngyVerifyDomain eEngyVerifyDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eEngyVerifyDomain);
	}

	@Override
	public EEngyVerifyDomain findByKey(EEngyVerifyDomain eEngyVerifyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eEngyVerifyDomain);
	}

	@PaginationSupport
	@Override
	public List<EEngyVerifyDomain> findByWhere(EEngyVerifyDomain eEngyVerifyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eEngyVerifyDomain);
	}

	@Override
	public int update(EEngyVerifyDomain eEngyVerifyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eEngyVerifyDomain);
	}

	   public int deleteList(List<EEngyVerifyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
