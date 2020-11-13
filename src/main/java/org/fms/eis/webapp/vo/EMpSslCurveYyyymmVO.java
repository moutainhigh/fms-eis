/**
 * 测量点瞬时量曲线表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.EMpSslCurveYyyymmVO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.EMpSslCurveYyyymmDomain;

import java.util.Date;
import java.math.BigDecimal;

public class EMpSslCurveYyyymmVO extends ManagerParamVO {

    private BigDecimal mpedId;    //测量点标识

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dataTime;    //数据时间
    private String psFlag;    //一次二次值
    private BigDecimal ua;    //A相电压
    private BigDecimal ub;    //B相电压
    private BigDecimal uc;    //C相电压
    private BigDecimal ia;    //A相电流
    private BigDecimal ib;    //B相电流
    private BigDecimal ic;    //C相电流
    private BigDecimal i0;    //零序电流
    private BigDecimal p;    //有功功率
    private BigDecimal pa;    //A相有功功率
    private BigDecimal pb;    //B相有功功率
    private BigDecimal pc;    //C相有功功率
    private BigDecimal q;    //无功功率
    private BigDecimal qa;    //A相无功功率
    private BigDecimal qb;    //B相无功功率
    private BigDecimal qc;    //C相无功功率
    private BigDecimal cos;    //功率因数
    private BigDecimal cosa;    //A相功率因数
    private BigDecimal cosb;    //B相功率因数
    private BigDecimal cosc;    //C相功率因数
    private BigDecimal sp;    //视在功率
    private BigDecimal spa;    //A相视在功率
    private BigDecimal spb;    //B相视在功率
    private BigDecimal spc;    //C相视在功率
    private BigDecimal fn;    //频率
    private BigDecimal paia;    //Ia相位角
    private BigDecimal paib;    //Ib相位角
    private BigDecimal paic;    //Ic相位角
    private BigDecimal paua;    //Uab/Ua相位角
    private BigDecimal paub;    //Ub相位角
    private BigDecimal pauc;    //Ucb/Uc相位角
    private BigDecimal temple;    //油温
    private BigDecimal avgp;    //15分钟平均有功(KW)
    private BigDecimal avgq;    //15分钟平均无功(KVAR)
    private BigDecimal pCoef;    //有功系数
    private BigDecimal qCoef;    //无功系数
    private BigDecimal vCoef;    //电压系数
    private BigDecimal cCoef;    //电流系数
    private BigDecimal factorCoef;    //功率因数系数

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date savedatetime;    //创建时间
    private String areaCode;    //

    public BigDecimal getMpedId() {
        return mpedId;
    }

    public void setMpedId(BigDecimal mpedId) {
        this.mpedId = mpedId;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getPsFlag() {
        return psFlag;
    }

    public void setPsFlag(String psFlag) {
        this.psFlag = psFlag;
    }

    public BigDecimal getUa() {
        return ua;
    }

    public void setUa(BigDecimal ua) {
        this.ua = ua;
    }

    public BigDecimal getUb() {
        return ub;
    }

    public void setUb(BigDecimal ub) {
        this.ub = ub;
    }

    public BigDecimal getUc() {
        return uc;
    }

    public void setUc(BigDecimal uc) {
        this.uc = uc;
    }

    public BigDecimal getIa() {
        return ia;
    }

    public void setIa(BigDecimal ia) {
        this.ia = ia;
    }

    public BigDecimal getIb() {
        return ib;
    }

    public void setIb(BigDecimal ib) {
        this.ib = ib;
    }

    public BigDecimal getIc() {
        return ic;
    }

    public void setIc(BigDecimal ic) {
        this.ic = ic;
    }

    public BigDecimal getI0() {
        return i0;
    }

    public void setI0(BigDecimal i0) {
        this.i0 = i0;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getPa() {
        return pa;
    }

    public void setPa(BigDecimal pa) {
        this.pa = pa;
    }

    public BigDecimal getPb() {
        return pb;
    }

    public void setPb(BigDecimal pb) {
        this.pb = pb;
    }

    public BigDecimal getPc() {
        return pc;
    }

    public void setPc(BigDecimal pc) {
        this.pc = pc;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getQa() {
        return qa;
    }

    public void setQa(BigDecimal qa) {
        this.qa = qa;
    }

    public BigDecimal getQb() {
        return qb;
    }

    public void setQb(BigDecimal qb) {
        this.qb = qb;
    }

    public BigDecimal getQc() {
        return qc;
    }

    public void setQc(BigDecimal qc) {
        this.qc = qc;
    }

    public BigDecimal getCos() {
        return cos;
    }

    public void setCos(BigDecimal cos) {
        this.cos = cos;
    }

    public BigDecimal getCosa() {
        return cosa;
    }

    public void setCosa(BigDecimal cosa) {
        this.cosa = cosa;
    }

    public BigDecimal getCosb() {
        return cosb;
    }

    public void setCosb(BigDecimal cosb) {
        this.cosb = cosb;
    }

    public BigDecimal getCosc() {
        return cosc;
    }

    public void setCosc(BigDecimal cosc) {
        this.cosc = cosc;
    }

    public BigDecimal getSp() {
        return sp;
    }

    public void setSp(BigDecimal sp) {
        this.sp = sp;
    }

    public BigDecimal getSpa() {
        return spa;
    }

    public void setSpa(BigDecimal spa) {
        this.spa = spa;
    }

    public BigDecimal getSpb() {
        return spb;
    }

    public void setSpb(BigDecimal spb) {
        this.spb = spb;
    }

    public BigDecimal getSpc() {
        return spc;
    }

    public void setSpc(BigDecimal spc) {
        this.spc = spc;
    }

    public BigDecimal getFn() {
        return fn;
    }

    public void setFn(BigDecimal fn) {
        this.fn = fn;
    }

    public BigDecimal getPaia() {
        return paia;
    }

    public void setPaia(BigDecimal paia) {
        this.paia = paia;
    }

    public BigDecimal getPaib() {
        return paib;
    }

    public void setPaib(BigDecimal paib) {
        this.paib = paib;
    }

    public BigDecimal getPaic() {
        return paic;
    }

    public void setPaic(BigDecimal paic) {
        this.paic = paic;
    }

    public BigDecimal getPaua() {
        return paua;
    }

    public void setPaua(BigDecimal paua) {
        this.paua = paua;
    }

    public BigDecimal getPaub() {
        return paub;
    }

    public void setPaub(BigDecimal paub) {
        this.paub = paub;
    }

    public BigDecimal getPauc() {
        return pauc;
    }

    public void setPauc(BigDecimal pauc) {
        this.pauc = pauc;
    }

    public BigDecimal getTemple() {
        return temple;
    }

    public void setTemple(BigDecimal temple) {
        this.temple = temple;
    }

    public BigDecimal getAvgp() {
        return avgp;
    }

    public void setAvgp(BigDecimal avgp) {
        this.avgp = avgp;
    }

    public BigDecimal getAvgq() {
        return avgq;
    }

    public void setAvgq(BigDecimal avgq) {
        this.avgq = avgq;
    }

    public BigDecimal getPCoef() {
        return pCoef;
    }

    public void setPCoef(BigDecimal pCoef) {
        this.pCoef = pCoef;
    }

    public BigDecimal getQCoef() {
        return qCoef;
    }

    public void setQCoef(BigDecimal qCoef) {
        this.qCoef = qCoef;
    }

    public BigDecimal getVCoef() {
        return vCoef;
    }

    public void setVCoef(BigDecimal vCoef) {
        this.vCoef = vCoef;
    }

    public BigDecimal getCCoef() {
        return cCoef;
    }

    public void setCCoef(BigDecimal cCoef) {
        this.cCoef = cCoef;
    }

    public BigDecimal getFactorCoef() {
        return factorCoef;
    }

    public void setFactorCoef(BigDecimal factorCoef) {
        this.factorCoef = factorCoef;
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


    public EMpSslCurveYyyymmDomain vo2Domain() {
        EMpSslCurveYyyymmDomain eMpSslCurveYyyymmDomain = ReflectUtil.cast(this, EMpSslCurveYyyymmDomain.class);
        return eMpSslCurveYyyymmDomain;
    }
}
