/**
 * 系统节点运行信息
 * Author : 
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.ENodeInfoDAO.java
 *
**/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.ENodeInfoDomain;

import java.util.List;

@TransactionDAO
public class ENodeInfoDAO extends AbstractTransactionDAOSupport implements BaseDAO<ENodeInfoDomain> {

	@Override
	public int insert(ENodeInfoDomain eNodeInfoDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().insert(getNamespace() + ".insert", eNodeInfoDomain);
	}

	@Override
	public int delete(ENodeInfoDomain eNodeInfoDomain) {
		return getPersistanceManager().delete(getNamespace() + ".delete", eNodeInfoDomain);
	}

	@Override
	public ENodeInfoDomain findByKey(ENodeInfoDomain eNodeInfoDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().load(getNamespace() + ".findByKey", eNodeInfoDomain);
	}

	@PaginationSupport
	@Override
	public List<ENodeInfoDomain> findByWhere(ENodeInfoDomain eNodeInfoDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().find(getNamespace() + ".findByWhere", eNodeInfoDomain);
	}

	@Override
	public int update(ENodeInfoDomain eNodeInfoDomain) {
		// TODO Auto-generated method stub
		return getPersistanceManager().update(getNamespace() + ".update", eNodeInfoDomain);
	}

	   public int deleteList(List<ENodeInfoDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
