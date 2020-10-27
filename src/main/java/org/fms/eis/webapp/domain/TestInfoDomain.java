/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:32
 * Title : org.fms.eis.webapp.domain.TestDomain.java
 *
**/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.TestInfoVO;

import java.util.Date;

public class TestInfoDomain extends Page implements MybatisEntity {
	@TablePrimaryKey
		private Long id;	//
		private String userName;	//
		
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
	
	public TestInfoVO domain2VO() {
		TestInfoVO testVO = new TestInfoVO();
				testVO.setId(this.id);
				testVO.setUserName(this.userName);
				return testVO;
	}

}
