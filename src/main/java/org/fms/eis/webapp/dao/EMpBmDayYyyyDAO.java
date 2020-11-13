/**
 * 测量点日冻结电能示值
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpBmDayYyyyDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpBmDayYyyyDomain;

import java.util.List;

@TransactionDAO
public class EMpBmDayYyyyDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpBmDayYyyyDomain> {

	@Override
	public int insert(EMpBmDayYyyyDomain eMpBmDayYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpBmDayYyyyDomain);
	}

	@Override
	public int delete(EMpBmDayYyyyDomain eMpBmDayYyyyDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpBmDayYyyyDomain);
	}

	@Override
	public EMpBmDayYyyyDomain findByKey(EMpBmDayYyyyDomain eMpBmDayYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpBmDayYyyyDomain);
	}

	@PaginationSupport
	@Override
	public List<EMpBmDayYyyyDomain> findByWhere(EMpBmDayYyyyDomain eMpBmDayYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpBmDayYyyyDomain);
	}

	@Override
	public int update(EMpBmDayYyyyDomain eMpBmDayYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpBmDayYyyyDomain);
	}

	   public int deleteList(List<EMpBmDayYyyyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
