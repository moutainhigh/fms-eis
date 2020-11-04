/**
 * 测量点分钟电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpEngyMin202009ServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpEngyMin202009DAO;
import org.fms.eis.webapp.domain.EMpEngyMin202009Domain;
import org.fms.eis.webapp.service.IEMpEngyMin202009Service;
import org.fms.eis.webapp.vo.EMpEngyMin202009VO;

import java.util.*;

@TransactionService
public class EMpEngyMin202009ServiceImpl implements IEMpEngyMin202009Service {

    @TransactionDAO("read")
    private EMpEngyMin202009DAO eMpEngyMin202009ReadDAO;

    @TransactionDAO("write")
    private EMpEngyMin202009DAO eMpEngyMin202009WriteDAO;

    @Override
    public int insert(EMpEngyMin202009VO eMpEngyMin202009VO) {
        return eMpEngyMin202009WriteDAO.insert(eMpEngyMin202009VO.vo2Domain());
    }

    @Override
    public int update(EMpEngyMin202009VO eMpEngyMin202009VO) {
        return eMpEngyMin202009WriteDAO.update(eMpEngyMin202009VO.vo2Domain());
    }

    @Override
    public int delete(EMpEngyMin202009VO eMpEngyMin202009VO) {
        return eMpEngyMin202009WriteDAO.delete(eMpEngyMin202009VO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpEngyMin202009VO> deleteList) throws Exception {
        int num = eMpEngyMin202009WriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpEngyMin202009Domain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpEngyMin202009VO findByKey(EMpEngyMin202009VO eMpEngyMin202009VO) {
        EMpEngyMin202009Domain model = eMpEngyMin202009ReadDAO.findByKey(eMpEngyMin202009VO.vo2Domain());
        EMpEngyMin202009VO modelVo = new EMpEngyMin202009VO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpEngyMin202009VO> findByWhere(EMpEngyMin202009VO eMpEngyMin202009VO) {
        EMpEngyMin202009Domain eMpEngyMin202009Domain = eMpEngyMin202009VO.vo2Domain();
        List<EMpEngyMin202009Domain> lstDomain = eMpEngyMin202009ReadDAO.findByWhere(eMpEngyMin202009Domain);
        eMpEngyMin202009VO.setTotalRow(eMpEngyMin202009Domain.getTotalRow());
        eMpEngyMin202009VO.setPageCurrent(eMpEngyMin202009Domain.getPageCurrent());
        eMpEngyMin202009VO.setDbName(eMpEngyMin202009Domain.getDbName());
        eMpEngyMin202009VO.setPageSize(eMpEngyMin202009Domain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpEngyMin202009VO.class);
    }

}
