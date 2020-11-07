/**
 * 异常检测事件
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EEventCheckServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EEventCheckDAO;
import org.fms.eis.webapp.domain.EEventCheckDomain;
import org.fms.eis.webapp.service.IEEventCheckService;
import org.fms.eis.webapp.vo.EEventCheckVO;

import java.util.*;

@TransactionService
public class EEventCheckServiceImpl implements IEEventCheckService {

	@TransactionDAO("read")
	private EEventCheckDAO eEventCheckReadDAO;

	@TransactionDAO("write")
	private EEventCheckDAO eEventCheckWriteDAO;

	@Override
	public int insert(EEventCheckVO eEventCheckVO) {
		return eEventCheckWriteDAO.insert(eEventCheckVO.vo2Domain());
	}

	@Override
	public int update(EEventCheckVO eEventCheckVO) {
		return eEventCheckWriteDAO.update(eEventCheckVO.vo2Domain());
	}

	@Override
	public int delete(EEventCheckVO eEventCheckVO) {
		return eEventCheckWriteDAO.delete(eEventCheckVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EEventCheckVO> deleteList) throws Exception {
        int num = eEventCheckWriteDAO.deleteList(ReflectUtil.cast(deleteList, EEventCheckDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EEventCheckVO findByKey(EEventCheckVO eEventCheckVO){
		EEventCheckDomain model= eEventCheckReadDAO.findByKey(eEventCheckVO.vo2Domain());
		EEventCheckVO modelVo=new EEventCheckVO();
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
	public List<EEventCheckVO> findByWhere(EEventCheckVO eEventCheckVO) {
        EEventCheckDomain eEventCheckDomain=  eEventCheckVO.vo2Domain();
        List<EEventCheckDomain> lstDomain = eEventCheckReadDAO.findByWhere(eEventCheckDomain);
        eEventCheckVO.setTotalRow(eEventCheckDomain.getTotalRow());
		eEventCheckVO.setPageCurrent(eEventCheckDomain.getPageCurrent());
		eEventCheckVO.setDbName(eEventCheckDomain.getDbName());
		eEventCheckVO.setPageSize(eEventCheckDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EEventCheckVO.class);
	}

}
