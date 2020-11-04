/**
 * 测量点日冻结电能示值
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpBmDay2020DAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpBmDay2020Domain;

import java.util.List;

@TransactionDAO
public class EMpBmDay2020DAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpBmDay2020Domain> {

	@Override
	public int insert(EMpBmDay2020Domain eMpBmDay2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpBmDay2020Domain);
	}

	@Override
	public int delete(EMpBmDay2020Domain eMpBmDay2020Domain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpBmDay2020Domain);
	}

	@Override
	public EMpBmDay2020Domain findByKey(EMpBmDay2020Domain eMpBmDay2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpBmDay2020Domain);
	}

	@PaginationSupport
	@Override
	public List<EMpBmDay2020Domain> findByWhere(EMpBmDay2020Domain eMpBmDay2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpBmDay2020Domain);
	}

	@Override
	public int update(EMpBmDay2020Domain eMpBmDay2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpBmDay2020Domain);
	}

	   public int deleteList(List<EMpBmDay2020Domain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
