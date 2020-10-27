/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.DropSqlServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.DropSqlDAO;
import org.fms.eis.webapp.domain.DropSqlDomain;
import org.fms.eis.webapp.service.IDropSqlService;
import org.fms.eis.webapp.vo.DropSqlVO;

import java.util.*;

@TransactionService
public class DropSqlServiceImpl implements IDropSqlService {

	@TransactionDAO("read")
	private DropSqlDAO testReadDAO;

	@TransactionDAO("write")
	private DropSqlDAO testWriteDAO;

	@Override
	public int insert(DropSqlVO testVO) {
		return testWriteDAO.insert(testVO.vo2Domain());
	}

	@Override
	public int update(DropSqlVO testVO) {
		return testWriteDAO.update(testVO.vo2Domain());
	}

	@Override
	public int delete(DropSqlVO testVO) {
		return testWriteDAO.delete(testVO.vo2Domain());
	}

	@Override
	public DropSqlVO findByKey(DropSqlVO testVO){
		DropSqlDomain model= testReadDAO.findByKey(testVO.vo2Domain());
		DropSqlVO modelVo=new DropSqlVO();
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
	public List<DropSqlVO> findByWhere(DropSqlVO testVO) {
		List<DropSqlDomain> lstDomain= testReadDAO.findByWhere(testVO.vo2Domain());
		List<DropSqlVO> lstVo=new ArrayList<DropSqlVO>();;
		for (DropSqlDomain item:lstDomain) {
			lstVo.add(item.domain2VO());
		}
		return  lstVo;
	}

}
