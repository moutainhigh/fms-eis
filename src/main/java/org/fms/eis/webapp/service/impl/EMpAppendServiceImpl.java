/**
 * 追加电量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EMpAppendServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EMpAppendDAO;
import org.fms.eis.webapp.domain.EMpAppendDomain;
import org.fms.eis.webapp.service.IEMpAppendService;
import org.fms.eis.webapp.vo.EMpAppendVO;

import java.util.*;

@TransactionService
public class EMpAppendServiceImpl implements IEMpAppendService {

	@TransactionDAO("read")
	private EMpAppendDAO eMpAppendReadDAO;

	@TransactionDAO("write")
	private EMpAppendDAO eMpAppendWriteDAO;

	@Override
	public int insert(EMpAppendVO eMpAppendVO) {
		return eMpAppendWriteDAO.insert(eMpAppendVO.vo2Domain());
	}

	@Override
	public int update(EMpAppendVO eMpAppendVO) {
		return eMpAppendWriteDAO.update(eMpAppendVO.vo2Domain());
	}

	@Override
	public int delete(EMpAppendVO eMpAppendVO) {
		return eMpAppendWriteDAO.delete(eMpAppendVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EMpAppendVO> deleteList) throws Exception {
        int num = eMpAppendWriteDAO.deleteList(ReflectUtil.cast(deleteList, EMpAppendDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EMpAppendVO findByKey(EMpAppendVO eMpAppendVO){
		EMpAppendDomain model= eMpAppendReadDAO.findByKey(eMpAppendVO.vo2Domain());
		EMpAppendVO modelVo=new EMpAppendVO();
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
	public List<EMpAppendVO> findByWhere(EMpAppendVO eMpAppendVO) {
        EMpAppendDomain eMpAppendDomain=  eMpAppendVO.vo2Domain();
        List<EMpAppendDomain> lstDomain = eMpAppendReadDAO.findByWhere(eMpAppendDomain);
        eMpAppendVO.setTotalRow(eMpAppendDomain.getTotalRow());
		eMpAppendVO.setPageCurrent(eMpAppendDomain.getPageCurrent());
		eMpAppendVO.setDbName(eMpAppendDomain.getDbName());
		eMpAppendVO.setPageSize(eMpAppendDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EMpAppendVO.class);
	}

}
