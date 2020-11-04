/**
 * 测量点瞬时量曲线表
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpSslCurve202009DAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpSslCurve202009Domain;

import java.util.List;

@TransactionDAO
public class EMpSslCurve202009DAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpSslCurve202009Domain> {

    @Override
    public int insert(EMpSslCurve202009Domain eMpSslCurve202009Domain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", eMpSslCurve202009Domain);
    }

    @Override
    public int delete(EMpSslCurve202009Domain eMpSslCurve202009Domain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", eMpSslCurve202009Domain);
    }

    @Override
    public EMpSslCurve202009Domain findByKey(EMpSslCurve202009Domain eMpSslCurve202009Domain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", eMpSslCurve202009Domain);
    }

    @PaginationSupport
    @Override
    public List<EMpSslCurve202009Domain> findByWhere(EMpSslCurve202009Domain eMpSslCurve202009Domain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpSslCurve202009Domain);
    }

    @Override
    public int update(EMpSslCurve202009Domain eMpSslCurve202009Domain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", eMpSslCurve202009Domain);
    }

    public int deleteList(List<EMpSslCurve202009Domain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
