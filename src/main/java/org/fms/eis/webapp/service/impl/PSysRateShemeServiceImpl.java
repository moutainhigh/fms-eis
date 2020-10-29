/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PSysRateShemeServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PSysRateShemeDAO;
import org.fms.eis.webapp.domain.PSysRateShemeDomain;
import org.fms.eis.webapp.service.IPSysRateShemeService;
import org.fms.eis.webapp.vo.PSysRateShemeVO;

import java.util.*;

@TransactionService
public class PSysRateShemeServiceImpl implements IPSysRateShemeService {

	@TransactionDAO("read")
	private PSysRateShemeDAO testReadDAO;

	@TransactionDAO("write")
	private PSysRateShemeDAO testWriteDAO;

	@Override
	public int insert(PSysRateShemeVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PSysRateShemeVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PSysRateShemeVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PSysRateShemeVO findByKey(PSysRateShemeVO testVO){
		PSysRateShemeDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PSysRateShemeVO modelVo=new PSysRateShemeVO();
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
	public List<PSysRateShemeVO> findByWhere(PSysRateShemeVO testVO) {
		List<PSysRateShemeDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PSysRateShemeVO> lstVo=new ArrayList<PSysRateShemeVO>();
		for (PSysRateShemeDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
