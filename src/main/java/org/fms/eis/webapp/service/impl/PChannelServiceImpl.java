/**
 * 通道参数表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.PChannelServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PChannelDAO;
import org.fms.eis.webapp.domain.PChannelDomain;
import org.fms.eis.webapp.service.IPChannelService;
import org.fms.eis.webapp.vo.PChannelVO;

import java.util.*;

@TransactionService
public class PChannelServiceImpl implements IPChannelService {

    @TransactionDAO("read")
    private PChannelDAO pChannelReadDAO;

    @TransactionDAO("write")
    private PChannelDAO pChannelWriteDAO;

    @Override
    public int insert(PChannelVO pChannelVO) {
        return pChannelWriteDAO.insert(pChannelVO.vo2Domain());
    }

    @Override
    public int update(PChannelVO pChannelVO) {
        return pChannelWriteDAO.update(pChannelVO.vo2Domain());
    }

    @Override
    public int delete(PChannelVO pChannelVO) {
        return pChannelWriteDAO.delete(pChannelVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<PChannelVO> deleteList) throws Exception {
        int num = pChannelWriteDAO.deleteList(ReflectUtil.cast(deleteList, PChannelDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public PChannelVO findByKey(PChannelVO pChannelVO) {
        PChannelDomain model = pChannelReadDAO.findByKey(pChannelVO.vo2Domain());
        PChannelVO modelVo = new PChannelVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PChannelVO> findByWhere(PChannelVO pChannelVO) {
        PChannelDomain pChannelDomain = pChannelVO.vo2Domain();
        List<PChannelDomain> lstDomain = pChannelReadDAO.findByWhere(pChannelDomain);
        pChannelVO.setTotalRow(pChannelDomain.getTotalRow());
        pChannelVO.setPageCurrent(pChannelDomain.getPageCurrent());
        pChannelVO.setDbName(pChannelDomain.getDbName());
        pChannelVO.setPageSize(pChannelDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PChannelVO.class);
    }

}
