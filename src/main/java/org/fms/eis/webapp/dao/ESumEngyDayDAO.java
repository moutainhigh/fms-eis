/**
 * 电量考核单元日电量表
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.ESumEngyDayDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.ESumEngyDayDomain;

import java.util.List;

@TransactionDAO
public class ESumEngyDayDAO extends AbstractTransactionDAOSupport implements BaseDAO<ESumEngyDayDomain> {

	@Override
	public int insert(ESumEngyDayDomain eSumEngyDayDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eSumEngyDayDomain);
	}

	@Override
	public int delete(ESumEngyDayDomain eSumEngyDayDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eSumEngyDayDomain);
	}

	@Override
	public ESumEngyDayDomain findByKey(ESumEngyDayDomain eSumEngyDayDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eSumEngyDayDomain);
	}

	@PaginationSupport
	@Override
	public List<ESumEngyDayDomain> findByWhere(ESumEngyDayDomain eSumEngyDayDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eSumEngyDayDomain);
	}

	@Override
	public int update(ESumEngyDayDomain eSumEngyDayDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eSumEngyDayDomain);
	}

	   public int deleteList(List<ESumEngyDayDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
