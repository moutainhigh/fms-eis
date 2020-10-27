/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.DropSqlVO.java
 *
**/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.DropSqlDomain;

import java.util.Date;

public class DropSqlVO extends ManagerParamVO {

		private Integer id;	//
		private String dropCode;	//
		private String dropName;	//
		private String dropSql;	//
		private String dropType;	//
		private String remark;	//
		private String status;	//
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDropCode() {
			return dropCode;
		}
		public void setDropCode(String dropCode) {
			this.dropCode = dropCode;
		}
		public String getDropName() {
			return dropName;
		}
		public void setDropName(String dropName) {
			this.dropName = dropName;
		}
		public String getDropSql() {
			return dropSql;
		}
		public void setDropSql(String dropSql) {
			this.dropSql = dropSql;
		}
		public String getDropType() {
			return dropType;
		}
		public void setDropType(String dropType) {
			this.dropType = dropType;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	

	public DropSqlDomain vo2Domain() {
		DropSqlDomain _Domain = new DropSqlDomain();
				_Domain.setId(this.id);
				_Domain.setDropCode(this.dropCode);
				_Domain.setDropName(this.dropName);
				_Domain.setDropSql(this.dropSql);
				_Domain.setDropType(this.dropType);
				_Domain.setRemark(this.remark);
				_Domain.setStatus(this.status);
				return _Domain;
	}
}
