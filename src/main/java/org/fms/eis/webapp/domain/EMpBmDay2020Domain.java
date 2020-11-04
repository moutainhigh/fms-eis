/**
 * 测量点日冻结电能示值
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.domain.EMpBmDay2020Domain.java
 *
**/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.EMpBmDay2020VO;

import java.util.Date;

public class EMpBmDay2020Domain extends Page implements MybatisEntity {
	@TablePrimaryKey
		private String mpedId;	//测量点标识
		private Date dataTime;	//数据时间
		private String modifyFlag;	//修改标识
		private Date colTime;	//抄表时间
		private String p1r0;	//正向有功总
		private String p1r0P;	//质量码
		private String p2r0;	//反向有功总
		private String p2r0P;	//质量码
		private String p3r0;	//正向无功总
		private String p3r0P;	//质量码
		private String p4r0;	//反向无功总
		private String p4r0P;	//质量码
		private String p5r0;	//一象限无功总
		private String p5r0P;	//质量码
		private String p6r0;	//二象限无功总
		private String p6r0P;	//质量码
		private String p7r0;	//三象限无功总
		private String p7r0P;	//质量码
		private String p8r0;	//四象限无功总
		private String p8r0P;	//质量码
		private String p1r1;	//正向有功尖
		private String p2r1;	//反向有功尖
		private String p3r1;	//正向无功尖
		private String p4r1;	//反向无功尖
		private String p5r1;	//一象限无功尖
		private String p6r1;	//二象限无功尖
		private String p7r1;	//三象限无功尖
		private String p8r1;	//四象限无功尖
		private String p1r2;	//正向有功峰
		private String p2r2;	//反向有功峰
		private String p3r2;	//正向无功峰
		private String p4r2;	//正向无功峰
		private String p5r2;	//一象限无功峰
		private String p6r2;	//二象限无功峰
		private String p7r2;	//三象限无功峰
		private String p8r2;	//四象限无功峰
		private String p1r3;	//正向有功平
		private String p2r3;	//反向有功平
		private String p3r3;	//正向无功平
		private String p4r3;	//反向无功平
		private String p5r3;	//一象限无功平
		private String p6r3;	//二象限无功平
		private String p7r3;	//三象限无功平
		private String p8r3;	//四象限无功平
		private String p1r4;	//正向有功谷
		private String p2r4;	//反向有功谷
		private String p3r4;	//正向无功谷
		private String p4r4;	//反向无功谷
		private String p5r4;	//一象限无功谷
		private String p6r4;	//二象限无功谷
		private String p7r4;	//三象限无功谷
		private String p8r4;	//四象限无功谷
		private String p1r5;	//正向有功脊谷
		private String p2r5;	//反向有功脊谷
		private String p3r5;	//正向无功脊谷
		private String p4r5;	//反向无功脊谷
		private String p5r5;	//一象限无功脊谷
		private String p6r5;	//二象限无功脊谷
		private String p7r5;	//三象限无功脊谷
		private String p8r5;	//四象限无功脊谷
		private String apCoef;	//有功电量系数
		private String rpCoef;	//无功电量系数
		private Date savedatetime;	//创建时间
		private String areaCode;	//
		private String status;	//数据状态
		
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
	    public String getModifyFlag() {
		return modifyFlag;
	}
    public void setModifyFlag(String modifyFlag) {
		this.modifyFlag = modifyFlag;
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
	    public String getP1r0P() {
		return p1r0P;
	}
    public void setP1r0P(String p1r0P) {
		this.p1r0P = p1r0P;
	}
	    public String getP2r0() {
		return p2r0;
	}
    public void setP2r0(String p2r0) {
		this.p2r0 = p2r0;
	}
	    public String getP2r0P() {
		return p2r0P;
	}
    public void setP2r0P(String p2r0P) {
		this.p2r0P = p2r0P;
	}
	    public String getP3r0() {
		return p3r0;
	}
    public void setP3r0(String p3r0) {
		this.p3r0 = p3r0;
	}
	    public String getP3r0P() {
		return p3r0P;
	}
    public void setP3r0P(String p3r0P) {
		this.p3r0P = p3r0P;
	}
	    public String getP4r0() {
		return p4r0;
	}
    public void setP4r0(String p4r0) {
		this.p4r0 = p4r0;
	}
	    public String getP4r0P() {
		return p4r0P;
	}
    public void setP4r0P(String p4r0P) {
		this.p4r0P = p4r0P;
	}
	    public String getP5r0() {
		return p5r0;
	}
    public void setP5r0(String p5r0) {
		this.p5r0 = p5r0;
	}
	    public String getP5r0P() {
		return p5r0P;
	}
    public void setP5r0P(String p5r0P) {
		this.p5r0P = p5r0P;
	}
	    public String getP6r0() {
		return p6r0;
	}
    public void setP6r0(String p6r0) {
		this.p6r0 = p6r0;
	}
	    public String getP6r0P() {
		return p6r0P;
	}
    public void setP6r0P(String p6r0P) {
		this.p6r0P = p6r0P;
	}
	    public String getP7r0() {
		return p7r0;
	}
    public void setP7r0(String p7r0) {
		this.p7r0 = p7r0;
	}
	    public String getP7r0P() {
		return p7r0P;
	}
    public void setP7r0P(String p7r0P) {
		this.p7r0P = p7r0P;
	}
	    public String getP8r0() {
		return p8r0;
	}
    public void setP8r0(String p8r0) {
		this.p8r0 = p8r0;
	}
	    public String getP8r0P() {
		return p8r0P;
	}
    public void setP8r0P(String p8r0P) {
		this.p8r0P = p8r0P;
	}
	    public String getP1r1() {
		return p1r1;
	}
    public void setP1r1(String p1r1) {
		this.p1r1 = p1r1;
	}
	    public String getP2r1() {
		return p2r1;
	}
    public void setP2r1(String p2r1) {
		this.p2r1 = p2r1;
	}
	    public String getP3r1() {
		return p3r1;
	}
    public void setP3r1(String p3r1) {
		this.p3r1 = p3r1;
	}
	    public String getP4r1() {
		return p4r1;
	}
    public void setP4r1(String p4r1) {
		this.p4r1 = p4r1;
	}
	    public String getP5r1() {
		return p5r1;
	}
    public void setP5r1(String p5r1) {
		this.p5r1 = p5r1;
	}
	    public String getP6r1() {
		return p6r1;
	}
    public void setP6r1(String p6r1) {
		this.p6r1 = p6r1;
	}
	    public String getP7r1() {
		return p7r1;
	}
    public void setP7r1(String p7r1) {
		this.p7r1 = p7r1;
	}
	    public String getP8r1() {
		return p8r1;
	}
    public void setP8r1(String p8r1) {
		this.p8r1 = p8r1;
	}
	    public String getP1r2() {
		return p1r2;
	}
    public void setP1r2(String p1r2) {
		this.p1r2 = p1r2;
	}
	    public String getP2r2() {
		return p2r2;
	}
    public void setP2r2(String p2r2) {
		this.p2r2 = p2r2;
	}
	    public String getP3r2() {
		return p3r2;
	}
    public void setP3r2(String p3r2) {
		this.p3r2 = p3r2;
	}
	    public String getP4r2() {
		return p4r2;
	}
    public void setP4r2(String p4r2) {
		this.p4r2 = p4r2;
	}
	    public String getP5r2() {
		return p5r2;
	}
    public void setP5r2(String p5r2) {
		this.p5r2 = p5r2;
	}
	    public String getP6r2() {
		return p6r2;
	}
    public void setP6r2(String p6r2) {
		this.p6r2 = p6r2;
	}
	    public String getP7r2() {
		return p7r2;
	}
    public void setP7r2(String p7r2) {
		this.p7r2 = p7r2;
	}
	    public String getP8r2() {
		return p8r2;
	}
    public void setP8r2(String p8r2) {
		this.p8r2 = p8r2;
	}
	    public String getP1r3() {
		return p1r3;
	}
    public void setP1r3(String p1r3) {
		this.p1r3 = p1r3;
	}
	    public String getP2r3() {
		return p2r3;
	}
    public void setP2r3(String p2r3) {
		this.p2r3 = p2r3;
	}
	    public String getP3r3() {
		return p3r3;
	}
    public void setP3r3(String p3r3) {
		this.p3r3 = p3r3;
	}
	    public String getP4r3() {
		return p4r3;
	}
    public void setP4r3(String p4r3) {
		this.p4r3 = p4r3;
	}
	    public String getP5r3() {
		return p5r3;
	}
    public void setP5r3(String p5r3) {
		this.p5r3 = p5r3;
	}
	    public String getP6r3() {
		return p6r3;
	}
    public void setP6r3(String p6r3) {
		this.p6r3 = p6r3;
	}
	    public String getP7r3() {
		return p7r3;
	}
    public void setP7r3(String p7r3) {
		this.p7r3 = p7r3;
	}
	    public String getP8r3() {
		return p8r3;
	}
    public void setP8r3(String p8r3) {
		this.p8r3 = p8r3;
	}
	    public String getP1r4() {
		return p1r4;
	}
    public void setP1r4(String p1r4) {
		this.p1r4 = p1r4;
	}
	    public String getP2r4() {
		return p2r4;
	}
    public void setP2r4(String p2r4) {
		this.p2r4 = p2r4;
	}
	    public String getP3r4() {
		return p3r4;
	}
    public void setP3r4(String p3r4) {
		this.p3r4 = p3r4;
	}
	    public String getP4r4() {
		return p4r4;
	}
    public void setP4r4(String p4r4) {
		this.p4r4 = p4r4;
	}
	    public String getP5r4() {
		return p5r4;
	}
    public void setP5r4(String p5r4) {
		this.p5r4 = p5r4;
	}
	    public String getP6r4() {
		return p6r4;
	}
    public void setP6r4(String p6r4) {
		this.p6r4 = p6r4;
	}
	    public String getP7r4() {
		return p7r4;
	}
    public void setP7r4(String p7r4) {
		this.p7r4 = p7r4;
	}
	    public String getP8r4() {
		return p8r4;
	}
    public void setP8r4(String p8r4) {
		this.p8r4 = p8r4;
	}
	    public String getP1r5() {
		return p1r5;
	}
    public void setP1r5(String p1r5) {
		this.p1r5 = p1r5;
	}
	    public String getP2r5() {
		return p2r5;
	}
    public void setP2r5(String p2r5) {
		this.p2r5 = p2r5;
	}
	    public String getP3r5() {
		return p3r5;
	}
    public void setP3r5(String p3r5) {
		this.p3r5 = p3r5;
	}
	    public String getP4r5() {
		return p4r5;
	}
    public void setP4r5(String p4r5) {
		this.p4r5 = p4r5;
	}
	    public String getP5r5() {
		return p5r5;
	}
    public void setP5r5(String p5r5) {
		this.p5r5 = p5r5;
	}
	    public String getP6r5() {
		return p6r5;
	}
    public void setP6r5(String p6r5) {
		this.p6r5 = p6r5;
	}
	    public String getP7r5() {
		return p7r5;
	}
    public void setP7r5(String p7r5) {
		this.p7r5 = p7r5;
	}
	    public String getP8r5() {
		return p8r5;
	}
    public void setP8r5(String p8r5) {
		this.p8r5 = p8r5;
	}
	    public String getApCoef() {
		return apCoef;
	}
    public void setApCoef(String apCoef) {
		this.apCoef = apCoef;
	}
	    public String getRpCoef() {
		return rpCoef;
	}
    public void setRpCoef(String rpCoef) {
		this.rpCoef = rpCoef;
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
	    public String getStatus() {
		return status;
	}
    public void setStatus(String status) {
		this.status = status;
	}
	
	public EMpBmDay2020VO domain2VO() {
        EMpBmDay2020VO eMpBmDay2020VO = ReflectUtil.cast(this,EMpBmDay2020VO.class);
        return eMpBmDay2020VO;
	}

}
