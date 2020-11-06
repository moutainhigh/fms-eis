/**
 * 设备装拆记录表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.SDevIrServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.SDevIrDAO;
import org.fms.eis.webapp.domain.SDevIrDomain;
import org.fms.eis.webapp.service.ISDevIrService;
import org.fms.eis.webapp.vo.SDevIrVO;

import java.util.*;

@TransactionService
public class SDevIrServiceImpl implements ISDevIrService {

    @TransactionDAO("read")
    private SDevIrDAO sDevIrReadDAO;

    @TransactionDAO("write")
    private SDevIrDAO sDevIrWriteDAO;

    @Override
    public int insert(SDevIrVO sDevIrVO) {
        return sDevIrWriteDAO.insert(sDevIrVO.vo2Domain());
    }

    @Override
    public int update(SDevIrVO sDevIrVO) {
        return sDevIrWriteDAO.update(sDevIrVO.vo2Domain());
    }

    @Override
    public int delete(SDevIrVO sDevIrVO) {
        return sDevIrWriteDAO.delete(sDevIrVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<SDevIrVO> deleteList) throws Exception {
        int num = sDevIrWriteDAO.deleteList(ReflectUtil.cast(deleteList, SDevIrDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public SDevIrVO findByKey(SDevIrVO sDevIrVO) {
        SDevIrDomain model = sDevIrReadDAO.findByKey(sDevIrVO.vo2Domain());
        SDevIrVO modelVo = new SDevIrVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<SDevIrVO> findByWhere(SDevIrVO sDevIrVO) {
        SDevIrDomain sDevIrDomain = sDevIrVO.vo2Domain();
        List<SDevIrDomain> lstDomain = sDevIrReadDAO.findByWhere(sDevIrDomain);
        sDevIrVO.setTotalRow(sDevIrDomain.getTotalRow());
        sDevIrVO.setPageCurrent(sDevIrDomain.getPageCurrent());
        sDevIrVO.setDbName(sDevIrDomain.getDbName());
        sDevIrVO.setPageSize(sDevIrDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, SDevIrVO.class);
    }

}
