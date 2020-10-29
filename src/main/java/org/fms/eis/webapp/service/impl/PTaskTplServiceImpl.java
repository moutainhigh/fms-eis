/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PTaskTplServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PTaskTplDAO;
import org.fms.eis.webapp.domain.PTaskTplDomain;
import org.fms.eis.webapp.service.IPTaskTplService;
import org.fms.eis.webapp.vo.PTaskTplVO;

import java.util.*;

@TransactionService
public class PTaskTplServiceImpl implements IPTaskTplService {

	@TransactionDAO("read")
	private PTaskTplDAO testReadDAO;

	@TransactionDAO("write")
	private PTaskTplDAO testWriteDAO;

	@Override
	public int insert(PTaskTplVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PTaskTplVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PTaskTplVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PTaskTplVO findByKey(PTaskTplVO testVO){
		PTaskTplDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PTaskTplVO modelVo=new PTaskTplVO();
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
	public List<PTaskTplVO> findByWhere(PTaskTplVO testVO) {
		List<PTaskTplDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PTaskTplVO> lstVo=new ArrayList<PTaskTplVO>();
		for (PTaskTplDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
