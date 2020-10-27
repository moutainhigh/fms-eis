/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PDaserverGroupServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PDaserverGroupDAO;
import org.fms.eis.webapp.domain.PDaserverGroupDomain;
import org.fms.eis.webapp.service.IPDaserverGroupService;
import org.fms.eis.webapp.vo.PDaserverGroupVO;

import java.util.*;

@TransactionService
public class PDaserverGroupServiceImpl implements IPDaserverGroupService {

	@TransactionDAO("read")
	private PDaserverGroupDAO testReadDAO;

	@TransactionDAO("write")
	private PDaserverGroupDAO testWriteDAO;

	@Override
	public int insert(PDaserverGroupVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PDaserverGroupVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PDaserverGroupVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PDaserverGroupVO findByKey(PDaserverGroupVO testVO){
		PDaserverGroupDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PDaserverGroupVO modelVo=new PDaserverGroupVO();
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
	public List<PDaserverGroupVO> findByWhere(PDaserverGroupVO testVO) {
		List<PDaserverGroupDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PDaserverGroupVO> lstVo=new ArrayList<PDaserverGroupVO>();;
		for (PDaserverGroupDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
