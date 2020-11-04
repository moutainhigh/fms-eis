/**
 * 测量点瞬时量曲线表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EMpSslCurve202009ServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpSslCurve202009DAO;
import org.fms.eis.webapp.domain.EMpSslCurve202009Domain;
import org.fms.eis.webapp.service.IEMpSslCurve202009Service;
import org.fms.eis.webapp.vo.EMpSslCurve202009VO;

import java.util.*;

@TransactionService
public class EMpSslCurve202009ServiceImpl implements IEMpSslCurve202009Service {

	@TransactionDAO("read")
	private EMpSslCurve202009DAO eMpSslCurve202009ReadDAO;

	@TransactionDAO("write")
	private EMpSslCurve202009DAO eMpSslCurve202009WriteDAO;

	@Override
	public int insert(EMpSslCurve202009VO eMpSslCurve202009VO) {
		return eMpSslCurve202009WriteDAO.insert(eMpSslCurve202009VO.vo2Domain());
	}

	@Override
	public int update(EMpSslCurve202009VO eMpSslCurve202009VO) {
		return eMpSslCurve202009WriteDAO.update(eMpSslCurve202009VO.vo2Domain());
	}

	@Override
	public int delete(EMpSslCurve202009VO eMpSslCurve202009VO) {
		return eMpSslCurve202009WriteDAO.delete(eMpSslCurve202009VO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EMpSslCurve202009VO> deleteList) throws Exception {
        int num = eMpSslCurve202009WriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpSslCurve202009Domain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EMpSslCurve202009VO findByKey(EMpSslCurve202009VO eMpSslCurve202009VO){
		EMpSslCurve202009Domain model= eMpSslCurve202009ReadDAO.findByKey(eMpSslCurve202009VO.vo2Domain());
		EMpSslCurve202009VO modelVo=new EMpSslCurve202009VO();
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
	public List<EMpSslCurve202009VO> findByWhere(EMpSslCurve202009VO eMpSslCurve202009VO) {
        EMpSslCurve202009Domain eMpSslCurve202009Domain=  eMpSslCurve202009VO.vo2Domain();
        List<EMpSslCurve202009Domain> lstDomain = eMpSslCurve202009ReadDAO.findByWhere(eMpSslCurve202009Domain);
        eMpSslCurve202009VO.setTotalRow(eMpSslCurve202009Domain.getTotalRow());
		eMpSslCurve202009VO.setPageCurrent(eMpSslCurve202009Domain.getPageCurrent());
		eMpSslCurve202009VO.setDbName(eMpSslCurve202009Domain.getDbName());
		eMpSslCurve202009VO.setPageSize(eMpSslCurve202009Domain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpSslCurve202009VO.class);
	}

}
