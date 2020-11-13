/**
 * 测量点电能示值曲线
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpBmCurveYyyymmServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpBmCurveYyyymmDAO;
import org.fms.eis.webapp.domain.EMpBmCurveYyyymmDomain;
import org.fms.eis.webapp.service.IEMpBmCurveYyyymmService;
import org.fms.eis.webapp.vo.EMpBmCurveYyyymmVO;

import java.util.*;

@TransactionService
public class EMpBmCurveYyyymmServiceImpl implements IEMpBmCurveYyyymmService {

    @TransactionDAO("read")
    private EMpBmCurveYyyymmDAO eMpBmCurveYyyymmReadDAO;

    @TransactionDAO("write")
    private EMpBmCurveYyyymmDAO eMpBmCurveYyyymmWriteDAO;

    @Override
    public int insert(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {
        return eMpBmCurveYyyymmWriteDAO.insert(eMpBmCurveYyyymmVO.vo2Domain());
    }

    @Override
    public int update(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {
        return eMpBmCurveYyyymmWriteDAO.update(eMpBmCurveYyyymmVO.vo2Domain());
    }

    @Override
    public int delete(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {
        return eMpBmCurveYyyymmWriteDAO.delete(eMpBmCurveYyyymmVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpBmCurveYyyymmVO> deleteList) throws Exception {
        int num = eMpBmCurveYyyymmWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpBmCurveYyyymmDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpBmCurveYyyymmVO findByKey(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {
        EMpBmCurveYyyymmDomain model = eMpBmCurveYyyymmReadDAO.findByKey(eMpBmCurveYyyymmVO.vo2Domain());
        EMpBmCurveYyyymmVO modelVo = new EMpBmCurveYyyymmVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpBmCurveYyyymmVO> findByWhere(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO) {
        EMpBmCurveYyyymmDomain eMpBmCurveYyyymmDomain = eMpBmCurveYyyymmVO.vo2Domain();
        List<EMpBmCurveYyyymmDomain> lstDomain = eMpBmCurveYyyymmReadDAO.findByWhere(eMpBmCurveYyyymmDomain);
        eMpBmCurveYyyymmVO.setTotalRow(eMpBmCurveYyyymmDomain.getTotalRow());
        eMpBmCurveYyyymmVO.setPageCurrent(eMpBmCurveYyyymmDomain.getPageCurrent());
        eMpBmCurveYyyymmVO.setDbName(eMpBmCurveYyyymmDomain.getDbName());
        eMpBmCurveYyyymmVO.setPageSize(eMpBmCurveYyyymmDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpBmCurveYyyymmVO.class);
    }

}
