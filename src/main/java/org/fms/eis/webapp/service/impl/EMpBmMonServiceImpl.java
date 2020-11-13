/**
 * 测量点月冻结电能示值
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpBmMonServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpBmMonDAO;
import org.fms.eis.webapp.domain.EMpBmMonDomain;
import org.fms.eis.webapp.service.IEMpBmMonService;
import org.fms.eis.webapp.vo.EMpBmMonVO;

import java.util.*;

@TransactionService
public class EMpBmMonServiceImpl implements IEMpBmMonService {

    @TransactionDAO("read")
    private EMpBmMonDAO eMpBmMonReadDAO;

    @TransactionDAO("write")
    private EMpBmMonDAO eMpBmMonWriteDAO;

    @Override
    public int insert(EMpBmMonVO eMpBmMonVO) {
        return eMpBmMonWriteDAO.insert(eMpBmMonVO.vo2Domain());
    }

    @Override
    public int update(EMpBmMonVO eMpBmMonVO) {
        return eMpBmMonWriteDAO.update(eMpBmMonVO.vo2Domain());
    }

    @Override
    public int delete(EMpBmMonVO eMpBmMonVO) {
        return eMpBmMonWriteDAO.delete(eMpBmMonVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpBmMonVO> deleteList) throws Exception {
        int num = eMpBmMonWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpBmMonDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpBmMonVO findByKey(EMpBmMonVO eMpBmMonVO) {
        EMpBmMonDomain model = eMpBmMonReadDAO.findByKey(eMpBmMonVO.vo2Domain());
        EMpBmMonVO modelVo = new EMpBmMonVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpBmMonVO> findByWhere(EMpBmMonVO eMpBmMonVO) {
        EMpBmMonDomain eMpBmMonDomain = eMpBmMonVO.vo2Domain();
        List<EMpBmMonDomain> lstDomain = eMpBmMonReadDAO.findByWhere(eMpBmMonDomain);
        eMpBmMonVO.setTotalRow(eMpBmMonDomain.getTotalRow());
        eMpBmMonVO.setPageCurrent(eMpBmMonDomain.getPageCurrent());
        eMpBmMonVO.setDbName(eMpBmMonDomain.getDbName());
        eMpBmMonVO.setPageSize(eMpBmMonDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpBmMonVO.class);
    }

}
