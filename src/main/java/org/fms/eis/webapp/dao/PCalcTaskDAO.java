/**
 * 计算任务
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PCalcTaskDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PCalcTaskDomain;

import java.util.List;

@TransactionDAO
public class PCalcTaskDAO extends AbstractTransactionDAOSupport implements BaseDAO<PCalcTaskDomain> {

    @Override
    public int insert(PCalcTaskDomain pCalcTaskDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", pCalcTaskDomain);
    }

    @Override
    public int delete(PCalcTaskDomain pCalcTaskDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", pCalcTaskDomain);
    }

    @Override
    public PCalcTaskDomain findByKey(PCalcTaskDomain pCalcTaskDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", pCalcTaskDomain);
    }

    @PaginationSupport
    @Override
    public List<PCalcTaskDomain> findByWhere(PCalcTaskDomain pCalcTaskDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", pCalcTaskDomain);
    }

    @Override
    public int update(PCalcTaskDomain pCalcTaskDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", pCalcTaskDomain);
    }

    public int deleteList(List<PCalcTaskDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
