/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.PChnlGroupVO.java
 *
**/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.PChnlGroupDomain;

import java.util.Date;

public class PChnlGroupVO extends ManagerParamVO {

		private Long id;	//组编码
		private String code;	//编号
		private String name;	//组名称
		private Long chnlTypeId;	//通道类型标识
		private String status;	//有效标识
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
		public Long getChnlTypeId() {
			return chnlTypeId;
		}
		public void setChnlTypeId(Long chnlTypeId) {
			this.chnlTypeId = chnlTypeId;
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
	

	public PChnlGroupDomain vo2Domain() {
		PChnlGroupDomain _Domain = new PChnlGroupDomain();
				_Domain.setId(this.id);
				_Domain.setCode(this.code);
				_Domain.setName(this.name);
				_Domain.setChnlTypeId(this.chnlTypeId);
				_Domain.setStatus(this.status);
				_Domain.setWeight(this.weight);
				_Domain.setCreatorId(this.creatorId);
				_Domain.setCreateDate(this.createDate);
				_Domain.setLastModifierId(this.lastModifierId);
				_Domain.setLastModifyTime(this.lastModifyTime);
				return _Domain;
	}
}
