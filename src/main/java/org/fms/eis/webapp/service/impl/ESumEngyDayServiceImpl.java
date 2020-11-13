/**
 * 电量考核单元日电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.ESumEngyDayServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.ESumEngyDayDAO;
import org.fms.eis.webapp.domain.ESumEngyDayDomain;
import org.fms.eis.webapp.service.IESumEngyDayService;
import org.fms.eis.webapp.vo.ESumEngyDayVO;

import java.util.*;

@TransactionService
public class ESumEngyDayServiceImpl implements IESumEngyDayService {

    @TransactionDAO("read")
    private ESumEngyDayDAO eSumEngyDayReadDAO;

    @TransactionDAO("write")
    private ESumEngyDayDAO eSumEngyDayWriteDAO;

    @Override
    public int insert(ESumEngyDayVO eSumEngyDayVO) {
        return eSumEngyDayWriteDAO.insert(eSumEngyDayVO.vo2Domain());
    }

    @Override
    public int update(ESumEngyDayVO eSumEngyDayVO) {
        return eSumEngyDayWriteDAO.update(eSumEngyDayVO.vo2Domain());
    }

    @Override
    public int delete(ESumEngyDayVO eSumEngyDayVO) {
        return eSumEngyDayWriteDAO.delete(eSumEngyDayVO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<ESumEngyDayVO> deleteList) throws Exception {
        int num = eSumEngyDayWriteDAO.deleteList(ReflectUtil.cast(deleteList, ESumEngyDayDomain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public ESumEngyDayVO findByKey(ESumEngyDayVO eSumEngyDayVO) {
        ESumEngyDayDomain model = eSumEngyDayReadDAO.findByKey(eSumEngyDayVO.vo2Domain());
        ESumEngyDayVO modelVo = new ESumEngyDayVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<ESumEngyDayVO> findByWhere(ESumEngyDayVO eSumEngyDayVO) {
        ESumEngyDayDomain eSumEngyDayDomain = eSumEngyDayVO.vo2Domain();
        List<ESumEngyDayDomain> lstDomain = eSumEngyDayReadDAO.findByWhere(eSumEngyDayDomain);
        eSumEngyDayVO.setTotalRow(eSumEngyDayDomain.getTotalRow());
        eSumEngyDayVO.setPageCurrent(eSumEngyDayDomain.getPageCurrent());
        eSumEngyDayVO.setDbName(eSumEngyDayDomain.getDbName());
        eSumEngyDayVO.setPageSize(eSumEngyDayDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, ESumEngyDayVO.class);
    }

}
