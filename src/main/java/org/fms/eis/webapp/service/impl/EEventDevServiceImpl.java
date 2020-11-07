/**
 * 主站设备事件
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.EEventDevServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.EEventDevDAO;
import org.fms.eis.webapp.domain.EEventDevDomain;
import org.fms.eis.webapp.service.IEEventDevService;
import org.fms.eis.webapp.vo.EEventDevVO;

import java.util.*;

@TransactionService
public class EEventDevServiceImpl implements IEEventDevService {

	@TransactionDAO("read")
	private EEventDevDAO eEventDevReadDAO;

	@TransactionDAO("write")
	private EEventDevDAO eEventDevWriteDAO;

	@Override
	public int insert(EEventDevVO eEventDevVO) {
		return eEventDevWriteDAO.insert(eEventDevVO.vo2Domain());
	}

	@Override
	public int update(EEventDevVO eEventDevVO) {
		return eEventDevWriteDAO.update(eEventDevVO.vo2Domain());
	}

	@Override
	public int delete(EEventDevVO eEventDevVO) {
		return eEventDevWriteDAO.delete(eEventDevVO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<EEventDevVO> deleteList) throws Exception {
        int num = eEventDevWriteDAO.deleteList(ReflectUtil.cast(deleteList, EEventDevDomain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public EEventDevVO findByKey(EEventDevVO eEventDevVO){
		EEventDevDomain model= eEventDevReadDAO.findByKey(eEventDevVO.vo2Domain());
		EEventDevVO modelVo=new EEventDevVO();
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
	public List<EEventDevVO> findByWhere(EEventDevVO eEventDevVO) {
        EEventDevDomain eEventDevDomain=  eEventDevVO.vo2Domain();
        List<EEventDevDomain> lstDomain = eEventDevReadDAO.findByWhere(eEventDevDomain);
        eEventDevVO.setTotalRow(eEventDevDomain.getTotalRow());
		eEventDevVO.setPageCurrent(eEventDevDomain.getPageCurrent());
		eEventDevVO.setDbName(eEventDevDomain.getDbName());
		eEventDevVO.setPageSize(eEventDevDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, EEventDevVO.class);
	}

}
