/**
 * 电能示值回收表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EBmRollbackServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EBmRollbackDAO;
import org.fms.eis.webapp.domain.EBmRollbackDomain;
import org.fms.eis.webapp.service.IEBmRollbackService;
import org.fms.eis.webapp.vo.EBmRollbackVO;

import java.util.*;

@TransactionService
public class EBmRollbackServiceImpl implements IEBmRollbackService {

	@TransactionDAO("read")
	private EBmRollbackDAO eBmRollbackReadDAO;

	@TransactionDAO("write")
	private EBmRollbackDAO eBmRollbackWriteDAO;

	@Override
	public int insert(EBmRollbackVO eBmRollbackVO) {
		return eBmRollbackWriteDAO.insert(eBmRollbackVO.vo2Domain());
	}

	@Override
	public int update(EBmRollbackVO eBmRollbackVO) {
		return eBmRollbackWriteDAO.update(eBmRollbackVO.vo2Domain());
	}

	@Override
	public int delete(EBmRollbackVO eBmRollbackVO) {
		return eBmRollbackWriteDAO.delete(eBmRollbackVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EBmRollbackVO> deleteList) throws Exception {
        int num = eBmRollbackWriteDAO.deleteList(ReflectUtil.cast(deleteList, EBmRollbackDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EBmRollbackVO findByKey(EBmRollbackVO eBmRollbackVO){
		EBmRollbackDomain model= eBmRollbackReadDAO.findByKey(eBmRollbackVO.vo2Domain());
		EBmRollbackVO modelVo=new EBmRollbackVO();
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
	public List<EBmRollbackVO> findByWhere(EBmRollbackVO eBmRollbackVO) {
        EBmRollbackDomain eBmRollbackDomain=  eBmRollbackVO.vo2Domain();
        List<EBmRollbackDomain> lstDomain = eBmRollbackReadDAO.findByWhere(eBmRollbackDomain);
        eBmRollbackVO.setTotalRow(eBmRollbackDomain.getTotalRow());
		eBmRollbackVO.setPageCurrent(eBmRollbackDomain.getPageCurrent());
		eBmRollbackVO.setDbName(eBmRollbackDomain.getDbName());
		eBmRollbackVO.setPageSize(eBmRollbackDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EBmRollbackVO.class);
	}

}
