/**
 * 测量点日电量
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpEngyDay2020DAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpEngyDay2020Domain;

import java.util.List;

@TransactionDAO
public class EMpEngyDay2020DAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpEngyDay2020Domain> {

    @Override
    public int insert(EMpEngyDay2020Domain eMpEngyDay2020Domain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", eMpEngyDay2020Domain);
    }

    @Override
    public int delete(EMpEngyDay2020Domain eMpEngyDay2020Domain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", eMpEngyDay2020Domain);
    }

    @Override
    public EMpEngyDay2020Domain findByKey(EMpEngyDay2020Domain eMpEngyDay2020Domain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", eMpEngyDay2020Domain);
    }

    @PaginationSupport
    @Override
    public List<EMpEngyDay2020Domain> findByWhere(EMpEngyDay2020Domain eMpEngyDay2020Domain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpEngyDay2020Domain);
    }

    @Override
    public int update(EMpEngyDay2020Domain eMpEngyDay2020Domain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", eMpEngyDay2020Domain);
    }

    public int deleteList(List<EMpEngyDay2020Domain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

}
