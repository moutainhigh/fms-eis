/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:32
 * Title : org.fms.eis.webapp.domain.TestDomain.java
 *
**/
package org.fms.eis.webapp.domain;

import org.fms.eis.webapp.vo.TestVO;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.mybatis.MybatisEntity;

public class TestDomain implements MybatisEntity {
	@TablePrimaryKey
	private Long id;
	private String userName;

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

	public TestVO domain2VO() {
		TestVO testVO = new TestVO();
		return testVO;
	}

}
