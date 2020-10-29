/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PTaskTplDetailServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PTaskTplDetailDAO;
import org.fms.eis.webapp.domain.PTaskTplDetailDomain;
import org.fms.eis.webapp.service.IPTaskTplDetailService;
import org.fms.eis.webapp.vo.PTaskTplDetailVO;

import java.util.*;

@TransactionService
public class PTaskTplDetailServiceImpl implements IPTaskTplDetailService {

	@TransactionDAO("read")
	private PTaskTplDetailDAO testReadDAO;

	@TransactionDAO("write")
	private PTaskTplDetailDAO testWriteDAO;

	@Override
	public int insert(PTaskTplDetailVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PTaskTplDetailVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PTaskTplDetailVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PTaskTplDetailVO findByKey(PTaskTplDetailVO testVO){
		PTaskTplDetailDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PTaskTplDetailVO modelVo=new PTaskTplDetailVO();
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
	public List<PTaskTplDetailVO> findByWhere(PTaskTplDetailVO testVO) {
		List<PTaskTplDetailDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PTaskTplDetailVO> lstVo=new ArrayList<PTaskTplDetailVO>();
		for (PTaskTplDetailDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
