/**
 * 测量点电能示值曲线
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpBmCurve202009DAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpBmCurve202009Domain;

import java.util.List;

@TransactionDAO
public class EMpBmCurve202009DAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpBmCurve202009Domain> {

	@Override
	public int insert(EMpBmCurve202009Domain eMpBmCurve202009Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eMpBmCurve202009Domain);
	}

	@Override
	public int delete(EMpBmCurve202009Domain eMpBmCurve202009Domain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eMpBmCurve202009Domain);
	}

	@Override
	public EMpBmCurve202009Domain findByKey(EMpBmCurve202009Domain eMpBmCurve202009Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eMpBmCurve202009Domain);
	}

	@PaginationSupport
	@Override
	public List<EMpBmCurve202009Domain> findByWhere(EMpBmCurve202009Domain eMpBmCurve202009Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpBmCurve202009Domain);
	}

	@Override
	public int update(EMpBmCurve202009Domain eMpBmCurve202009Domain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eMpBmCurve202009Domain);
	}

	   public int deleteList(List<EMpBmCurve202009Domain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
