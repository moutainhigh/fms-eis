/**
 * 测量点电能示值曲线
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EMpBmCurve202009ServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpBmCurve202009DAO;
import org.fms.eis.webapp.domain.EMpBmCurve202009Domain;
import org.fms.eis.webapp.service.IEMpBmCurve202009Service;
import org.fms.eis.webapp.vo.EMpBmCurve202009VO;

import java.util.*;

@TransactionService
public class EMpBmCurve202009ServiceImpl implements IEMpBmCurve202009Service {

	@TransactionDAO("read")
	private EMpBmCurve202009DAO eMpBmCurve202009ReadDAO;

	@TransactionDAO("write")
	private EMpBmCurve202009DAO eMpBmCurve202009WriteDAO;

	@Override
	public int insert(EMpBmCurve202009VO eMpBmCurve202009VO) {
		return eMpBmCurve202009WriteDAO.insert(eMpBmCurve202009VO.vo2Domain());
	}

	@Override
	public int update(EMpBmCurve202009VO eMpBmCurve202009VO) {
		return eMpBmCurve202009WriteDAO.update(eMpBmCurve202009VO.vo2Domain());
	}

	@Override
	public int delete(EMpBmCurve202009VO eMpBmCurve202009VO) {
		return eMpBmCurve202009WriteDAO.delete(eMpBmCurve202009VO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EMpBmCurve202009VO> deleteList) throws Exception {
        int num = eMpBmCurve202009WriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpBmCurve202009Domain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EMpBmCurve202009VO findByKey(EMpBmCurve202009VO eMpBmCurve202009VO){
		EMpBmCurve202009Domain model= eMpBmCurve202009ReadDAO.findByKey(eMpBmCurve202009VO.vo2Domain());
		EMpBmCurve202009VO modelVo=new EMpBmCurve202009VO();
		if(model!=null)
		{
			modelVo=model.domain2VO();
		}
		else
		{
			modelVo=null;
		}
		return modelVo;
	}

	@Override
	public List<EMpBmCurve202009VO> findByWhere(EMpBmCurve202009VO eMpBmCurve202009VO) {
        EMpBmCurve202009Domain eMpBmCurve202009Domain=  eMpBmCurve202009VO.vo2Domain();
        List<EMpBmCurve202009Domain> lstDomain = eMpBmCurve202009ReadDAO.findByWhere(eMpBmCurve202009Domain);
        eMpBmCurve202009VO.setTotalRow(eMpBmCurve202009Domain.getTotalRow());
		eMpBmCurve202009VO.setPageCurrent(eMpBmCurve202009Domain.getPageCurrent());
		eMpBmCurve202009VO.setDbName(eMpBmCurve202009Domain.getDbName());
		eMpBmCurve202009VO.setPageSize(eMpBmCurve202009Domain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpBmCurve202009VO.class);
	}

}
