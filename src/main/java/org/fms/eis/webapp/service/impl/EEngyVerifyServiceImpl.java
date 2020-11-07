/**
 * 表码电量审核
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EEngyVerifyServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EEngyVerifyDAO;
import org.fms.eis.webapp.domain.EEngyVerifyDomain;
import org.fms.eis.webapp.service.IEEngyVerifyService;
import org.fms.eis.webapp.vo.EEngyVerifyVO;

import java.util.*;

@TransactionService
public class EEngyVerifyServiceImpl implements IEEngyVerifyService {

	@TransactionDAO("read")
	private EEngyVerifyDAO eEngyVerifyReadDAO;

	@TransactionDAO("write")
	private EEngyVerifyDAO eEngyVerifyWriteDAO;

	@Override
	public int insert(EEngyVerifyVO eEngyVerifyVO) {
		return eEngyVerifyWriteDAO.insert(eEngyVerifyVO.vo2Domain());
	}

	@Override
	public int update(EEngyVerifyVO eEngyVerifyVO) {
		return eEngyVerifyWriteDAO.update(eEngyVerifyVO.vo2Domain());
	}

	@Override
	public int delete(EEngyVerifyVO eEngyVerifyVO) {
		return eEngyVerifyWriteDAO.delete(eEngyVerifyVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EEngyVerifyVO> deleteList) throws Exception {
        int num = eEngyVerifyWriteDAO.deleteList(ReflectUtil.cast(deleteList, EEngyVerifyDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EEngyVerifyVO findByKey(EEngyVerifyVO eEngyVerifyVO){
		EEngyVerifyDomain model= eEngyVerifyReadDAO.findByKey(eEngyVerifyVO.vo2Domain());
		EEngyVerifyVO modelVo=new EEngyVerifyVO();
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
	public List<EEngyVerifyVO> findByWhere(EEngyVerifyVO eEngyVerifyVO) {
        EEngyVerifyDomain eEngyVerifyDomain=  eEngyVerifyVO.vo2Domain();
        List<EEngyVerifyDomain> lstDomain = eEngyVerifyReadDAO.findByWhere(eEngyVerifyDomain);
        eEngyVerifyVO.setTotalRow(eEngyVerifyDomain.getTotalRow());
		eEngyVerifyVO.setPageCurrent(eEngyVerifyDomain.getPageCurrent());
		eEngyVerifyVO.setDbName(eEngyVerifyDomain.getDbName());
		eEngyVerifyVO.setPageSize(eEngyVerifyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EEngyVerifyVO.class);
	}

}
