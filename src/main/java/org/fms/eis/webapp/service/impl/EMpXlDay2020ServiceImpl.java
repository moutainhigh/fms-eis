/**
 * 测量点日冻结需量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.EMpXlDay2020ServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpXlDay2020DAO;
import org.fms.eis.webapp.domain.EMpXlDay2020Domain;
import org.fms.eis.webapp.service.IEMpXlDay2020Service;
import org.fms.eis.webapp.vo.EMpXlDay2020VO;

import java.util.*;

@TransactionService
public class EMpXlDay2020ServiceImpl implements IEMpXlDay2020Service {

    @TransactionDAO("read")
    private EMpXlDay2020DAO eMpXlDay2020ReadDAO;

    @TransactionDAO("write")
    private EMpXlDay2020DAO eMpXlDay2020WriteDAO;

    @Override
    public int insert(EMpXlDay2020VO eMpXlDay2020VO) {
        return eMpXlDay2020WriteDAO.insert(eMpXlDay2020VO.vo2Domain());
    }

    @Override
    public int update(EMpXlDay2020VO eMpXlDay2020VO) {
        return eMpXlDay2020WriteDAO.update(eMpXlDay2020VO.vo2Domain());
    }

    @Override
    public int delete(EMpXlDay2020VO eMpXlDay2020VO) {
        return eMpXlDay2020WriteDAO.delete(eMpXlDay2020VO.vo2Domain());
    }

    @Override
    public HttpResult deleteList(List<EMpXlDay2020VO> deleteList) throws Exception {
        int num = eMpXlDay2020WriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpXlDay2020Domain.class));
        if (num == deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功，删除条数：" + num);
        } else {
            throw new Exception();
        }
    }

    @Override
    public EMpXlDay2020VO findByKey(EMpXlDay2020VO eMpXlDay2020VO) {
        EMpXlDay2020Domain model = eMpXlDay2020ReadDAO.findByKey(eMpXlDay2020VO.vo2Domain());
        EMpXlDay2020VO modelVo = new EMpXlDay2020VO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<EMpXlDay2020VO> findByWhere(EMpXlDay2020VO eMpXlDay2020VO) {
        EMpXlDay2020Domain eMpXlDay2020Domain = eMpXlDay2020VO.vo2Domain();
        List<EMpXlDay2020Domain> lstDomain = eMpXlDay2020ReadDAO.findByWhere(eMpXlDay2020Domain);
        eMpXlDay2020VO.setTotalRow(eMpXlDay2020Domain.getTotalRow());
        eMpXlDay2020VO.setPageCurrent(eMpXlDay2020Domain.getPageCurrent());
        eMpXlDay2020VO.setDbName(eMpXlDay2020Domain.getDbName());
        eMpXlDay2020VO.setPageSize(eMpXlDay2020Domain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpXlDay2020VO.class);
    }

}
