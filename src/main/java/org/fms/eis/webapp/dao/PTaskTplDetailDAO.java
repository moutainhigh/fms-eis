/**
 * 采集任务模板明细
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PTaskTplDetailDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PTaskTplDetailDomain;

import java.util.List;

@TransactionDAO
public class PTaskTplDetailDAO extends AbstractTransactionDAOSupport implements BaseDAO<PTaskTplDetailDomain> {

    @Override
    public int insert(PTaskTplDetailDomain pTaskTplDetailDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", pTaskTplDetailDomain);
    }

    @Override
    public int delete(PTaskTplDetailDomain pTaskTplDetailDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", pTaskTplDetailDomain);
    }

    @Override
    public PTaskTplDetailDomain findByKey(PTaskTplDetailDomain pTaskTplDetailDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", pTaskTplDetailDomain);
    }

    @PaginationSupport
    @Override
    public List<PTaskTplDetailDomain> findByWhere(PTaskTplDetailDomain pTaskTplDetailDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", pTaskTplDetailDomain);
    }

    @Override
    public int update(PTaskTplDetailDomain pTaskTplDetailDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", pTaskTplDetailDomain);
    }

}
