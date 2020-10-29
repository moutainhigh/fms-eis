/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PTaskServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PTaskDAO;
import org.fms.eis.webapp.domain.PTaskDomain;
import org.fms.eis.webapp.service.IPTaskService;
import org.fms.eis.webapp.vo.PTaskVO;

import java.util.*;

@TransactionService
public class PTaskServiceImpl implements IPTaskService {

	@TransactionDAO("read")
	private PTaskDAO testReadDAO;

	@TransactionDAO("write")
	private PTaskDAO testWriteDAO;

	@Override
	public int insert(PTaskVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PTaskVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PTaskVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PTaskVO findByKey(PTaskVO testVO){
		PTaskDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PTaskVO modelVo=new PTaskVO();
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
	public List<PTaskVO> findByWhere(PTaskVO testVO) {
		List<PTaskDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PTaskVO> lstVo=new ArrayList<PTaskVO>();
		for (PTaskDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
