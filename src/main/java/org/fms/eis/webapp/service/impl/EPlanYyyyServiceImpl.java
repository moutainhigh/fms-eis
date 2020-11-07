/**
 * 电力计划表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EPlanYyyyServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EPlanYyyyDAO;
import org.fms.eis.webapp.domain.EPlanYyyyDomain;
import org.fms.eis.webapp.service.IEPlanYyyyService;
import org.fms.eis.webapp.vo.EPlanYyyyVO;

import java.util.*;

@TransactionService
public class EPlanYyyyServiceImpl implements IEPlanYyyyService {

	@TransactionDAO("read")
	private EPlanYyyyDAO ePlanYyyyReadDAO;

	@TransactionDAO("write")
	private EPlanYyyyDAO ePlanYyyyWriteDAO;

	@Override
	public int insert(EPlanYyyyVO ePlanYyyyVO) {
		return ePlanYyyyWriteDAO.insert(ePlanYyyyVO.vo2Domain());
	}

	@Override
	public int update(EPlanYyyyVO ePlanYyyyVO) {
		return ePlanYyyyWriteDAO.update(ePlanYyyyVO.vo2Domain());
	}

	@Override
	public int delete(EPlanYyyyVO ePlanYyyyVO) {
		return ePlanYyyyWriteDAO.delete(ePlanYyyyVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EPlanYyyyVO> deleteList) throws Exception {
        int num = ePlanYyyyWriteDAO.deleteList(ReflectUtil.cast(deleteList, EPlanYyyyDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EPlanYyyyVO findByKey(EPlanYyyyVO ePlanYyyyVO){
		EPlanYyyyDomain model= ePlanYyyyReadDAO.findByKey(ePlanYyyyVO.vo2Domain());
		EPlanYyyyVO modelVo=new EPlanYyyyVO();
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
	public List<EPlanYyyyVO> findByWhere(EPlanYyyyVO ePlanYyyyVO) {
        EPlanYyyyDomain ePlanYyyyDomain=  ePlanYyyyVO.vo2Domain();
        List<EPlanYyyyDomain> lstDomain = ePlanYyyyReadDAO.findByWhere(ePlanYyyyDomain);
        ePlanYyyyVO.setTotalRow(ePlanYyyyDomain.getTotalRow());
		ePlanYyyyVO.setPageCurrent(ePlanYyyyDomain.getPageCurrent());
		ePlanYyyyVO.setDbName(ePlanYyyyDomain.getDbName());
		ePlanYyyyVO.setPageSize(ePlanYyyyDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EPlanYyyyVO.class);
	}

}
