/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.PChnlGroupServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import org.fms.eis.webapp.dao.PChnlGroupDAO;
import org.fms.eis.webapp.domain.PChnlGroupDomain;
import org.fms.eis.webapp.service.IPChnlGroupService;
import org.fms.eis.webapp.vo.PChnlGroupVO;

import java.util.*;

@TransactionService
public class PChnlGroupServiceImpl implements IPChnlGroupService {

    @TransactionDAO("read")
    private PChnlGroupDAO testReadDAO;

    @TransactionDAO("write")
    private PChnlGroupDAO testWriteDAO;

    @Override
    public int insert(PChnlGroupVO testVO) {
        return testWriteDAO.insert(testVO.vo2Domain());
    }

    @Override
    public int update(PChnlGroupVO testVO) {
        return testWriteDAO.update(testVO.vo2Domain());
    }

    @Override
    public int delete(PChnlGroupVO testVO) {
        return testWriteDAO.delete(testVO.vo2Domain());
    }

    @Override
    public PChnlGroupVO findByKey(PChnlGroupVO testVO) {
        PChnlGroupDomain model = testReadDAO.findByKey(testVO.vo2Domain());
        PChnlGroupVO modelVo = new PChnlGroupVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<PChnlGroupVO> findByWhere(PChnlGroupVO testVO) {
        List<PChnlGroupDomain> lstDomain = testReadDAO.findByWhere(testVO.vo2Domain());
        List<PChnlGroupVO> lstVo = new ArrayList<PChnlGroupVO>();
        ;
        for (PChnlGroupDomain item : lstDomain) {
            lstVo.add(item.domain2VO());
        }
        return lstVo;
    }

}
