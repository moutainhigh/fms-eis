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
import org.fms.eis.webapp.vo.PTaskDetailVO;

import java.util.Date;

public class PTaskDetailDomain extends Page implements MybatisEntity {
	@TablePrimaryKey
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
	
	public PTaskDetailVO domain2VO() {
		PTaskDetailVO testVO = new PTaskDetailVO();
				testVO.setId(this.id);
				testVO.setTplDetailId(this.tplDetailId);
				testVO.setInfopointType(this.infopointType);
				testVO.setDataId(this.dataId);
				testVO.setWeight(this.weight);
				testVO.setCreatorId(this.creatorId);
				testVO.setCreateDate(this.createDate);
				testVO.setLastModifierId(this.lastModifierId);
				testVO.setLastModifyTime(this.lastModifyTime);
				return testVO;
	}

}
