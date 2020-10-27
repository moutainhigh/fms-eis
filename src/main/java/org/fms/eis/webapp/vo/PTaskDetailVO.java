/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.PTaskDetailVO.java
 *
**/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.PTaskDetailDomain;

import java.util.Date;

public class PTaskDetailVO extends ManagerParamVO {

		private Long id;	//编码
		private Long tplDetailId;	//任务编码
		private String infopointType;	//信息点类型
		private Long dataId;	//数据单元编码
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
		public Long getTplDetailId() {
			return tplDetailId;
		}
		public void setTplDetailId(Long tplDetailId) {
			this.tplDetailId = tplDetailId;
		}
		public String getInfopointType() {
			return infopointType;
		}
		public void setInfopointType(String infopointType) {
			this.infopointType = infopointType;
		}
		public Long getDataId() {
			return dataId;
		}
		public void setDataId(Long dataId) {
			this.dataId = dataId;
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
	

	public PTaskDetailDomain vo2Domain() {
		PTaskDetailDomain _Domain = new PTaskDetailDomain();
				_Domain.setId(this.id);
				_Domain.setTplDetailId(this.tplDetailId);
				_Domain.setInfopointType(this.infopointType);
				_Domain.setDataId(this.dataId);
				_Domain.setWeight(this.weight);
				_Domain.setCreatorId(this.creatorId);
				_Domain.setCreateDate(this.createDate);
				_Domain.setLastModifierId(this.lastModifierId);
				_Domain.setLastModifyTime(this.lastModifyTime);
				return _Domain;
	}
}
