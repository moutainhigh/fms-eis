/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PTaskDetailServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PTaskDetailDAO;
import org.fms.eis.webapp.domain.PTaskDetailDomain;
import org.fms.eis.webapp.service.IPTaskDetailService;
import org.fms.eis.webapp.vo.PTaskDetailVO;

import java.util.*;

@TransactionService
public class PTaskDetailServiceImpl implements IPTaskDetailService {

	@TransactionDAO("read")
	private PTaskDetailDAO testReadDAO;

	@TransactionDAO("write")
	private PTaskDetailDAO testWriteDAO;

	@Override
	public int insert(PTaskDetailVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PTaskDetailVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PTaskDetailVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PTaskDetailVO findByKey(PTaskDetailVO testVO){
		PTaskDetailDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PTaskDetailVO modelVo=new PTaskDetailVO();
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
	public List<PTaskDetailVO> findByWhere(PTaskDetailVO testVO) {
		List<PTaskDetailDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PTaskDetailVO> lstVo=new ArrayList<PTaskDetailVO>();;
		for (PTaskDetailDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
