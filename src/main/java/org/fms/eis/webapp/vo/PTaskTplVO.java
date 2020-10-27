/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.PTaskTplVO.java
 *
**/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.PTaskTplDomain;

import java.util.Date;

public class PTaskTplVO extends ManagerParamVO {

		private Long id;	//编码
		private String code;	//编号
		private String name;	//模板名称
		private Long protocolId;	//规约编码
		private String defaultFlag;	//是否默认方案
		private String status;	//可用标志
		private Integer weight;	//排序
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
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getProtocolId() {
			return protocolId;
		}
		public void setProtocolId(Long protocolId) {
			this.protocolId = protocolId;
		}
		public String getDefaultFlag() {
			return defaultFlag;
		}
		public void setDefaultFlag(String defaultFlag) {
			this.defaultFlag = defaultFlag;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Integer getWeight() {
			return weight;
		}
		public void setWeight(Integer weight) {
			this.weight = weight;
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
	

	public PTaskTplDomain vo2Domain() {
		PTaskTplDomain _Domain = new PTaskTplDomain();
				_Domain.setId(this.id);
				_Domain.setCode(this.code);
				_Domain.setName(this.name);
				_Domain.setProtocolId(this.protocolId);
				_Domain.setDefaultFlag(this.defaultFlag);
				_Domain.setStatus(this.status);
				_Domain.setWeight(this.weight);
				_Domain.setCreatorId(this.creatorId);
				_Domain.setCreateDate(this.createDate);
				_Domain.setLastModifierId(this.lastModifierId);
				_Domain.setLastModifyTime(this.lastModifyTime);
				return _Domain;
	}
}
