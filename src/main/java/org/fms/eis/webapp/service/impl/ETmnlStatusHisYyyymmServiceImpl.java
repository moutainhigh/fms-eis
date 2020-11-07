/**
 * 终端状态历史信息
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.ETmnlStatusHisYyyymmServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.ETmnlStatusHisYyyymmDAO;
import org.fms.eis.webapp.domain.ETmnlStatusHisYyyymmDomain;
import org.fms.eis.webapp.service.IETmnlStatusHisYyyymmService;
import org.fms.eis.webapp.vo.ETmnlStatusHisYyyymmVO;

import java.util.*;

@TransactionService
public class ETmnlStatusHisYyyymmServiceImpl implements IETmnlStatusHisYyyymmService {

	@TransactionDAO("read")
	private ETmnlStatusHisYyyymmDAO eTmnlStatusHisYyyymmReadDAO;

	@TransactionDAO("write")
	private ETmnlStatusHisYyyymmDAO eTmnlStatusHisYyyymmWriteDAO;

	@Override
	public int insert(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO) {
		return eTmnlStatusHisYyyymmWriteDAO.insert(eTmnlStatusHisYyyymmVO.vo2Domain());
	}

	@Override
	public int update(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO) {
		return eTmnlStatusHisYyyymmWriteDAO.update(eTmnlStatusHisYyyymmVO.vo2Domain());
	}

	@Override
	public int delete(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO) {
		return eTmnlStatusHisYyyymmWriteDAO.delete(eTmnlStatusHisYyyymmVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<ETmnlStatusHisYyyymmVO> deleteList) throws Exception {
        int num = eTmnlStatusHisYyyymmWriteDAO.deleteList(ReflectUtil.cast(deleteList, ETmnlStatusHisYyyymmDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public ETmnlStatusHisYyyymmVO findByKey(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO){
		ETmnlStatusHisYyyymmDomain model= eTmnlStatusHisYyyymmReadDAO.findByKey(eTmnlStatusHisYyyymmVO.vo2Domain());
		ETmnlStatusHisYyyymmVO modelVo=new ETmnlStatusHisYyyymmVO();
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
	public List<ETmnlStatusHisYyyymmVO> findByWhere(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO) {
        ETmnlStatusHisYyyymmDomain eTmnlStatusHisYyyymmDomain=  eTmnlStatusHisYyyymmVO.vo2Domain();
        List<ETmnlStatusHisYyyymmDomain> lstDomain = eTmnlStatusHisYyyymmReadDAO.findByWhere(eTmnlStatusHisYyyymmDomain);
        eTmnlStatusHisYyyymmVO.setTotalRow(eTmnlStatusHisYyyymmDomain.getTotalRow());
		eTmnlStatusHisYyyymmVO.setPageCurrent(eTmnlStatusHisYyyymmDomain.getPageCurrent());
		eTmnlStatusHisYyyymmVO.setDbName(eTmnlStatusHisYyyymmDomain.getDbName());
		eTmnlStatusHisYyyymmVO.setPageSize(eTmnlStatusHisYyyymmDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, ETmnlStatusHisYyyymmVO.class);
	}

}
