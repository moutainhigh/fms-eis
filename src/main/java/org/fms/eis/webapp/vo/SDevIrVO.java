/**
 * 记录计量点新装及变更过程中的电能表，互感器，计量柜、计量屏，计量箱，失压仪，采集终端等设备的装拆信息实体，定义了设
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.SDevIrVO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.SDevIrDomain;

import java.util.Date;

public class SDevIrVO extends ManagerParamVO {

    private String id;    //本实体记录的唯一标识号
    private String mpedId;    //计量点的唯一标识编号
    private String cpNo;    //采集点编号
    private String equipTypeCode;    //01电能表、02互感器、03失压仪等
    private String equipId;    //设备的唯一标识编号，取自营销设备域
    private String typeCode;    //01安装、02拆除

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date irDate;    //装拆日期
    private String empNo;    //装拆人员代码
    private String deptNo;    //装拆部门代码
    private String orgNo;    //装拆单位代码
    private String reason;    //装拆原因
    private String remark;    //装拆备注
    private String meterAssetNo;    //
    private String tvAssetNo;    //
    private String taAssetNo;    //
    private String manufacturer;    //
    private String taRatio;    //
    private String taValue;    //
    private String tvRatio;    //
    private String tvValue;    //
    private String tFactor;    //
    private String iDirection;    //
    private String meterNo;    //
    private String p1r0;    //
    private String p2r0;    //
    private String p3r0;    //
    private String p4r0;    //
    private String p5r0;    //
    private String p6r0;    //
    private String p7r0;    //
    private String p8r0;    //
    private String p1r1;    //
    private String p2r1;    //
    private String p3r1;    //
    private String p4r1;    //
    private String p5r1;    //
    private String p6r1;    //
    private String p7r1;    //
    private String p8r1;    //
    private String p1r2;    //
    private String p2r2;    //
    private String p3r2;    //
    private String p4r2;    //
    private String p5r2;    //
    private String p6r2;    //
    private String p7r2;    //
    private String p8r2;    //
    private String p1r3;    //
    private String p2r3;    //
    private String p3r3;    //
    private String p4r3;    //
    private String p5r3;    //
    private String p6r3;    //
    private String p7r3;    //
    private String p8r3;    //
    private String p1r4;    //
    private String p2r4;    //
    private String p3r4;    //
    private String p4r4;    //
    private String p5r4;    //
    private String p6r4;    //
    private String p7r4;    //
    private String p8r4;    //
    private String p1r5;    //
    private String p2r5;    //
    private String p3r5;    //
    private String p4r5;    //
    private String p5r5;    //
    private String p6r5;    //
    private String p7r5;    //
    private String p8r5;    //
    private String remcap;    //

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date savedatetime;    //
    private String coef;    //
    private String modelCode;    //
    private String taAssetNoB;    //
    private String taAssetNoC;    //

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMpedId() {
        return mpedId;
    }

    public void setMpedId(String mpedId) {
        this.mpedId = mpedId;
    }

    public String getCpNo() {
        return cpNo;
    }

    public void setCpNo(String cpNo) {
        this.cpNo = cpNo;
    }

    public String getEquipTypeCode() {
        return equipTypeCode;
    }

    public void setEquipTypeCode(String equipTypeCode) {
        this.equipTypeCode = equipTypeCode;
    }

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Date getIrDate() {
        return irDate;
    }

    public void setIrDate(Date irDate) {
        this.irDate = irDate;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMeterAssetNo() {
        return meterAssetNo;
    }

    public void setMeterAssetNo(String meterAssetNo) {
        this.meterAssetNo = meterAssetNo;
    }

    public String getTvAssetNo() {
        return tvAssetNo;
    }

    public void setTvAssetNo(String tvAssetNo) {
        this.tvAssetNo = tvAssetNo;
    }

    public String getTaAssetNo() {
        return taAssetNo;
    }

    public void setTaAssetNo(String taAssetNo) {
        this.taAssetNo = taAssetNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTaRatio() {
        return taRatio;
    }

    public void setTaRatio(String taRatio) {
        this.taRatio = taRatio;
    }

    public String getTaValue() {
        return taValue;
    }

    public void setTaValue(String taValue) {
        this.taValue = taValue;
    }

    public String getTvRatio() {
        return tvRatio;
    }

    public void setTvRatio(String tvRatio) {
        this.tvRatio = tvRatio;
    }

    public String getTvValue() {
        return tvValue;
    }

    public void setTvValue(String tvValue) {
        this.tvValue = tvValue;
    }

    public String getTFactor() {
        return tFactor;
    }

    public void setTFactor(String tFactor) {
        this.tFactor = tFactor;
    }

    public String getIDirection() {
        return iDirection;
    }

    public void setIDirection(String iDirection) {
        this.iDirection = iDirection;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getP1r0() {
        return p1r0;
    }

    public void setP1r0(String p1r0) {
        this.p1r0 = p1r0;
    }

    public String getP2r0() {
        return p2r0;
    }

    public void setP2r0(String p2r0) {
        this.p2r0 = p2r0;
    }

    public String getP3r0() {
        return p3r0;
    }

    public void setP3r0(String p3r0) {
        this.p3r0 = p3r0;
    }

    public String getP4r0() {
        return p4r0;
    }

    public void setP4r0(String p4r0) {
        this.p4r0 = p4r0;
    }

    public String getP5r0() {
        return p5r0;
    }

    public void setP5r0(String p5r0) {
        this.p5r0 = p5r0;
    }

    public String getP6r0() {
        return p6r0;
    }

    public void setP6r0(String p6r0) {
        this.p6r0 = p6r0;
    }

    public String getP7r0() {
        return p7r0;
    }

    public void setP7r0(String p7r0) {
        this.p7r0 = p7r0;
    }

    public String getP8r0() {
        return p8r0;
    }

    public void setP8r0(String p8r0) {
        this.p8r0 = p8r0;
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

    public String getRemcap() {
        return remcap;
    }

    public void setRemcap(String remcap) {
        this.remcap = remcap;
    }

    public Date getSavedatetime() {
        return savedatetime;
    }

    public void setSavedatetime(Date savedatetime) {
        this.savedatetime = savedatetime;
    }

    public String getCoef() {
        return coef;
    }

    public void setCoef(String coef) {
        this.coef = coef;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getTaAssetNoB() {
        return taAssetNoB;
    }

    public void setTaAssetNoB(String taAssetNoB) {
        this.taAssetNoB = taAssetNoB;
    }

    public String getTaAssetNoC() {
        return taAssetNoC;
    }

    public void setTaAssetNoC(String taAssetNoC) {
        this.taAssetNoC = taAssetNoC;
    }


    public SDevIrDomain vo2Domain() {
        SDevIrDomain sDevIrDomain = ReflectUtil.cast(this, SDevIrDomain.class);
        return sDevIrDomain;
    }
}
