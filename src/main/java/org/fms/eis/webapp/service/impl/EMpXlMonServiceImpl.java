/**
 * 测量点月冻结需量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpXlMonServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpXlMonDAO;
import org.fms.eis.webapp.domain.EMpXlMonDomain;
import org.fms.eis.webapp.service.IEMpXlMonService;
import org.fms.eis.webapp.vo.EMpXlMonVO;

import java.util.*;

@TransactionService
public class EMpXlMonServiceImpl implements IEMpXlMonService {

    @TransactionDAO("read")
    private EMpXlMonDAO eMpXlMonReadDAO;

    @TransactionDAO("write")
    private EMpXlMonDAO eMpXlMonWriteDAO;

    @Override
    public int insert(EMpXlMonVO eMpXlMonVO) {
        return eMpXlMonWriteDAO.insert(eMpXlMonVO.vo2Domain());
    }

    @Override
    public int update(EMpXlMonVO eMpXlMonVO) {
        return eMpXlMonWriteDAO.update(eMpXlMonVO.vo2Domain());
    }

    @Override
    public int delete(EMpXlMonVO eMpXlMonVO) {
        return eMpXlMonWriteDAO.delete(eMpXlMonVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpXlMonVO> deleteList) throws Exception {
        int num = eMpXlMonWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpXlMonDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpXlMonVO findByKey(EMpXlMonVO eMpXlMonVO) {
        EMpXlMonDomain model = eMpXlMonReadDAO.findByKey(eMpXlMonVO.vo2Domain());
        EMpXlMonVO modelVo = new EMpXlMonVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpXlMonVO> findByWhere(EMpXlMonVO eMpXlMonVO) {
        EMpXlMonDomain eMpXlMonDomain = eMpXlMonVO.vo2Domain();
        List<EMpXlMonDomain> lstDomain = eMpXlMonReadDAO.findByWhere(eMpXlMonDomain);
        eMpXlMonVO.setTotalRow(eMpXlMonDomain.getTotalRow());
        eMpXlMonVO.setPageCurrent(eMpXlMonDomain.getPageCurrent());
        eMpXlMonVO.setDbName(eMpXlMonDomain.getDbName());
        eMpXlMonVO.setPageSize(eMpXlMonDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpXlMonVO.class);
    }

}
