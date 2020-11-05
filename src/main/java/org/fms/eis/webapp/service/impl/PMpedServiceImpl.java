/**
 * 测量点
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.PMpedServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.PMpedDAO;
import org.fms.eis.webapp.domain.PMpedDomain;
import org.fms.eis.webapp.service.IPMpedService;
import org.fms.eis.webapp.vo.PMpedVO;

import java.util.*;

@TransactionService
public class PMpedServiceImpl implements IPMpedService {

	@TransactionDAO("read")
	private PMpedDAO pMpedReadDAO;

	@TransactionDAO("write")
	private PMpedDAO pMpedWriteDAO;

	@Override
	public int insert(PMpedVO pMpedVO) {
		return pMpedWriteDAO.insert(pMpedVO.vo2Domain());
	}

	@Override
	public int update(PMpedVO pMpedVO) {
		return pMpedWriteDAO.update(pMpedVO.vo2Domain());
	}

	@Override
	public int delete(PMpedVO pMpedVO) {
		return pMpedWriteDAO.delete(pMpedVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<PMpedVO> deleteList) throws Exception {
        int num = pMpedWriteDAO.deleteList(ReflectUtil.cast(deleteList, PMpedDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public PMpedVO findByKey(PMpedVO pMpedVO){
		PMpedDomain model= pMpedReadDAO.findByKey(pMpedVO.vo2Domain());
		PMpedVO modelVo=new PMpedVO();
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
	public List<PMpedVO> findByWhere(PMpedVO pMpedVO) {
        PMpedDomain pMpedDomain=  pMpedVO.vo2Domain();
        List<PMpedDomain> lstDomain = pMpedReadDAO.findByWhere(pMpedDomain);
        pMpedVO.setTotalRow(pMpedDomain.getTotalRow());
		pMpedVO.setPageCurrent(pMpedDomain.getPageCurrent());
		pMpedVO.setDbName(pMpedDomain.getDbName());
		pMpedVO.setPageSize(pMpedDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, PMpedVO.class);
	}

}
