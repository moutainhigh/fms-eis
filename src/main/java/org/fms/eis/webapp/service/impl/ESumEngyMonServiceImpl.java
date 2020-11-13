/**
 * 电量考核单元月电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.ESumEngyMonServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.ESumEngyMonDAO;
import org.fms.eis.webapp.domain.ESumEngyMonDomain;
import org.fms.eis.webapp.service.IESumEngyMonService;
import org.fms.eis.webapp.vo.ESumEngyMonVO;

import java.util.*;

@TransactionService
public class ESumEngyMonServiceImpl implements IESumEngyMonService {

    @TransactionDAO("read")
    private ESumEngyMonDAO eSumEngyMonReadDAO;

    @TransactionDAO("write")
    private ESumEngyMonDAO eSumEngyMonWriteDAO;

    @Override
    public int insert(ESumEngyMonVO eSumEngyMonVO) {
        return eSumEngyMonWriteDAO.insert(eSumEngyMonVO.vo2Domain());
    }

    @Override
    public int update(ESumEngyMonVO eSumEngyMonVO) {
        return eSumEngyMonWriteDAO.update(eSumEngyMonVO.vo2Domain());
    }

    @Override
    public int delete(ESumEngyMonVO eSumEngyMonVO) {
        return eSumEngyMonWriteDAO.delete(eSumEngyMonVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<ESumEngyMonVO> deleteList) throws Exception {
        int num = eSumEngyMonWriteDAO.deleteList(ReflectUtil.cast(deleteList, ESumEngyMonDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public ESumEngyMonVO findByKey(ESumEngyMonVO eSumEngyMonVO) {
        ESumEngyMonDomain model = eSumEngyMonReadDAO.findByKey(eSumEngyMonVO.vo2Domain());
        ESumEngyMonVO modelVo = new ESumEngyMonVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<ESumEngyMonVO> findByWhere(ESumEngyMonVO eSumEngyMonVO) {
        ESumEngyMonDomain eSumEngyMonDomain = eSumEngyMonVO.vo2Domain();
        List<ESumEngyMonDomain> lstDomain = eSumEngyMonReadDAO.findByWhere(eSumEngyMonDomain);
        eSumEngyMonVO.setTotalRow(eSumEngyMonDomain.getTotalRow());
        eSumEngyMonVO.setPageCurrent(eSumEngyMonDomain.getPageCurrent());
        eSumEngyMonVO.setDbName(eSumEngyMonDomain.getDbName());
        eSumEngyMonVO.setPageSize(eSumEngyMonDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, ESumEngyMonVO.class);
    }

}
