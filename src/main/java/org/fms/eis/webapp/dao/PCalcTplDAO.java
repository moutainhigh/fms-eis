/**
 * 计算方案模板
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.PCalcTplDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.PCalcTplDomain;

import java.util.List;

@TransactionDAO
public class PCalcTplDAO extends AbstractTransactionDAOSupport implements BaseDAO<PCalcTplDomain> {

    @Override
    public int insert(PCalcTplDomain pCalcTplDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", pCalcTplDomain);
    }

    @Override
    public int delete(PCalcTplDomain pCalcTplDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", pCalcTplDomain);
    }

    @Override
    public PCalcTplDomain findByKey(PCalcTplDomain pCalcTplDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", pCalcTplDomain);
    }

    @PaginationSupport
    @Override
    public List<PCalcTplDomain> findByWhere(PCalcTplDomain pCalcTplDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", pCalcTplDomain);
    }

    @Override
    public int update(PCalcTplDomain pCalcTplDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", pCalcTplDomain);
    }

}
