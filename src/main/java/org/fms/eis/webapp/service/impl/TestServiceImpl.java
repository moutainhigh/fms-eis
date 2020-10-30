/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:51
 * Title : org.fms.eis.webapp.service.impl.TestServiceImpl.java
 **/
package org.fms.eis.webapp.service.impl;

import org.fms.eis.webapp.dao.TestDAO;
import org.fms.eis.webapp.service.ITestService;
import org.fms.eis.webapp.vo.TestVO;

import com.riozenc.titanTool.annotation.TransactionDAO;
import com.riozenc.titanTool.annotation.TransactionService;

@TransactionService
public class TestServiceImpl implements ITestService {

    @TransactionDAO("read")
    private TestDAO testReadDAO;

    @TransactionDAO("write")
    private TestDAO testWriteDAO;

    @Override
    public int insert(TestVO testVO) {
        return testWriteDAO.insert(testVO.vo2Domain());
    }

}
