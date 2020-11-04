/**
 * 电量考核单元分钟电量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.impl.ESumEngyMin2020ServiceImpl.java
 *
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.ESumEngyMin2020DAO;
import org.fms.eis.webapp.domain.ESumEngyMin2020Domain;
import org.fms.eis.webapp.service.IESumEngyMin2020Service;
import org.fms.eis.webapp.vo.ESumEngyMin2020VO;

import java.util.*;

@TransactionService
public class ESumEngyMin2020ServiceImpl implements IESumEngyMin2020Service {

	@TransactionDAO("read")
	private ESumEngyMin2020DAO eSumEngyMin2020ReadDAO;

	@TransactionDAO("write")
	private ESumEngyMin2020DAO eSumEngyMin2020WriteDAO;

	@Override
	public int insert(ESumEngyMin2020VO eSumEngyMin2020VO) {
		return eSumEngyMin2020WriteDAO.insert(eSumEngyMin2020VO.vo2Domain());
	}

	@Override
	public int update(ESumEngyMin2020VO eSumEngyMin2020VO) {
		return eSumEngyMin2020WriteDAO.update(eSumEngyMin2020VO.vo2Domain());
	}

	@Override
	public int delete(ESumEngyMin2020VO eSumEngyMin2020VO) {
		return eSumEngyMin2020WriteDAO.delete(eSumEngyMin2020VO.vo2Domain());
	}

	@Override
    public HttpResult deleteList(List<ESumEngyMin2020VO> deleteList) throws Exception {
        int num = eSumEngyMin2020WriteDAO.deleteList(ReflectUtil.cast(deleteList, ESumEngyMin2020Domain.class));
        if(num==deleteList.size()) {
            return new HttpResult(HttpResult.SUCCESS,"删除成功，删除条数："+num);
        }else {
            throw new Exception();
        }
    }

	@Override
	public ESumEngyMin2020VO findByKey(ESumEngyMin2020VO eSumEngyMin2020VO){
		ESumEngyMin2020Domain model= eSumEngyMin2020ReadDAO.findByKey(eSumEngyMin2020VO.vo2Domain());
		ESumEngyMin2020VO modelVo=new ESumEngyMin2020VO();
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
	public List<ESumEngyMin2020VO> findByWhere(ESumEngyMin2020VO eSumEngyMin2020VO) {
        ESumEngyMin2020Domain eSumEngyMin2020Domain=  eSumEngyMin2020VO.vo2Domain();
        List<ESumEngyMin2020Domain> lstDomain = eSumEngyMin2020ReadDAO.findByWhere(eSumEngyMin2020Domain);
        eSumEngyMin2020VO.setTotalRow(eSumEngyMin2020Domain.getTotalRow());
		eSumEngyMin2020VO.setPageCurrent(eSumEngyMin2020Domain.getPageCurrent());
		eSumEngyMin2020VO.setDbName(eSumEngyMin2020Domain.getDbName());
		eSumEngyMin2020VO.setPageSize(eSumEngyMin2020Domain.getPageSize());

        return ReflectUtil.cast(lstDomain, ESumEngyMin2020VO.class);
	}

}
