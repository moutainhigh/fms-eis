/**
 * 通道组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PChnlGroupServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PChnlGroupDAO;
import org.fms.eis.webapp.domain.PChnlGroupDomain;
import org.fms.eis.webapp.service.IPChnlGroupService;
import org.fms.eis.webapp.vo.PChnlGroupVO;

import java.util.*;

@TransactionService
public class PChnlGroupServiceImpl implements IPChnlGroupService {

    @TransactionDAO("read")
    private PChnlGroupDAO pChnlGroupReadDAO;

    @TransactionDAO("write")
    private PChnlGroupDAO pChnlGroupWriteDAO;

    @Override
    public int insert(PChnlGroupVO pChnlGroupVO) {
        return pChnlGroupWriteDAO.insert(pChnlGroupVO.vo2Domain());
    }

    @Override
    public int update(PChnlGroupVO pChnlGroupVO) {
        return pChnlGroupWriteDAO.update(pChnlGroupVO.vo2Domain());
    }

    @Override
    public int delete(PChnlGroupVO pChnlGroupVO) {
        return pChnlGroupWriteDAO.delete(pChnlGroupVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<PChnlGroupVO> deleteList) throws Exception {
        int num = pChnlGroupWriteDAO.deleteList(ReflectUtil.cast(deleteList, PChnlGroupDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public PChnlGroupVO findByKey(PChnlGroupVO pChnlGroupVO) {
        PChnlGroupDomain model = pChnlGroupReadDAO.findByKey(pChnlGroupVO.vo2Domain());
        PChnlGroupVO modelVo = new PChnlGroupVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PChnlGroupVO> findByWhere(PChnlGroupVO pChnlGroupVO) {
        PChnlGroupDomain pChnlGroupDomain = pChnlGroupVO.vo2Domain();
        List<PChnlGroupDomain> lstDomain = pChnlGroupReadDAO.findByWhere(pChnlGroupDomain);
        pChnlGroupVO.setTotalRow(pChnlGroupDomain.getTotalRow());
        pChnlGroupVO.setPageCurrent(pChnlGroupDomain.getPageCurrent());
        pChnlGroupVO.setDbName(pChnlGroupDomain.getDbName());
        pChnlGroupVO.setPageSize(pChnlGroupDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PChnlGroupVO.class);
    }

}
