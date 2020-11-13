/**
 * 测量点分钟电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpEngyMinYyyymmServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpEngyMinYyyymmDAO;
import org.fms.eis.webapp.domain.EMpEngyMinYyyymmDomain;
import org.fms.eis.webapp.service.IEMpEngyMinYyyymmService;
import org.fms.eis.webapp.vo.EMpEngyMinYyyymmVO;

import java.util.*;

@TransactionService
public class EMpEngyMinYyyymmServiceImpl implements IEMpEngyMinYyyymmService {

    @TransactionDAO("read")
    private EMpEngyMinYyyymmDAO eMpEngyMinYyyymmReadDAO;

    @TransactionDAO("write")
    private EMpEngyMinYyyymmDAO eMpEngyMinYyyymmWriteDAO;

    @Override
    public int insert(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {
        return eMpEngyMinYyyymmWriteDAO.insert(eMpEngyMinYyyymmVO.vo2Domain());
    }

    @Override
    public int update(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {
        return eMpEngyMinYyyymmWriteDAO.update(eMpEngyMinYyyymmVO.vo2Domain());
    }

    @Override
    public int delete(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {
        return eMpEngyMinYyyymmWriteDAO.delete(eMpEngyMinYyyymmVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpEngyMinYyyymmVO> deleteList) throws Exception {
        int num = eMpEngyMinYyyymmWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpEngyMinYyyymmDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpEngyMinYyyymmVO findByKey(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {
        EMpEngyMinYyyymmDomain model = eMpEngyMinYyyymmReadDAO.findByKey(eMpEngyMinYyyymmVO.vo2Domain());
        EMpEngyMinYyyymmVO modelVo = new EMpEngyMinYyyymmVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpEngyMinYyyymmVO> findByWhere(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO) {
        EMpEngyMinYyyymmDomain eMpEngyMinYyyymmDomain = eMpEngyMinYyyymmVO.vo2Domain();
        List<EMpEngyMinYyyymmDomain> lstDomain = eMpEngyMinYyyymmReadDAO.findByWhere(eMpEngyMinYyyymmDomain);
        eMpEngyMinYyyymmVO.setTotalRow(eMpEngyMinYyyymmDomain.getTotalRow());
        eMpEngyMinYyyymmVO.setPageCurrent(eMpEngyMinYyyymmDomain.getPageCurrent());
        eMpEngyMinYyyymmVO.setDbName(eMpEngyMinYyyymmDomain.getDbName());
        eMpEngyMinYyyymmVO.setPageSize(eMpEngyMinYyyymmDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpEngyMinYyyymmVO.class);
    }

}
