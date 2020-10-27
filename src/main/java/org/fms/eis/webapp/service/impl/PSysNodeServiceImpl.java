/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PSysNodeServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PSysNodeDAO;
import org.fms.eis.webapp.domain.PSysNodeDomain;
import org.fms.eis.webapp.service.IPSysNodeService;
import org.fms.eis.webapp.vo.PSysNodeVO;

import java.util.*;

@TransactionService
public class PSysNodeServiceImpl implements IPSysNodeService {

	@TransactionDAO("read")
	private PSysNodeDAO testReadDAO;

	@TransactionDAO("write")
	private PSysNodeDAO testWriteDAO;

	@Override
	public int insert(PSysNodeVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PSysNodeVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PSysNodeVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PSysNodeVO findByKey(PSysNodeVO testVO){
		PSysNodeDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PSysNodeVO modelVo=new PSysNodeVO();
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
	public List<PSysNodeVO> findByWhere(PSysNodeVO testVO) {
		List<PSysNodeDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PSysNodeVO> lstVo=new ArrayList<PSysNodeVO>();;
		for (PSysNodeDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
