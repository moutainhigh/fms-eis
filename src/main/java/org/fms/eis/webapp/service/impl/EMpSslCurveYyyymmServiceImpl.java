/**
 * 测量点瞬时量曲线表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpSslCurveYyyymmServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpSslCurveYyyymmDAO;
import org.fms.eis.webapp.domain.EMpSslCurveYyyymmDomain;
import org.fms.eis.webapp.service.IEMpSslCurveYyyymmService;
import org.fms.eis.webapp.vo.EMpSslCurveYyyymmVO;

import java.util.*;

@TransactionService
public class EMpSslCurveYyyymmServiceImpl implements IEMpSslCurveYyyymmService {

    @TransactionDAO("read")
    private EMpSslCurveYyyymmDAO eMpSslCurveYyyymmReadDAO;

    @TransactionDAO("write")
    private EMpSslCurveYyyymmDAO eMpSslCurveYyyymmWriteDAO;

    @Override
    public int insert(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {
        return eMpSslCurveYyyymmWriteDAO.insert(eMpSslCurveYyyymmVO.vo2Domain());
    }

    @Override
    public int update(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {
        return eMpSslCurveYyyymmWriteDAO.update(eMpSslCurveYyyymmVO.vo2Domain());
    }

    @Override
    public int delete(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {
        return eMpSslCurveYyyymmWriteDAO.delete(eMpSslCurveYyyymmVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpSslCurveYyyymmVO> deleteList) throws Exception {
        int num = eMpSslCurveYyyymmWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpSslCurveYyyymmDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpSslCurveYyyymmVO findByKey(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {
        EMpSslCurveYyyymmDomain model = eMpSslCurveYyyymmReadDAO.findByKey(eMpSslCurveYyyymmVO.vo2Domain());
        EMpSslCurveYyyymmVO modelVo = new EMpSslCurveYyyymmVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpSslCurveYyyymmVO> findByWhere(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO) {
        EMpSslCurveYyyymmDomain eMpSslCurveYyyymmDomain = eMpSslCurveYyyymmVO.vo2Domain();
        List<EMpSslCurveYyyymmDomain> lstDomain = eMpSslCurveYyyymmReadDAO.findByWhere(eMpSslCurveYyyymmDomain);
        eMpSslCurveYyyymmVO.setTotalRow(eMpSslCurveYyyymmDomain.getTotalRow());
        eMpSslCurveYyyymmVO.setPageCurrent(eMpSslCurveYyyymmDomain.getPageCurrent());
        eMpSslCurveYyyymmVO.setDbName(eMpSslCurveYyyymmDomain.getDbName());
        eMpSslCurveYyyymmVO.setPageSize(eMpSslCurveYyyymmDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpSslCurveYyyymmVO.class);
    }

}
