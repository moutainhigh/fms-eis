/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.RCpServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.RCpDAO;
import org.fms.eis.webapp.domain.RCpDomain;
import org.fms.eis.webapp.service.IRCpService;
import org.fms.eis.webapp.vo.RCpVO;

import java.util.*;

@TransactionService
public class RCpServiceImpl implements IRCpService {

	@TransactionDAO("read")
	private RCpDAO testReadDAO;

	@TransactionDAO("write")
	private RCpDAO testWriteDAO;

	@Override
	public int insert(RCpVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(RCpVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(RCpVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public RCpVO findByKey(RCpVO testVO){
		RCpDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		RCpVO modelVo=new RCpVO();
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
	public List<RCpVO> findByWhere(RCpVO testVO) {
		List<RCpDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<RCpVO> lstVo=new ArrayList<RCpVO>();;
		for (RCpDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
