/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PWsdChnlTypeServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PWsdChnlTypeDAO;
import org.fms.eis.webapp.domain.PWsdChnlTypeDomain;
import org.fms.eis.webapp.service.IPWsdChnlTypeService;
import org.fms.eis.webapp.vo.PWsdChnlTypeVO;

import java.util.*;

@TransactionService
public class PWsdChnlTypeServiceImpl implements IPWsdChnlTypeService {

	@TransactionDAO("read")
	private PWsdChnlTypeDAO testReadDAO;

	@TransactionDAO("write")
	private PWsdChnlTypeDAO testWriteDAO;

	@Override
	public int insert(PWsdChnlTypeVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(PWsdChnlTypeVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(PWsdChnlTypeVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public PWsdChnlTypeVO findByKey(PWsdChnlTypeVO testVO){
		PWsdChnlTypeDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		PWsdChnlTypeVO modelVo=new PWsdChnlTypeVO();
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
	public List<PWsdChnlTypeVO> findByWhere(PWsdChnlTypeVO testVO) {
		List<PWsdChnlTypeDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<PWsdChnlTypeVO> lstVo=new ArrayList<PWsdChnlTypeVO>();;
		for (PWsdChnlTypeDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
