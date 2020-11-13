/**
 * 测量点日电量
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpEngyDayYyyyServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpEngyDayYyyyDAO;
import org.fms.eis.webapp.domain.EMpEngyDayYyyyDomain;
import org.fms.eis.webapp.service.IEMpEngyDayYyyyService;
import org.fms.eis.webapp.vo.EMpEngyDayYyyyVO;

import java.util.*;

@TransactionService
public class EMpEngyDayYyyyServiceImpl implements IEMpEngyDayYyyyService {

    @TransactionDAO("read")
    private EMpEngyDayYyyyDAO eMpEngyDayYyyyReadDAO;

    @TransactionDAO("write")
    private EMpEngyDayYyyyDAO eMpEngyDayYyyyWriteDAO;

    @Override
    public int insert(EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {
        return eMpEngyDayYyyyWriteDAO.insert(eMpEngyDayYyyyVO.vo2Domain());
    }

    @Override
    public int update(EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {
        return eMpEngyDayYyyyWriteDAO.update(eMpEngyDayYyyyVO.vo2Domain());
    }

    @Override
    public int delete(EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {
        return eMpEngyDayYyyyWriteDAO.delete(eMpEngyDayYyyyVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpEngyDayYyyyVO> deleteList) throws Exception {
        int num = eMpEngyDayYyyyWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpEngyDayYyyyDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpEngyDayYyyyVO findByKey(EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {
        EMpEngyDayYyyyDomain model = eMpEngyDayYyyyReadDAO.findByKey(eMpEngyDayYyyyVO.vo2Domain());
        EMpEngyDayYyyyVO modelVo = new EMpEngyDayYyyyVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpEngyDayYyyyVO> findByWhere(EMpEngyDayYyyyVO eMpEngyDayYyyyVO) {
        EMpEngyDayYyyyDomain eMpEngyDayYyyyDomain = eMpEngyDayYyyyVO.vo2Domain();
        List<EMpEngyDayYyyyDomain> lstDomain = eMpEngyDayYyyyReadDAO.findByWhere(eMpEngyDayYyyyDomain);
        eMpEngyDayYyyyVO.setTotalRow(eMpEngyDayYyyyDomain.getTotalRow());
        eMpEngyDayYyyyVO.setPageCurrent(eMpEngyDayYyyyDomain.getPageCurrent());
        eMpEngyDayYyyyVO.setDbName(eMpEngyDayYyyyDomain.getDbName());
        eMpEngyDayYyyyVO.setPageSize(eMpEngyDayYyyyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpEngyDayYyyyVO.class);
    }

}
