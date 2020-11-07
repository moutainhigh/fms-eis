/**
 * 用户登录日志
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EEventLoginServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EEventLoginDAO;
import org.fms.eis.webapp.domain.EEventLoginDomain;
import org.fms.eis.webapp.service.IEEventLoginService;
import org.fms.eis.webapp.vo.EEventLoginVO;

import java.util.*;

@TransactionService
public class EEventLoginServiceImpl implements IEEventLoginService {

	@TransactionDAO("read")
	private EEventLoginDAO eEventLoginReadDAO;

	@TransactionDAO("write")
	private EEventLoginDAO eEventLoginWriteDAO;

	@Override
	public int insert(EEventLoginVO eEventLoginVO) {
		return eEventLoginWriteDAO.insert(eEventLoginVO.vo2Domain());
	}

	@Override
	public int update(EEventLoginVO eEventLoginVO) {
		return eEventLoginWriteDAO.update(eEventLoginVO.vo2Domain());
	}

	@Override
	public int delete(EEventLoginVO eEventLoginVO) {
		return eEventLoginWriteDAO.delete(eEventLoginVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EEventLoginVO> deleteList) throws Exception {
        int num = eEventLoginWriteDAO.deleteList(ReflectUtil.cast(deleteList, EEventLoginDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EEventLoginVO findByKey(EEventLoginVO eEventLoginVO){
		EEventLoginDomain model= eEventLoginReadDAO.findByKey(eEventLoginVO.vo2Domain());
		EEventLoginVO modelVo=new EEventLoginVO();
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
	public List<EEventLoginVO> findByWhere(EEventLoginVO eEventLoginVO) {
        EEventLoginDomain eEventLoginDomain=  eEventLoginVO.vo2Domain();
        List<EEventLoginDomain> lstDomain = eEventLoginReadDAO.findByWhere(eEventLoginDomain);
        eEventLoginVO.setTotalRow(eEventLoginDomain.getTotalRow());
		eEventLoginVO.setPageCurrent(eEventLoginDomain.getPageCurrent());
		eEventLoginVO.setDbName(eEventLoginDomain.getDbName());
		eEventLoginVO.setPageSize(eEventLoginDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EEventLoginVO.class);
	}

}
