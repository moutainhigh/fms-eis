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
import org.fms.eis.webapp.vo.pChnlGroupVO;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pChnlGroupDomain extends Page implements MybatisEntity {
	@TablePrimaryKey
	private Long id;
	private String code;
	private String name;
	private Long chnlTypeId;
	private String status;
	private Integer weight;
	private Long creatorId;
	private Date createDate;
	private Long  lastModifierId;
	private String lastModifyTime;

	public Long getId() {
		return id;
	}


	public void setId(Long ID) {
		this.id = ID;
	}

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


	public Long getChnlTypeId() {
		return chnlTypeId;
	}

	public void setChnlTypeId(Long CHNL_TYPE_ID) {
		this.chnlTypeId = CHNL_TYPE_ID;
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

	public void setWeight(Integer WEIGHT) {
		this.weight = WEIGHT;
	}


	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long CREATOR_ID) {
		this.creatorId = CREATOR_ID;
	}


	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date CREATE_DATE) {
		this.createDate = CREATE_DATE;
	}

	public Long getLastModifierId() {
		return lastModifierId;
	}

	public void setLastModifierId(Long LAST_MODIFIER_ID) {
		this.lastModifierId = LAST_MODIFIER_ID;
	}

	public String getLastModifyTime() {		return lastModifyTime;	}

	public void setLastModifyTime(String LAST_MODIFY_TIME) {
		this.lastModifyTime = LAST_MODIFY_TIME;
	}


	public pChnlGroupVO domain2VO() {
		pChnlGroupVO testVO = new pChnlGroupVO();
		testVO.setChnlTypeId(Long.toString(this.chnlTypeId));
		testVO.setCode(this.code);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		testVO.setCreateDate(formatter.format(this.createDate));
		testVO.setCreatorId(Long.toString(this.creatorId));
		testVO.setId(Long.toString(this.id));
		testVO.setLastModifierId(Long.toString(this.lastModifierId));
		testVO.setLastModifyTime(this.lastModifyTime);
		testVO.setName(this.name);
		testVO.setStatus(this.status);
		testVO.setWeight(String.valueOf(this.weight));

		return testVO;
	}

}
