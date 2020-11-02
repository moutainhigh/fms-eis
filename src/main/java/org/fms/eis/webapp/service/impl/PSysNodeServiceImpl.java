/**
 * 系统节点
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PSysNodeServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PSysNodeDAO;
import org.fms.eis.webapp.domain.PSysNodeDomain;
import org.fms.eis.webapp.service.IPSysNodeService;
import org.fms.eis.webapp.vo.PSysNodeVO;

import java.util.*;

@TransactionService
public class PSysNodeServiceImpl implements IPSysNodeService {

    @TransactionDAO("read")
    private PSysNodeDAO pSysNodeReadDAO;

    @TransactionDAO("write")
    private PSysNodeDAO pSysNodeWriteDAO;

    @Override
    public int insert(PSysNodeVO pSysNodeVO) {
        return pSysNodeWriteDAO.insert(pSysNodeVO.vo2Domain());
    }

    @Override
    public int update(PSysNodeVO pSysNodeVO) {
        return pSysNodeWriteDAO.update(pSysNodeVO.vo2Domain());
    }

    @Override
    public int delete(PSysNodeVO pSysNodeVO) {
        return pSysNodeWriteDAO.delete(pSysNodeVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<PSysNodeVO> deleteList) throws Exception {
        int num = pSysNodeWriteDAO.deleteList(ReflectUtil.cast(deleteList, PSysNodeDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public PSysNodeVO findByKey(PSysNodeVO pSysNodeVO) {
        PSysNodeDomain model = pSysNodeReadDAO.findByKey(pSysNodeVO.vo2Domain());
        PSysNodeVO modelVo = new PSysNodeVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PSysNodeVO> findByWhere(PSysNodeVO pSysNodeVO) {
        PSysNodeDomain pSysNodeDomain = pSysNodeVO.vo2Domain();
        List<PSysNodeDomain> lstDomain = pSysNodeReadDAO.findByWhere(pSysNodeDomain);
        pSysNodeVO.setTotalRow(pSysNodeDomain.getTotalRow());
        pSysNodeVO.setPageCurrent(pSysNodeDomain.getPageCurrent());
        pSysNodeVO.setDbName(pSysNodeDomain.getDbName());
        pSysNodeVO.setPageSize(pSysNodeDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PSysNodeVO.class);
    }
}
