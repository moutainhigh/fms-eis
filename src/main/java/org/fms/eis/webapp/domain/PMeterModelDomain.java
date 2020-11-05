/**
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.PMeterModelDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.PMeterModelVO;

import java.util.Date;

public class PMeterModelDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long id;    //
    private String name;    //
    private String validFlag;    //
    private String maxValue;    //
    private String apCoef;    //有功电量
    private String rpCoef;    //无功有功
    private String pCoef;    //有功
    private String qCoef;    //无功
    private String vCoef;    //电压
    private String cCoef;    //电流
    private String demandCoef;    //需量
    private String factorCoef;    //功率因数
    private Date savedatetime;    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
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

    public String getPCoef() {
        return pCoef;
    }

    public void setPCoef(String pCoef) {
        this.pCoef = pCoef;
    }

    public String getQCoef() {
        return qCoef;
    }

    public void setQCoef(String qCoef) {
        this.qCoef = qCoef;
    }

    public String getVCoef() {
        return vCoef;
    }

    public void setVCoef(String vCoef) {
        this.vCoef = vCoef;
    }

    public String getCCoef() {
        return cCoef;
    }

    public void setCCoef(String cCoef) {
        this.cCoef = cCoef;
    }

    public String getDemandCoef() {
        return demandCoef;
    }

    public void setDemandCoef(String demandCoef) {
        this.demandCoef = demandCoef;
    }

    public String getFactorCoef() {
        return factorCoef;
    }

    public void setFactorCoef(String factorCoef) {
        this.factorCoef = factorCoef;
    }

    public Date getSavedatetime() {
        return savedatetime;
    }

    public void setSavedatetime(Date savedatetime) {
        this.savedatetime = savedatetime;
    }

    public PMeterModelVO domain2VO() {
        PMeterModelVO pMeterModelVO = ReflectUtil.cast(this, PMeterModelVO.class);
        return pMeterModelVO;
    }

}
