/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.TestInfoServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.TestInfoDAO;
import org.fms.eis.webapp.domain.TestInfoDomain;
import org.fms.eis.webapp.service.ITestInfoService;
import org.fms.eis.webapp.vo.TestInfoVO;

import java.util.*;

@TransactionService
public class TestInfoServiceImpl implements ITestInfoService {

	@TransactionDAO("read")
	private TestInfoDAO testReadDAO;

	@TransactionDAO("write")
	private TestInfoDAO testWriteDAO;

	@Override
	public int insert(TestInfoVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(TestInfoVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(TestInfoVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public TestInfoVO findByKey(TestInfoVO testVO){
		TestInfoDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		TestInfoVO modelVo=new TestInfoVO();
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
	public List<TestInfoVO> findByWhere(TestInfoVO testVO) {
		List<TestInfoDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<TestInfoVO> lstVo=new ArrayList<TestInfoVO>();;
		for (TestInfoDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
