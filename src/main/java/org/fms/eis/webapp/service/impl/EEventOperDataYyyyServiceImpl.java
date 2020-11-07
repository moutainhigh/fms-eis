/**
 * 用户操作明细
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EEventOperDataYyyyServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EEventOperDataYyyyDAO;
import org.fms.eis.webapp.domain.EEventOperDataYyyyDomain;
import org.fms.eis.webapp.service.IEEventOperDataYyyyService;
import org.fms.eis.webapp.vo.EEventOperDataYyyyVO;

import java.util.*;

@TransactionService
public class EEventOperDataYyyyServiceImpl implements IEEventOperDataYyyyService {

	@TransactionDAO("read")
	private EEventOperDataYyyyDAO eEventOperDataYyyyReadDAO;

	@TransactionDAO("write")
	private EEventOperDataYyyyDAO eEventOperDataYyyyWriteDAO;

	@Override
	public int insert(EEventOperDataYyyyVO eEventOperDataYyyyVO) {
		return eEventOperDataYyyyWriteDAO.insert(eEventOperDataYyyyVO.vo2Domain());
	}

	@Override
	public int update(EEventOperDataYyyyVO eEventOperDataYyyyVO) {
		return eEventOperDataYyyyWriteDAO.update(eEventOperDataYyyyVO.vo2Domain());
	}

	@Override
	public int delete(EEventOperDataYyyyVO eEventOperDataYyyyVO) {
		return eEventOperDataYyyyWriteDAO.delete(eEventOperDataYyyyVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EEventOperDataYyyyVO> deleteList) throws Exception {
        int num = eEventOperDataYyyyWriteDAO.deleteList(ReflectUtil.cast(deleteList, EEventOperDataYyyyDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EEventOperDataYyyyVO findByKey(EEventOperDataYyyyVO eEventOperDataYyyyVO){
		EEventOperDataYyyyDomain model= eEventOperDataYyyyReadDAO.findByKey(eEventOperDataYyyyVO.vo2Domain());
		EEventOperDataYyyyVO modelVo=new EEventOperDataYyyyVO();
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
	public List<EEventOperDataYyyyVO> findByWhere(EEventOperDataYyyyVO eEventOperDataYyyyVO) {
        EEventOperDataYyyyDomain eEventOperDataYyyyDomain=  eEventOperDataYyyyVO.vo2Domain();
        List<EEventOperDataYyyyDomain> lstDomain = eEventOperDataYyyyReadDAO.findByWhere(eEventOperDataYyyyDomain);
        eEventOperDataYyyyVO.setTotalRow(eEventOperDataYyyyDomain.getTotalRow());
		eEventOperDataYyyyVO.setPageCurrent(eEventOperDataYyyyDomain.getPageCurrent());
		eEventOperDataYyyyVO.setDbName(eEventOperDataYyyyDomain.getDbName());
		eEventOperDataYyyyVO.setPageSize(eEventOperDataYyyyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EEventOperDataYyyyVO.class);
	}

}
