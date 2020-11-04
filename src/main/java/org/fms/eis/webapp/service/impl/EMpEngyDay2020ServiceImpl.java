/**
 * 测量点日电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpEngyDay2020ServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpEngyDay2020DAO;
import org.fms.eis.webapp.domain.EMpEngyDay2020Domain;
import org.fms.eis.webapp.service.IEMpEngyDay2020Service;
import org.fms.eis.webapp.vo.EMpEngyDay2020VO;

import java.util.*;

@TransactionService
public class EMpEngyDay2020ServiceImpl implements IEMpEngyDay2020Service {

    @TransactionDAO("read")
    private EMpEngyDay2020DAO eMpEngyDay2020ReadDAO;

    @TransactionDAO("write")
    private EMpEngyDay2020DAO eMpEngyDay2020WriteDAO;

    @Override
    public int insert(EMpEngyDay2020VO eMpEngyDay2020VO) {
        return eMpEngyDay2020WriteDAO.insert(eMpEngyDay2020VO.vo2Domain());
    }

    @Override
    public int update(EMpEngyDay2020VO eMpEngyDay2020VO) {
        return eMpEngyDay2020WriteDAO.update(eMpEngyDay2020VO.vo2Domain());
    }

    @Override
    public int delete(EMpEngyDay2020VO eMpEngyDay2020VO) {
        return eMpEngyDay2020WriteDAO.delete(eMpEngyDay2020VO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpEngyDay2020VO> deleteList) throws Exception {
        int num = eMpEngyDay2020WriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpEngyDay2020Domain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpEngyDay2020VO findByKey(EMpEngyDay2020VO eMpEngyDay2020VO) {
        EMpEngyDay2020Domain model = eMpEngyDay2020ReadDAO.findByKey(eMpEngyDay2020VO.vo2Domain());
        EMpEngyDay2020VO modelVo = new EMpEngyDay2020VO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpEngyDay2020VO> findByWhere(EMpEngyDay2020VO eMpEngyDay2020VO) {
        EMpEngyDay2020Domain eMpEngyDay2020Domain = eMpEngyDay2020VO.vo2Domain();
        List<EMpEngyDay2020Domain> lstDomain = eMpEngyDay2020ReadDAO.findByWhere(eMpEngyDay2020Domain);
        eMpEngyDay2020VO.setTotalRow(eMpEngyDay2020Domain.getTotalRow());
        eMpEngyDay2020VO.setPageCurrent(eMpEngyDay2020Domain.getPageCurrent());
        eMpEngyDay2020VO.setDbName(eMpEngyDay2020Domain.getDbName());
        eMpEngyDay2020VO.setPageSize(eMpEngyDay2020Domain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpEngyDay2020VO.class);
    }

}
