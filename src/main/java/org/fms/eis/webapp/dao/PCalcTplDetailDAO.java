/**
 * 计算方案模板明细
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PCalcTplDetailDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PCalcTplDetailDomain;

import java.util.List;

@TransactionDAO
public class PCalcTplDetailDAO extends AbstractTransactionDAOSupport implements BaseDAO<PCalcTplDetailDomain> {

    @Override
    public int insert(PCalcTplDetailDomain pCalcTplDetailDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", pCalcTplDetailDomain);
    }

    @Override
    public int delete(PCalcTplDetailDomain pCalcTplDetailDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", pCalcTplDetailDomain);
    }

    @Override
    public PCalcTplDetailDomain findByKey(PCalcTplDetailDomain pCalcTplDetailDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", pCalcTplDetailDomain);
    }

    @PaginationSupport
    @Override
    public List<PCalcTplDetailDomain> findByWhere(PCalcTplDetailDomain pCalcTplDetailDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", pCalcTplDetailDomain);
    }

    @Override
    public int update(PCalcTplDetailDomain pCalcTplDetailDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", pCalcTplDetailDomain);
    }

    public int deleteList(List<PCalcTplDetailDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
