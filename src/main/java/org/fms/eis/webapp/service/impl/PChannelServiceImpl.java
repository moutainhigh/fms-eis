/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PChannelServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PChannelDAO;
import org.fms.eis.webapp.domain.PChannelDomain;
import org.fms.eis.webapp.service.IPChannelService;
import org.fms.eis.webapp.vo.PChannelVO;

import java.util.*;

@TransactionService
public class PChannelServiceImpl implements IPChannelService {

	@TransactionDAO("read")
	private PChannelDAO testReadDAO;

	@TransactionDAO("write")
	private PChannelDAO testWriteDAO;

	@Override
	public int insert(PChannelVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PChannelVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PChannelVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PChannelVO findByKey(PChannelVO testVO){
		PChannelDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PChannelVO modelVo=new PChannelVO();
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
	public List<PChannelVO> findByWhere(PChannelVO testVO) {
		List<PChannelDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PChannelVO> lstVo=new ArrayList<PChannelVO>();;
		for (PChannelDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
