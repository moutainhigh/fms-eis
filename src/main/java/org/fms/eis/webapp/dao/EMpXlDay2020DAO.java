/**
 * 测量点日冻结需量表
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpXlDay2020DAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpXlDay2020Domain;

import java.util.List;

@TransactionDAO
public class EMpXlDay2020DAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpXlDay2020Domain> {

	@Override
	public int insert(EMpXlDay2020Domain eMpXlDay2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpXlDay2020Domain);
	}

	@Override
	public int delete(EMpXlDay2020Domain eMpXlDay2020Domain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpXlDay2020Domain);
	}

	@Override
	public EMpXlDay2020Domain findByKey(EMpXlDay2020Domain eMpXlDay2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpXlDay2020Domain);
	}

	@PaginationSupport
	@Override
	public List<EMpXlDay2020Domain> findByWhere(EMpXlDay2020Domain eMpXlDay2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpXlDay2020Domain);
	}

	@Override
	public int update(EMpXlDay2020Domain eMpXlDay2020Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpXlDay2020Domain);
	}

	   public int deleteList(List<EMpXlDay2020Domain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
