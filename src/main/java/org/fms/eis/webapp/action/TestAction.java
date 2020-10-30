/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.TestAction.java
 **/
package org.fms.eis.webapp.action;

import org.fms.eis.webapp.service.ITestService;
import org.fms.eis.webapp.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.riozenc.titanTool.spring.web.http.HttpResult;

@ControllerAdvice
@RequestMapping("test")
public class TestAction {

    @Autowired
    @Qualifier("testServiceImpl")
    private ITestService testService;

    @ResponseBody
    @PostMapping(params = "method=insert")
    public HttpResult<?> insert(@RequestBody TestVO testVO) {
        int i = testService.insert(testVO);

        if (i > 0)
            return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
        else
            return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

    }
}
