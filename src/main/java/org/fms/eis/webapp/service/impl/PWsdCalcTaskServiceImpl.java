/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PWsdCalcTaskServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PWsdCalcTaskDAO;
import org.fms.eis.webapp.domain.PWsdCalcTaskDomain;
import org.fms.eis.webapp.service.IPWsdCalcTaskService;
import org.fms.eis.webapp.vo.PWsdCalcTaskVO;

import java.util.*;

@TransactionService
public class PWsdCalcTaskServiceImpl implements IPWsdCalcTaskService {

	@TransactionDAO("read")
	private PWsdCalcTaskDAO testReadDAO;

	@TransactionDAO("write")
	private PWsdCalcTaskDAO testWriteDAO;

	@Override
	public int insert(PWsdCalcTaskVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PWsdCalcTaskVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PWsdCalcTaskVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PWsdCalcTaskVO findByKey(PWsdCalcTaskVO testVO){
		PWsdCalcTaskDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PWsdCalcTaskVO modelVo=new PWsdCalcTaskVO();
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
	public List<PWsdCalcTaskVO> findByWhere(PWsdCalcTaskVO testVO) {
		List<PWsdCalcTaskDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PWsdCalcTaskVO> lstVo=new ArrayList<PWsdCalcTaskVO>();
		for (PWsdCalcTaskDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
