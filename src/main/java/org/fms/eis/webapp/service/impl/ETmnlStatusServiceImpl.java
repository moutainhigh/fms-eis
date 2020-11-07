/**
 * 终端状态信息
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.ETmnlStatusServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.ETmnlStatusDAO;
import org.fms.eis.webapp.domain.ETmnlStatusDomain;
import org.fms.eis.webapp.service.IETmnlStatusService;
import org.fms.eis.webapp.vo.ETmnlStatusVO;

import java.util.*;

@TransactionService
public class ETmnlStatusServiceImpl implements IETmnlStatusService {

	@TransactionDAO("read")
	private ETmnlStatusDAO eTmnlStatusReadDAO;

	@TransactionDAO("write")
	private ETmnlStatusDAO eTmnlStatusWriteDAO;

	@Override
	public int insert(ETmnlStatusVO eTmnlStatusVO) {
		return eTmnlStatusWriteDAO.insert(eTmnlStatusVO.vo2Domain());
	}

	@Override
	public int update(ETmnlStatusVO eTmnlStatusVO) {
		return eTmnlStatusWriteDAO.update(eTmnlStatusVO.vo2Domain());
	}

	@Override
	public int delete(ETmnlStatusVO eTmnlStatusVO) {
		return eTmnlStatusWriteDAO.delete(eTmnlStatusVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<ETmnlStatusVO> deleteList) throws Exception {
        int num = eTmnlStatusWriteDAO.deleteList(ReflectUtil.cast(deleteList, ETmnlStatusDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public ETmnlStatusVO findByKey(ETmnlStatusVO eTmnlStatusVO){
		ETmnlStatusDomain model= eTmnlStatusReadDAO.findByKey(eTmnlStatusVO.vo2Domain());
		ETmnlStatusVO modelVo=new ETmnlStatusVO();
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
	public List<ETmnlStatusVO> findByWhere(ETmnlStatusVO eTmnlStatusVO) {
        ETmnlStatusDomain eTmnlStatusDomain=  eTmnlStatusVO.vo2Domain();
        List<ETmnlStatusDomain> lstDomain = eTmnlStatusReadDAO.findByWhere(eTmnlStatusDomain);
        eTmnlStatusVO.setTotalRow(eTmnlStatusDomain.getTotalRow());
		eTmnlStatusVO.setPageCurrent(eTmnlStatusDomain.getPageCurrent());
		eTmnlStatusVO.setDbName(eTmnlStatusDomain.getDbName());
		eTmnlStatusVO.setPageSize(eTmnlStatusDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, ETmnlStatusVO.class);
	}

}
