/**
 * 终端状态历史信息
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.ETmnlStatusHisYyyymmDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.ETmnlStatusHisYyyymmDomain;

import java.util.List;

@TransactionDAO
public class ETmnlStatusHisYyyymmDAO extends AbstractTransactionDAOSupport implements BaseDAO<ETmnlStatusHisYyyymmDomain> {

	@Override
	public int insert(ETmnlStatusHisYyyymmDomain eTmnlStatusHisYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eTmnlStatusHisYyyymmDomain);
	}

	@Override
	public int delete(ETmnlStatusHisYyyymmDomain eTmnlStatusHisYyyymmDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eTmnlStatusHisYyyymmDomain);
	}

	@Override
	public ETmnlStatusHisYyyymmDomain findByKey(ETmnlStatusHisYyyymmDomain eTmnlStatusHisYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eTmnlStatusHisYyyymmDomain);
	}

	@PaginationSupport
	@Override
	public List<ETmnlStatusHisYyyymmDomain> findByWhere(ETmnlStatusHisYyyymmDomain eTmnlStatusHisYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eTmnlStatusHisYyyymmDomain);
	}

	@Override
	public int update(ETmnlStatusHisYyyymmDomain eTmnlStatusHisYyyymmDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eTmnlStatusHisYyyymmDomain);
	}

	   public int deleteList(List<ETmnlStatusHisYyyymmDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
