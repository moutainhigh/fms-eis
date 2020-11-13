/**
 * 测量点日冻结需量表
 * Author :
 * Date : 2020年10月22日 上午9:59:25
 * Title : org.fms.eis.webapp.dao.EMpXlDayYyyyDAO.java
 **/
package org.fms.eis.webapp.dao;

import com.riozenc.titanTool.annotation.PaginationSupport;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.spring.webapp.dao.AbstractTransactionDAOSupport;
import com.riozenc.titanTool.spring.webapp.dao.BaseDAO;
import org.fms.eis.webapp.domain.EMpXlDayYyyyDomain;
import org.fms.eis.webapp.helper.EMpXlDayYyyyPara;
import org.fms.eis.webapp.vo.EMpXlDayYyyyVO;

import java.util.List;

@TransactionDAO
public class EMpXlDayYyyyDAO extends AbstractTransactionDAOSupport implements BaseDAO<EMpXlDayYyyyDomain> {

    @Override
    public int insert(EMpXlDayYyyyDomain eMpXlDayYyyyDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().insert(getNamespace() + ".insert", eMpXlDayYyyyDomain);
    }

    @Override
    public int delete(EMpXlDayYyyyDomain eMpXlDayYyyyDomain) {
        return getPersistanceManager().delete(getNamespace() + ".delete", eMpXlDayYyyyDomain);
    }

    @Override
    public EMpXlDayYyyyDomain findByKey(EMpXlDayYyyyDomain eMpXlDayYyyyDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().load(getNamespace() + ".findByKey", eMpXlDayYyyyDomain);
    }

    @PaginationSupport
    @Override
    public List<EMpXlDayYyyyDomain> findByWhere(EMpXlDayYyyyDomain eMpXlDayYyyyDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().find(getNamespace() + ".findByWhere", eMpXlDayYyyyDomain);
    }

    @Override
    public int update(EMpXlDayYyyyDomain eMpXlDayYyyyDomain) {
        // TODO Auto-generated method stub
        return getPersistanceManager().update(getNamespace() + ".update", eMpXlDayYyyyDomain);
    }

    public int deleteList(List<EMpXlDayYyyyDomain> deleteList) {
        return getPersistanceManager().deleteList(getNamespace() + ".delete", deleteList);
    }

    /**
     * 通过条件获取数目
     *
     * @param para
     * @return
     */
    public int getCountByWhere(EMpXlDayYyyyPara para) {
        return getPersistanceManager().load(getNamespace() + ".getCountByWhere", para);
    }

    /**
     * 通过条件获取集合
     *
     * @param para
     * @return
     */
    public List<EMpXlDayYyyyDomain> getListByWhere(EMpXlDayYyyyPara para) {
        return getPersistanceManager().find(getNamespace() + ".getListByWhere", para);
    }

    public int insertList(List<EMpXlDayYyyyVO> list){
        return getPersistanceManager().insertList(getNamespace() + ".insert", list);
    }
}
