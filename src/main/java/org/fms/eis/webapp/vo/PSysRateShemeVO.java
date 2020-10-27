/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.PSysRateShemeVO.java
 *
**/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.PSysRateShemeDomain;

import java.util.Date;

public class PSysRateShemeVO extends ManagerParamVO {

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
	

	public PSysRateShemeDomain vo2Domain() {
		PSysRateShemeDomain _Domain = new PSysRateShemeDomain();
				_Domain.setId(this.id);
				_Domain.setName(this.name);
				_Domain.setCreatorId(this.creatorId);
				_Domain.setCreateDate(this.createDate);
				_Domain.setLastModifierId(this.lastModifierId);
				_Domain.setLastModifyTime(this.lastModifyTime);
				return _Domain;
	}
}
