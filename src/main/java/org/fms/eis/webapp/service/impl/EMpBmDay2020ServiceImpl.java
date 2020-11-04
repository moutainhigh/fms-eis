/**
 * 测量点日冻结电能示值
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpBmDay2020ServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpBmDay2020DAO;
import org.fms.eis.webapp.domain.EMpBmDay2020Domain;
import org.fms.eis.webapp.service.IEMpBmDay2020Service;
import org.fms.eis.webapp.vo.EMpBmDay2020VO;

import java.util.*;

@TransactionService
public class EMpBmDay2020ServiceImpl implements IEMpBmDay2020Service {

    @TransactionDAO("read")
    private EMpBmDay2020DAO eMpBmDay2020ReadDAO;

    @TransactionDAO("write")
    private EMpBmDay2020DAO eMpBmDay2020WriteDAO;

    @Override
    public int insert(EMpBmDay2020VO eMpBmDay2020VO) {
        return eMpBmDay2020WriteDAO.insert(eMpBmDay2020VO.vo2Domain());
    }

    @Override
    public int update(EMpBmDay2020VO eMpBmDay2020VO) {
        return eMpBmDay2020WriteDAO.update(eMpBmDay2020VO.vo2Domain());
    }

    @Override
    public int delete(EMpBmDay2020VO eMpBmDay2020VO) {
        return eMpBmDay2020WriteDAO.delete(eMpBmDay2020VO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpBmDay2020VO> deleteList) throws Exception {
        int num = eMpBmDay2020WriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpBmDay2020Domain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpBmDay2020VO findByKey(EMpBmDay2020VO eMpBmDay2020VO) {
        EMpBmDay2020Domain model = eMpBmDay2020ReadDAO.findByKey(eMpBmDay2020VO.vo2Domain());
        EMpBmDay2020VO modelVo = new EMpBmDay2020VO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpBmDay2020VO> findByWhere(EMpBmDay2020VO eMpBmDay2020VO) {
        EMpBmDay2020Domain eMpBmDay2020Domain = eMpBmDay2020VO.vo2Domain();
        List<EMpBmDay2020Domain> lstDomain = eMpBmDay2020ReadDAO.findByWhere(eMpBmDay2020Domain);
        eMpBmDay2020VO.setTotalRow(eMpBmDay2020Domain.getTotalRow());
        eMpBmDay2020VO.setPageCurrent(eMpBmDay2020Domain.getPageCurrent());
        eMpBmDay2020VO.setDbName(eMpBmDay2020Domain.getDbName());
        eMpBmDay2020VO.setPageSize(eMpBmDay2020Domain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpBmDay2020VO.class);
    }

}
