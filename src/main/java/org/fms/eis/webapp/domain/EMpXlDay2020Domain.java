/**
 * 测量点日冻结需量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.domain.EMpXlDay2020Domain.java
 *
**/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.EMpXlDay2020VO;

import java.util.Date;

public class EMpXlDay2020Domain extends Page implements MybatisEntity {
	@TablePrimaryKey
		private String mpedId;	//测量点标识
		private Date dataTime;	//数据时间
		private Date colTime;	//抄表时间
		private String p1r0;	//正向有功总
		private String p1r0Dt;	//发生时间
		private String p2r0;	//反向有功总
		private String p2r0Dt;	//发生时间
		private String p1r1;	//正向有功尖
		private String p1r1Dt;	//发生时间
		private String p2r1;	//反向有功尖
		private String p2r1Dt;	//发生时间
		private String p1r2;	//正向有功峰
		private String p1r2Dt;	//发生时间
		private String p2r2;	//发生时间
		private String p2r2Dt;	//发生时间
		private String p1r3;	//正向有功平
		private String p1r3Dt;	//发生时间
		private String p2r3;	//反向有功平
		private String p2r3Dt;	//发生时间
		private String p1r4;	//正向有功谷
		private String p1r4Dt;	//发生时间
		private String p2r4;	//反向有功谷
		private String p2r4Dt;	//发生时间
		private String p1r5;	//正向有功脊谷
		private String p1r5Dt;	//发生时间
		private String p2r5;	//反向有功脊谷
		private String p2r5Dt;	//发生时间
		private String demandCoef;	//需量系数
		private Date savedatetime;	//创建者
		private String areaCode;	//
		
	    public String getMpedId() {
		return mpedId;
	}
    public void setMpedId(String mpedId) {
		this.mpedId = mpedId;
	}
	    public Date getDataTime() {
		return dataTime;
	}
    public void setDataTime(Date dataTime) {
		this.dataTime = dataTime;
	}
	    public Date getColTime() {
		return colTime;
	}
    public void setColTime(Date colTime) {
		this.colTime = colTime;
	}
	    public String getP1r0() {
		return p1r0;
	}
    public void setP1r0(String p1r0) {
		this.p1r0 = p1r0;
	}
	    public String getP1r0Dt() {
		return p1r0Dt;
	}
    public void setP1r0Dt(String p1r0Dt) {
		this.p1r0Dt = p1r0Dt;
	}
	    public String getP2r0() {
		return p2r0;
	}
    public void setP2r0(String p2r0) {
		this.p2r0 = p2r0;
	}
	    public String getP2r0Dt() {
		return p2r0Dt;
	}
    public void setP2r0Dt(String p2r0Dt) {
		this.p2r0Dt = p2r0Dt;
	}
	    public String getP1r1() {
		return p1r1;
	}
    public void setP1r1(String p1r1) {
		this.p1r1 = p1r1;
	}
	    public String getP1r1Dt() {
		return p1r1Dt;
	}
    public void setP1r1Dt(String p1r1Dt) {
		this.p1r1Dt = p1r1Dt;
	}
	    public String getP2r1() {
		return p2r1;
	}
    public void setP2r1(String p2r1) {
		this.p2r1 = p2r1;
	}
	    public String getP2r1Dt() {
		return p2r1Dt;
	}
    public void setP2r1Dt(String p2r1Dt) {
		this.p2r1Dt = p2r1Dt;
	}
	    public String getP1r2() {
		return p1r2;
	}
    public void setP1r2(String p1r2) {
		this.p1r2 = p1r2;
	}
	    public String getP1r2Dt() {
		return p1r2Dt;
	}
    public void setP1r2Dt(String p1r2Dt) {
		this.p1r2Dt = p1r2Dt;
	}
	    public String getP2r2() {
		return p2r2;
	}
    public void setP2r2(String p2r2) {
		this.p2r2 = p2r2;
	}
	    public String getP2r2Dt() {
		return p2r2Dt;
	}
    public void setP2r2Dt(String p2r2Dt) {
		this.p2r2Dt = p2r2Dt;
	}
	    public String getP1r3() {
		return p1r3;
	}
    public void setP1r3(String p1r3) {
		this.p1r3 = p1r3;
	}
	    public String getP1r3Dt() {
		return p1r3Dt;
	}
    public void setP1r3Dt(String p1r3Dt) {
		this.p1r3Dt = p1r3Dt;
	}
	    public String getP2r3() {
		return p2r3;
	}
    public void setP2r3(String p2r3) {
		this.p2r3 = p2r3;
	}
	    public String getP2r3Dt() {
		return p2r3Dt;
	}
    public void setP2r3Dt(String p2r3Dt) {
		this.p2r3Dt = p2r3Dt;
	}
	    public String getP1r4() {
		return p1r4;
	}
    public void setP1r4(String p1r4) {
		this.p1r4 = p1r4;
	}
	    public String getP1r4Dt() {
		return p1r4Dt;
	}
    public void setP1r4Dt(String p1r4Dt) {
		this.p1r4Dt = p1r4Dt;
	}
	    public String getP2r4() {
		return p2r4;
	}
    public void setP2r4(String p2r4) {
		this.p2r4 = p2r4;
	}
	    public String getP2r4Dt() {
		return p2r4Dt;
	}
    public void setP2r4Dt(String p2r4Dt) {
		this.p2r4Dt = p2r4Dt;
	}
	    public String getP1r5() {
		return p1r5;
	}
    public void setP1r5(String p1r5) {
		this.p1r5 = p1r5;
	}
	    public String getP1r5Dt() {
		return p1r5Dt;
	}
    public void setP1r5Dt(String p1r5Dt) {
		this.p1r5Dt = p1r5Dt;
	}
	    public String getP2r5() {
		return p2r5;
	}
    public void setP2r5(String p2r5) {
		this.p2r5 = p2r5;
	}
	    public String getP2r5Dt() {
		return p2r5Dt;
	}
    public void setP2r5Dt(String p2r5Dt) {
		this.p2r5Dt = p2r5Dt;
	}
	    public String getDemandCoef() {
		return demandCoef;
	}
    public void setDemandCoef(String demandCoef) {
		this.demandCoef = demandCoef;
	}
	    public Date getSavedatetime() {
		return savedatetime;
	}
    public void setSavedatetime(Date savedatetime) {
		this.savedatetime = savedatetime;
	}
	    public String getAreaCode() {
		return areaCode;
	}
    public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	public EMpXlDay2020VO domain2VO() {
        EMpXlDay2020VO eMpXlDay2020VO = ReflectUtil.cast(this,EMpXlDay2020VO.class);
        return eMpXlDay2020VO;
	}

}
