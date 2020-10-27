/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.SystemCommonConfigVO.java
 *
**/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.SystemCommonConfigDomain;

import java.util.Date;

public class SystemCommonConfigVO extends ManagerParamVO {

		private Long id;	//
		private String type;	//
		private String paramName;	//
		private String paramKey;	//
		private String paramValue;	//
		private String status;	//
		private String paramOrder;	//
		private String remark1;	//
		private String remark2;	//
		private String remark3;	//
		private String remark4;	//
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getParamName() {
			return paramName;
		}
		public void setParamName(String paramName) {
			this.paramName = paramName;
		}
		public String getParamKey() {
			return paramKey;
		}
		public void setParamKey(String paramKey) {
			this.paramKey = paramKey;
		}
		public String getParamValue() {
			return paramValue;
		}
		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getParamOrder() {
			return paramOrder;
		}
		public void setParamOrder(String paramOrder) {
			this.paramOrder = paramOrder;
		}
		public String getRemark1() {
			return remark1;
		}
		public void setRemark1(String remark1) {
			this.remark1 = remark1;
		}
		public String getRemark2() {
			return remark2;
		}
		public void setRemark2(String remark2) {
			this.remark2 = remark2;
		}
		public String getRemark3() {
			return remark3;
		}
		public void setRemark3(String remark3) {
			this.remark3 = remark3;
		}
		public String getRemark4() {
			return remark4;
		}
		public void setRemark4(String remark4) {
			this.remark4 = remark4;
		}
	

	public SystemCommonConfigDomain vo2Domain() {
		SystemCommonConfigDomain _Domain = new SystemCommonConfigDomain();
				_Domain.setId(this.id);
				_Domain.setType(this.type);
				_Domain.setParamName(this.paramName);
				_Domain.setParamKey(this.paramKey);
				_Domain.setParamValue(this.paramValue);
				_Domain.setStatus(this.status);
				_Domain.setParamOrder(this.paramOrder);
				_Domain.setRemark1(this.remark1);
				_Domain.setRemark2(this.remark2);
				_Domain.setRemark3(this.remark3);
				_Domain.setRemark4(this.remark4);
				return _Domain;
	}
}
