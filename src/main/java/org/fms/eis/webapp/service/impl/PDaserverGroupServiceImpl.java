/**
 * 采集主机组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PDaserverGroupServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PDaserverGroupDAO;
import org.fms.eis.webapp.domain.PDaserverGroupDomain;
import org.fms.eis.webapp.domain.PDaserverGroupStaticDomain;
import org.fms.eis.webapp.service.IPDaserverGroupService;
import org.fms.eis.webapp.vo.PDaserverGroupStaticVO;
import org.fms.eis.webapp.vo.PDaserverGroupVO;

import java.util.*;

@TransactionService
public class PDaserverGroupServiceImpl implements IPDaserverGroupService {

    @TransactionDAO("read")
    private PDaserverGroupDAO pDaserverGroupReadDAO;

    @TransactionDAO("write")
    private PDaserverGroupDAO pDaserverGroupWriteDAO;

    @Override
    public int insert(PDaserverGroupVO pDaserverGroupVO) {
        return pDaserverGroupWriteDAO.insert(pDaserverGroupVO.vo2Domain());
    }

    @Override
    public int update(PDaserverGroupVO pDaserverGroupVO) {
        return pDaserverGroupWriteDAO.update(pDaserverGroupVO.vo2Domain());
    }

    @Override
    public int delete(PDaserverGroupVO pDaserverGroupVO) {
        return pDaserverGroupWriteDAO.delete(pDaserverGroupVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<PDaserverGroupVO> deleteList) throws Exception {
        int num = pDaserverGroupWriteDAO.deleteList(ReflectUtil.cast(deleteList, PDaserverGroupDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public PDaserverGroupVO findByKey(PDaserverGroupVO pDaserverGroupVO) {
        PDaserverGroupDomain model = pDaserverGroupReadDAO.findByKey(pDaserverGroupVO.vo2Domain());
        PDaserverGroupVO modelVo = new PDaserverGroupVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PDaserverGroupVO> findByWhere(PDaserverGroupVO pDaserverGroupVO) {
        PDaserverGroupDomain pDaserverGroupDomain = pDaserverGroupVO.vo2Domain();
        List<PDaserverGroupDomain> lstDomain = pDaserverGroupReadDAO.findByWhere(pDaserverGroupDomain);
        pDaserverGroupVO.setTotalRow(pDaserverGroupDomain.getTotalRow());
        pDaserverGroupVO.setPageCurrent(pDaserverGroupDomain.getPageCurrent());
        pDaserverGroupVO.setDbName(pDaserverGroupDomain.getDbName());
        pDaserverGroupVO.setPageSize(pDaserverGroupDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PDaserverGroupVO.class);
    }

    @Override
    public List<PDaserverGroupStaticVO> findByWhereStatic(PDaserverGroupStaticVO pDaserverGroupStaticVO) {
        PDaserverGroupStaticDomain pDaserverGroupStaticDomain = pDaserverGroupStaticVO.vo2Domain();
        List<PDaserverGroupStaticDomain> lstDomain = pDaserverGroupReadDAO.findByWhereStatic(pDaserverGroupStaticDomain);
        pDaserverGroupStaticVO.setTotalRow(pDaserverGroupStaticDomain.getTotalRow());
        pDaserverGroupStaticVO.setPageCurrent(pDaserverGroupStaticDomain.getPageCurrent());
        pDaserverGroupStaticVO.setDbName(pDaserverGroupStaticDomain.getDbName());
        pDaserverGroupStaticVO.setPageSize(pDaserverGroupStaticDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PDaserverGroupStaticVO.class);
    }

}
