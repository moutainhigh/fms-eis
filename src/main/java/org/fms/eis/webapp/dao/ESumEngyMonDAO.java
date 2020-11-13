/**
 * 电量考核单元月电量表
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.ESumEngyMonDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.ESumEngyMonDomain;

import java.util.List;

@TransactionDAO
public class ESumEngyMonDAO extends AbstractTransactionDAOSupport implements BaseDAO<ESumEngyMonDomain> {

	@Override
	public int insert(ESumEngyMonDomain eSumEngyMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eSumEngyMonDomain);
	}

	@Override
	public int delete(ESumEngyMonDomain eSumEngyMonDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eSumEngyMonDomain);
	}

	@Override
	public ESumEngyMonDomain findByKey(ESumEngyMonDomain eSumEngyMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eSumEngyMonDomain);
	}

	@PaginationSupport
	@Override
	public List<ESumEngyMonDomain> findByWhere(ESumEngyMonDomain eSumEngyMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eSumEngyMonDomain);
	}

	@Override
	public int update(ESumEngyMonDomain eSumEngyMonDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eSumEngyMonDomain);
	}

	   public int deleteList(List<ESumEngyMonDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
