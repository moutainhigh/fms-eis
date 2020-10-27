/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.TgInfoServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.TgInfoDAO;
import org.fms.eis.webapp.domain.TgInfoDomain;
import org.fms.eis.webapp.service.ITgInfoService;
import org.fms.eis.webapp.vo.TgInfoVO;

import java.util.*;

@TransactionService
public class TgInfoServiceImpl implements ITgInfoService {

	@TransactionDAO("read")
	private TgInfoDAO testReadDAO;

	@TransactionDAO("write")
	private TgInfoDAO testWriteDAO;

	@Override
	public int insert(TgInfoVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(TgInfoVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(TgInfoVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public TgInfoVO findByKey(TgInfoVO testVO){
		TgInfoDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		TgInfoVO modelVo=new TgInfoVO();
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
	public List<TgInfoVO> findByWhere(TgInfoVO testVO) {
		List<TgInfoDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<TgInfoVO> lstVo=new ArrayList<TgInfoVO>();;
		for (TgInfoDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
