/**
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.impl.TestInfoServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.dao.TestInfoDAO;
import org.fms.eis.webapp.domain.TestInfoDomain;
import org.fms.eis.webapp.service.ITestInfoService;
import org.fms.eis.webapp.vo.TestInfoVO;

import java.util.*;

@TransactionService
public class TestInfoServiceImpl implements ITestInfoService {

    @TransactionDAO("read")
    private TestInfoDAO testInfoReadDAO;

    @TransactionDAO("write")
    private TestInfoDAO testInfoWriteDAO;

    @Override
    public int insert(TestInfoVO testInfoVO) {
        return testInfoWriteDAO.insert(testInfoVO.vo2Domain());
    }

    @Override
    public int update(TestInfoVO testInfoVO) {
        return testInfoWriteDAO.update(testInfoVO.vo2Domain());
    }

    @Override
    public int delete(TestInfoVO testInfoVO) {
        return testInfoWriteDAO.delete(testInfoVO.vo2Domain());
    }

    @Override
    public TestInfoVO findByKey(TestInfoVO testInfoVO) {
        TestInfoDomain model = testInfoReadDAO.findByKey(testInfoVO.vo2Domain());
        TestInfoVO modelVo = new TestInfoVO();
        if (model != null) {
            modelVo = model.domain2VO();
        } else {
            modelVo = null;
        }
        return modelVo;
    }

    @Override
    public List<TestInfoVO> findByWhere(TestInfoVO testInfoVO) {
        TestInfoDomain testInfoDomain = testInfoVO.vo2Domain();
        List<TestInfoDomain> lstDomain = testInfoReadDAO.findByWhere(testInfoDomain);
        testInfoVO.setTotalRow(testInfoDomain.getTotalRow());
        testInfoVO.setPageCurrent(testInfoDomain.getPageCurrent());
        testInfoVO.setDbName(testInfoDomain.getDbName());
        testInfoVO.setPageSize(testInfoDomain.getPageSize());

        return ReflectUtil.cast(lstDomain, TestInfoVO.class);
    }

}
