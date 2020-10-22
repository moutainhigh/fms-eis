/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.TestVO.java
 *
**/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.TestDomain;

public class TestVO extends ManagerParamVO {

	private String id;
	private String userName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public TestDomain vo2Domain() {
		TestDomain testDomain = new TestDomain();
		return testDomain;
	}
}
