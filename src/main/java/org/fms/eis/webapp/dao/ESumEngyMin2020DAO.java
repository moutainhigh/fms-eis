/**
 * 电量考核单元分钟电量表
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.ESumEngyMin2020DAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.ESumEngyMin2020Domain;

import java.util.List;

@TransactionDAO
public class ESumEngyMin2020DAO extends AbstractTransactionDAOSupport implements BaseDAO<ESumEngyMin2020Domain> {

	@Override
	public int insert(ESumEngyMin2020Domain eSumEngyMin2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eSumEngyMin2020Domain);
	}

	@Override
	public int delete(ESumEngyMin2020Domain eSumEngyMin2020Domain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eSumEngyMin2020Domain);
	}

	@Override
	public ESumEngyMin2020Domain findByKey(ESumEngyMin2020Domain eSumEngyMin2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eSumEngyMin2020Domain);
	}

	@PaginationSupport
	@Override
	public List<ESumEngyMin2020Domain> findByWhere(ESumEngyMin2020Domain eSumEngyMin2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eSumEngyMin2020Domain);
	}

	@Override
	public int update(ESumEngyMin2020Domain eSumEngyMin2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eSumEngyMin2020Domain);
	}

	   public int deleteList(List<ESumEngyMin2020Domain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
