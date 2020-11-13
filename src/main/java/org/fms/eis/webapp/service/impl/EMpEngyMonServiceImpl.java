/**
 * 测量点月电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpEngyMonServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpEngyMonDAO;
import org.fms.eis.webapp.domain.EMpEngyMonDomain;
import org.fms.eis.webapp.service.IEMpEngyMonService;
import org.fms.eis.webapp.vo.EMpEngyMonVO;

import java.util.*;

@TransactionService
public class EMpEngyMonServiceImpl implements IEMpEngyMonService {

    @TransactionDAO("read")
    private EMpEngyMonDAO eMpEngyMonReadDAO;

    @TransactionDAO("write")
    private EMpEngyMonDAO eMpEngyMonWriteDAO;

    @Override
    public int insert(EMpEngyMonVO eMpEngyMonVO) {
        return eMpEngyMonWriteDAO.insert(eMpEngyMonVO.vo2Domain());
    }

    @Override
    public int update(EMpEngyMonVO eMpEngyMonVO) {
        return eMpEngyMonWriteDAO.update(eMpEngyMonVO.vo2Domain());
    }

    @Override
    public int delete(EMpEngyMonVO eMpEngyMonVO) {
        return eMpEngyMonWriteDAO.delete(eMpEngyMonVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpEngyMonVO> deleteList) throws Exception {
        int num = eMpEngyMonWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpEngyMonDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpEngyMonVO findByKey(EMpEngyMonVO eMpEngyMonVO) {
        EMpEngyMonDomain model = eMpEngyMonReadDAO.findByKey(eMpEngyMonVO.vo2Domain());
        EMpEngyMonVO modelVo = new EMpEngyMonVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpEngyMonVO> findByWhere(EMpEngyMonVO eMpEngyMonVO) {
        EMpEngyMonDomain eMpEngyMonDomain = eMpEngyMonVO.vo2Domain();
        List<EMpEngyMonDomain> lstDomain = eMpEngyMonReadDAO.findByWhere(eMpEngyMonDomain);
        eMpEngyMonVO.setTotalRow(eMpEngyMonDomain.getTotalRow());
        eMpEngyMonVO.setPageCurrent(eMpEngyMonDomain.getPageCurrent());
        eMpEngyMonVO.setDbName(eMpEngyMonDomain.getDbName());
        eMpEngyMonVO.setPageSize(eMpEngyMonDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpEngyMonVO.class);
    }

}
