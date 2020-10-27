/**
 * Author : chizf
 * Date : 2020年10月22日 上午10:00:51
 * Title : org.fms.eis.webapp.vo.TestVO.java
 *
**/
package org.fms.eis.webapp.vo;

import org.fms.eis.webapp.domain.pChnlGroupDomain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pChnlGroupVO extends ManagerParamVO {


	private String id;
	private String code;
	private String name;
	private String chnlTypeId;
	private String status;
	private String weight;
	private String creatorId;
	private String createDate;
	private String  lastModifierId;
	private String lastModifyTime;

	public String getId() {
		return id;
	}


	public void setId(String ID) {		this.id = ID;	}

	public String getCode() {
		return code;
	}

	public void setCode(String CODE) {
		this.code = CODE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getChnlTypeId() {
		return chnlTypeId;
	}

	public void setChnlTypeId(String CHNL_TYPE_ID) {
		this.chnlTypeId = CHNL_TYPE_ID;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getWeight() {
		return weight;
	}

	public void setWeight(String WEIGHT) {
		this.weight = WEIGHT;
	}


	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String CREATOR_ID) {
		this.creatorId = CREATOR_ID;
	}


	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String CREATE_DATE) {
		this.createDate = CREATE_DATE;
	}

	public String getLastModifierId() {
		return lastModifierId;
	}

	public void setLastModifierId(String LAST_MODIFIER_ID) {
		this.lastModifierId = LAST_MODIFIER_ID;
	}

	public String getLastModifyTime() {		return lastModifyTime;	}

	public void setLastModifyTime(String LAST_MODIFY_TIME) {
		this.lastModifyTime = LAST_MODIFY_TIME;
	}


	public pChnlGroupDomain vo2Domain() {
		pChnlGroupDomain _pChnlGroupDomain = new pChnlGroupDomain();
		try {
			_pChnlGroupDomain.setId(Long.valueOf(this.id));
			if(this.chnlTypeId!=null && !chnlTypeId.equals(""))
			{
				_pChnlGroupDomain.setChnlTypeId(Long.valueOf(this.chnlTypeId));
			}
			_pChnlGroupDomain.setCode(this.code);

			if(this.createDate!=null&& !createDate.equals("")) {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				_pChnlGroupDomain.setCreateDate(formatter.parse(this.createDate));
			}

			if(this.creatorId!=null && !creatorId.equals("")) {
				_pChnlGroupDomain.setCreatorId(Long.valueOf(this.creatorId));
			}
			if(this.lastModifierId!=null && !lastModifierId.equals("")) {
				_pChnlGroupDomain.setLastModifierId(Long.valueOf(this.lastModifierId));
			}
			_pChnlGroupDomain.setLastModifyTime(this.lastModifyTime);
			_pChnlGroupDomain.setName(this.name);
			_pChnlGroupDomain.setStatus(this.status);
			if(this.weight!=null && !weight.equals("")) {
				_pChnlGroupDomain.setWeight(Integer.parseInt(this.weight));
			}
		}
		catch (Exception ex)
		{
			//log
		}
		return _pChnlGroupDomain;
	}
}
