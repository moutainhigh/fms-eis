/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.SystemCommonConfigServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.SystemCommonConfigDAO;
import org.fms.eis.webapp.domain.SystemCommonConfigDomain;
import org.fms.eis.webapp.service.ISystemCommonConfigService;
import org.fms.eis.webapp.vo.SystemCommonConfigVO;

import java.util.*;

@TransactionService
public class SystemCommonConfigServiceImpl implements ISystemCommonConfigService {

	@TransactionDAO("read")
	private SystemCommonConfigDAO testReadDAO;

	@TransactionDAO("write")
	private SystemCommonConfigDAO testWriteDAO;

	@Override
	public int insert(SystemCommonConfigVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(SystemCommonConfigVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(SystemCommonConfigVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public SystemCommonConfigVO findByKey(SystemCommonConfigVO testVO){
		SystemCommonConfigDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		SystemCommonConfigVO modelVo=new SystemCommonConfigVO();
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
	public List<SystemCommonConfigVO> findByWhere(SystemCommonConfigVO testVO) {
		List<SystemCommonConfigDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<SystemCommonConfigVO> lstVo=new ArrayList<SystemCommonConfigVO>();
		for (SystemCommonConfigDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
