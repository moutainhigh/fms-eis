/**
 * 电量考核单元分钟电量表
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.ESumEngyMinYyyyDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.ESumEngyMinYyyyDomain;

import java.util.List;

@TransactionDAO
public class ESumEngyMinYyyyDAO extends AbstractTransactionDAOSupport implements BaseDAO<ESumEngyMinYyyyDomain> {

	@Override
	public int insert(ESumEngyMinYyyyDomain eSumEngyMinYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eSumEngyMinYyyyDomain);
	}

	@Override
	public int delete(ESumEngyMinYyyyDomain eSumEngyMinYyyyDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eSumEngyMinYyyyDomain);
	}

	@Override
	public ESumEngyMinYyyyDomain findByKey(ESumEngyMinYyyyDomain eSumEngyMinYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eSumEngyMinYyyyDomain);
	}

	@PaginationSupport
	@Override
	public List<ESumEngyMinYyyyDomain> findByWhere(ESumEngyMinYyyyDomain eSumEngyMinYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eSumEngyMinYyyyDomain);
	}

	@Override
	public int update(ESumEngyMinYyyyDomain eSumEngyMinYyyyDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eSumEngyMinYyyyDomain);
	}

	   public int deleteList(List<ESumEngyMinYyyyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
