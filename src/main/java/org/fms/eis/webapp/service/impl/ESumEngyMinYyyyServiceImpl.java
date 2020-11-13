/**
 * 电量考核单元分钟电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.ESumEngyMinYyyyServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.ESumEngyMinYyyyDAO;
import org.fms.eis.webapp.domain.ESumEngyMinYyyyDomain;
import org.fms.eis.webapp.service.IESumEngyMinYyyyService;
import org.fms.eis.webapp.vo.ESumEngyMinYyyyVO;

import java.util.*;

@TransactionService
public class ESumEngyMinYyyyServiceImpl implements IESumEngyMinYyyyService {

    @TransactionDAO("read")
    private ESumEngyMinYyyyDAO eSumEngyMinYyyyReadDAO;

    @TransactionDAO("write")
    private ESumEngyMinYyyyDAO eSumEngyMinYyyyWriteDAO;

    @Override
    public int insert(ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {
        return eSumEngyMinYyyyWriteDAO.insert(eSumEngyMinYyyyVO.vo2Domain());
    }

    @Override
    public int update(ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {
        return eSumEngyMinYyyyWriteDAO.update(eSumEngyMinYyyyVO.vo2Domain());
    }

    @Override
    public int delete(ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {
        return eSumEngyMinYyyyWriteDAO.delete(eSumEngyMinYyyyVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<ESumEngyMinYyyyVO> deleteList) throws Exception {
        int num = eSumEngyMinYyyyWriteDAO.deleteList(ReflectUtil.cast(deleteList, ESumEngyMinYyyyDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public ESumEngyMinYyyyVO findByKey(ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {
        ESumEngyMinYyyyDomain model = eSumEngyMinYyyyReadDAO.findByKey(eSumEngyMinYyyyVO.vo2Domain());
        ESumEngyMinYyyyVO modelVo = new ESumEngyMinYyyyVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<ESumEngyMinYyyyVO> findByWhere(ESumEngyMinYyyyVO eSumEngyMinYyyyVO) {
        ESumEngyMinYyyyDomain eSumEngyMinYyyyDomain = eSumEngyMinYyyyVO.vo2Domain();
        List<ESumEngyMinYyyyDomain> lstDomain = eSumEngyMinYyyyReadDAO.findByWhere(eSumEngyMinYyyyDomain);
        eSumEngyMinYyyyVO.setTotalRow(eSumEngyMinYyyyDomain.getTotalRow());
        eSumEngyMinYyyyVO.setPageCurrent(eSumEngyMinYyyyDomain.getPageCurrent());
        eSumEngyMinYyyyVO.setDbName(eSumEngyMinYyyyDomain.getDbName());
        eSumEngyMinYyyyVO.setPageSize(eSumEngyMinYyyyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, ESumEngyMinYyyyVO.class);
    }

}
