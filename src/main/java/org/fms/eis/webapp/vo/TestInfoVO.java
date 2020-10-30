/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.TestInfoVO.java
 **/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.TestInfoDomain;

import java.util.Date;

public class TestInfoVO extends ManagerParamVO {

    private Long id;    //
    private String userName;    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public TestInfoDomain vo2Domain() {
        TestInfoDomain _Domain = new TestInfoDomain();
        _Domain.setId(this.id);
        _Domain.setUserName(this.userName);
        return _Domain;
    }
}
