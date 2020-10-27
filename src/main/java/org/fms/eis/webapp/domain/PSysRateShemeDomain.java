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
import org.fms.eis.webapp.vo.PSysRateShemeVO;

import java.util.Date;

public class PSysRateShemeDomain extends Page implements MybatisEntity {
	@TablePrimaryKey
		private Long id;	//编码
		private String name;	//方案名称
		private Long creatorId;	//创建者
		private Date createDate;	//创建时间
		private Long lastModifierId;	//最后修改者
		private String lastModifyTime;	//最后修改时间
		
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public Long getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}
		public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
		public Long getLastModifierId() {
		return lastModifierId;
	}
	public void setLastModifierId(Long lastModifierId) {
		this.lastModifierId = lastModifierId;
	}
		public String getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(String lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	
	public PSysRateShemeVO domain2VO() {
		PSysRateShemeVO testVO = new PSysRateShemeVO();
				testVO.setId(this.id);
				testVO.setName(this.name);
				testVO.setCreatorId(this.creatorId);
				testVO.setCreateDate(this.createDate);
				testVO.setLastModifierId(this.lastModifierId);
				testVO.setLastModifyTime(this.lastModifyTime);
				return testVO;
	}

}
