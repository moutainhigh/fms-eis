/**
 * 用户操作日志
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EEventOperYyyyServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EEventOperYyyyDAO;
import org.fms.eis.webapp.domain.EEventOperYyyyDomain;
import org.fms.eis.webapp.service.IEEventOperYyyyService;
import org.fms.eis.webapp.vo.EEventOperYyyyVO;

import java.util.*;

@TransactionService
public class EEventOperYyyyServiceImpl implements IEEventOperYyyyService {

	@TransactionDAO("read")
	private EEventOperYyyyDAO eEventOperYyyyReadDAO;

	@TransactionDAO("write")
	private EEventOperYyyyDAO eEventOperYyyyWriteDAO;

	@Override
	public int insert(EEventOperYyyyVO eEventOperYyyyVO) {
		return eEventOperYyyyWriteDAO.insert(eEventOperYyyyVO.vo2Domain());
	}

	@Override
	public int update(EEventOperYyyyVO eEventOperYyyyVO) {
		return eEventOperYyyyWriteDAO.update(eEventOperYyyyVO.vo2Domain());
	}

	@Override
	public int delete(EEventOperYyyyVO eEventOperYyyyVO) {
		return eEventOperYyyyWriteDAO.delete(eEventOperYyyyVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EEventOperYyyyVO> deleteList) throws Exception {
        int num = eEventOperYyyyWriteDAO.deleteList(ReflectUtil.cast(deleteList, EEventOperYyyyDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EEventOperYyyyVO findByKey(EEventOperYyyyVO eEventOperYyyyVO){
		EEventOperYyyyDomain model= eEventOperYyyyReadDAO.findByKey(eEventOperYyyyVO.vo2Domain());
		EEventOperYyyyVO modelVo=new EEventOperYyyyVO();
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
	public List<EEventOperYyyyVO> findByWhere(EEventOperYyyyVO eEventOperYyyyVO) {
        EEventOperYyyyDomain eEventOperYyyyDomain=  eEventOperYyyyVO.vo2Domain();
        List<EEventOperYyyyDomain> lstDomain = eEventOperYyyyReadDAO.findByWhere(eEventOperYyyyDomain);
        eEventOperYyyyVO.setTotalRow(eEventOperYyyyDomain.getTotalRow());
		eEventOperYyyyVO.setPageCurrent(eEventOperYyyyDomain.getPageCurrent());
		eEventOperYyyyVO.setDbName(eEventOperYyyyDomain.getDbName());
		eEventOperYyyyVO.setPageSize(eEventOperYyyyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EEventOperYyyyVO.class);
	}

}
