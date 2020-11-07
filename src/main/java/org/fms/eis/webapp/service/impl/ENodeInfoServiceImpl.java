/**
 * 系统节点运行信息
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.ENodeInfoServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.ENodeInfoDAO;
import org.fms.eis.webapp.domain.ENodeInfoDomain;
import org.fms.eis.webapp.service.IENodeInfoService;
import org.fms.eis.webapp.vo.ENodeInfoVO;

import java.util.*;

@TransactionService
public class ENodeInfoServiceImpl implements IENodeInfoService {

	@TransactionDAO("read")
	private ENodeInfoDAO eNodeInfoReadDAO;

	@TransactionDAO("write")
	private ENodeInfoDAO eNodeInfoWriteDAO;

	@Override
	public int insert(ENodeInfoVO eNodeInfoVO) {
		return eNodeInfoWriteDAO.insert(eNodeInfoVO.vo2Domain());
	}

	@Override
	public int update(ENodeInfoVO eNodeInfoVO) {
		return eNodeInfoWriteDAO.update(eNodeInfoVO.vo2Domain());
	}

	@Override
	public int delete(ENodeInfoVO eNodeInfoVO) {
		return eNodeInfoWriteDAO.delete(eNodeInfoVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<ENodeInfoVO> deleteList) throws Exception {
        int num = eNodeInfoWriteDAO.deleteList(ReflectUtil.cast(deleteList, ENodeInfoDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public ENodeInfoVO findByKey(ENodeInfoVO eNodeInfoVO){
		ENodeInfoDomain model= eNodeInfoReadDAO.findByKey(eNodeInfoVO.vo2Domain());
		ENodeInfoVO modelVo=new ENodeInfoVO();
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
	public List<ENodeInfoVO> findByWhere(ENodeInfoVO eNodeInfoVO) {
        ENodeInfoDomain eNodeInfoDomain=  eNodeInfoVO.vo2Domain();
        List<ENodeInfoDomain> lstDomain = eNodeInfoReadDAO.findByWhere(eNodeInfoDomain);
        eNodeInfoVO.setTotalRow(eNodeInfoDomain.getTotalRow());
		eNodeInfoVO.setPageCurrent(eNodeInfoDomain.getPageCurrent());
		eNodeInfoVO.setDbName(eNodeInfoDomain.getDbName());
		eNodeInfoVO.setPageSize(eNodeInfoDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, ENodeInfoVO.class);
	}

}
