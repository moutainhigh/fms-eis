/**
 * 采集任务
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PTaskDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PTaskDomain;
import org.fms.eis.webapp.domain.PTaskRelDomain;

import java.util.List;

@TransactionDAO
public class PTaskDAO extends AbstractTransactionDAOSupport implements BaseDAO<PTaskDomain> {

    @Override
    public int insert(PTaskDomain pTaskDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", pTaskDomain);
    }

    @Override
    public int delete(PTaskDomain pTaskDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", pTaskDomain);
    }

    @Override
    public PTaskDomain findByKey(PTaskDomain pTaskDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", pTaskDomain);
    }

    @PaginationSupport
    @Override
    public List<PTaskDomain> findByWhere(PTaskDomain pTaskDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", pTaskDomain);
    }

    @Override
    public int update(PTaskDomain pTaskDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", pTaskDomain);
    }

    public int deleteList(List<PTaskDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

    @PaginationSupport
    public List<PTaskRelDomain> findByTaskTpl(PTaskRelDomain modelDomain) {
        return getPersistanceManager().find(getNamespace() + ".findByTaskTpl", modelDomain);
    }
}
