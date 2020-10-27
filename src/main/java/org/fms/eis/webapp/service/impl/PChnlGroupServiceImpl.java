/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.TestServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PChnlGroupDAO;
import org.fms.eis.webapp.domain.pChnlGroupDomain;
import org.fms.eis.webapp.service.IPChnlGroupService;
import org.fms.eis.webapp.vo.pChnlGroupVO;

import java.util.*;

@TransactionService
public class PChnlGroupServiceImpl implements IPChnlGroupService {

	@TransactionDAO("read")
	private PChnlGroupDAO testReadDAO;

	@TransactionDAO("write")
	private PChnlGroupDAO testWriteDAO;

	@Override
	public int insert(pChnlGroupVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(pChnlGroupVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(pChnlGroupVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public pChnlGroupVO findByKey(pChnlGroupVO testVO){
		pChnlGroupDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		pChnlGroupVO modelVo=new pChnlGroupVO();
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
	public List<pChnlGroupVO> findByWhere(pChnlGroupVO testVO) {
		List<pChnlGroupDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<pChnlGroupVO> lstVo=new ArrayList<pChnlGroupVO>();;
		for (pChnlGroupDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
