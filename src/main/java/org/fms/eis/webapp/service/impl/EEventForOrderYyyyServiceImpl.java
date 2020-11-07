/**
 * 工单相关异常事件
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EEventForOrderYyyyServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EEventForOrderYyyyDAO;
import org.fms.eis.webapp.domain.EEventForOrderYyyyDomain;
import org.fms.eis.webapp.service.IEEventForOrderYyyyService;
import org.fms.eis.webapp.vo.EEventForOrderYyyyVO;

import java.util.*;

@TransactionService
public class EEventForOrderYyyyServiceImpl implements IEEventForOrderYyyyService {

	@TransactionDAO("read")
	private EEventForOrderYyyyDAO eEventForOrderYyyyReadDAO;

	@TransactionDAO("write")
	private EEventForOrderYyyyDAO eEventForOrderYyyyWriteDAO;

	@Override
	public int insert(EEventForOrderYyyyVO eEventForOrderYyyyVO) {
		return eEventForOrderYyyyWriteDAO.insert(eEventForOrderYyyyVO.vo2Domain());
	}

	@Override
	public int update(EEventForOrderYyyyVO eEventForOrderYyyyVO) {
		return eEventForOrderYyyyWriteDAO.update(eEventForOrderYyyyVO.vo2Domain());
	}

	@Override
	public int delete(EEventForOrderYyyyVO eEventForOrderYyyyVO) {
		return eEventForOrderYyyyWriteDAO.delete(eEventForOrderYyyyVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EEventForOrderYyyyVO> deleteList) throws Exception {
        int num = eEventForOrderYyyyWriteDAO.deleteList(ReflectUtil.cast(deleteList, EEventForOrderYyyyDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EEventForOrderYyyyVO findByKey(EEventForOrderYyyyVO eEventForOrderYyyyVO){
		EEventForOrderYyyyDomain model= eEventForOrderYyyyReadDAO.findByKey(eEventForOrderYyyyVO.vo2Domain());
		EEventForOrderYyyyVO modelVo=new EEventForOrderYyyyVO();
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
	public List<EEventForOrderYyyyVO> findByWhere(EEventForOrderYyyyVO eEventForOrderYyyyVO) {
        EEventForOrderYyyyDomain eEventForOrderYyyyDomain=  eEventForOrderYyyyVO.vo2Domain();
        List<EEventForOrderYyyyDomain> lstDomain = eEventForOrderYyyyReadDAO.findByWhere(eEventForOrderYyyyDomain);
        eEventForOrderYyyyVO.setTotalRow(eEventForOrderYyyyDomain.getTotalRow());
		eEventForOrderYyyyVO.setPageCurrent(eEventForOrderYyyyDomain.getPageCurrent());
		eEventForOrderYyyyVO.setDbName(eEventForOrderYyyyDomain.getDbName());
		eEventForOrderYyyyVO.setPageSize(eEventForOrderYyyyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EEventForOrderYyyyVO.class);
	}

}
