/**
 * 通道组
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PChnlGroupDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PChnlGroupDomain;
import org.fms.eis.webapp.domain.PChnlGroupStaticDomain;
import org.fms.eis.webapp.domain.PDaserverGroupStaticDomain;

import java.util.List;

@TransactionDAO
public class PChnlGroupDAO extends AbstractTransactionDAOSupport implements BaseDAO<PChnlGroupDomain> {

    @Override
    public int insert(PChnlGroupDomain pChnlGroupDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", pChnlGroupDomain);
    }

    @Override
    public int delete(PChnlGroupDomain pChnlGroupDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", pChnlGroupDomain);
    }

    @Override
    public PChnlGroupDomain findByKey(PChnlGroupDomain pChnlGroupDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", pChnlGroupDomain);
    }

    @PaginationSupport
    @Override
    public List<PChnlGroupDomain> findByWhere(PChnlGroupDomain pChnlGroupDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", pChnlGroupDomain);
    }

    @Override
    public int update(PChnlGroupDomain pChnlGroupDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", pChnlGroupDomain);
    }

    public int deleteList(List<PChnlGroupDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

	@PaginationSupport
	public List<PChnlGroupStaticDomain> findByWhereStatic(PChnlGroupStaticDomain pChnlGroupStaticDomain) {
		return getPersistanceManager().find(getNamespace() + ".findByWhereStatic", pChnlGroupStaticDomain);
	}
}
