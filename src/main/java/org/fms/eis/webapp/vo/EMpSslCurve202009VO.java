/**
 * 测量点瞬时量曲线表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.EMpSslCurve202009VO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.EMpSslCurve202009Domain;

import java.util.Date;

public class EMpSslCurve202009VO extends ManagerParamVO {

    private String mpedId;    //测量点标识

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dataTime;    //数据时间
    private String psFlag;    //一次二次值
    private String ua;    //A相电压
    private String ub;    //B相电压
    private String uc;    //C相电压
    private String ia;    //A相电流
    private String ib;    //B相电流
    private String ic;    //C相电流
    private String i0;    //零序电流
    private String p;    //有功功率
    private String pa;    //A相有功功率
    private String pb;    //B相有功功率
    private String pc;    //C相有功功率
    private String q;    //无功功率
    private String qa;    //A相无功功率
    private String qb;    //B相无功功率
    private String qc;    //C相无功功率
    private String cos;    //功率因数
    private String cosa;    //A相功率因数
    private String cosb;    //B相功率因数
    private String cosc;    //C相功率因数
    private String sp;    //视在功率
    private String spa;    //A相视在功率
    private String spb;    //B相视在功率
    private String spc;    //C相视在功率
    private String fn;    //频率
    private String paia;    //Ia相位角
    private String paib;    //Ib相位角
    private String paic;    //Ic相位角
    private String paua;    //Uab/Ua相位角
    private String paub;    //Ub相位角
    private String pauc;    //Ucb/Uc相位角
    private String temple;    //油温
    private String avgp;    //15分钟平均有功(KW)
    private String avgq;    //15分钟平均无功(KVAR)
    private String pCoef;    //有功系数
    private String qCoef;    //无功系数
    private String vCoef;    //电压系数
    private String cCoef;    //电流系数
    private String factorCoef;    //功率因数系数

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date savedatetime;    //创建时间
    private String areaCode;    //

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

    public String getPsFlag() {
        return psFlag;
    }

    public void setPsFlag(String psFlag) {
        this.psFlag = psFlag;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getUb() {
        return ub;
    }

    public void setUb(String ub) {
        this.ub = ub;
    }

    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }

    public String getIa() {
        return ia;
    }

    public void setIa(String ia) {
        this.ia = ia;
    }

    public String getIb() {
        return ib;
    }

    public void setIb(String ib) {
        this.ib = ib;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getI0() {
        return i0;
    }

    public void setI0(String i0) {
        this.i0 = i0;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public String getQb() {
        return qb;
    }

    public void setQb(String qb) {
        this.qb = qb;
    }

    public String getQc() {
        return qc;
    }

    public void setQc(String qc) {
        this.qc = qc;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    public String getCosa() {
        return cosa;
    }

    public void setCosa(String cosa) {
        this.cosa = cosa;
    }

    public String getCosb() {
        return cosb;
    }

    public void setCosb(String cosb) {
        this.cosb = cosb;
    }

    public String getCosc() {
        return cosc;
    }

    public void setCosc(String cosc) {
        this.cosc = cosc;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getSpa() {
        return spa;
    }

    public void setSpa(String spa) {
        this.spa = spa;
    }

    public String getSpb() {
        return spb;
    }

    public void setSpb(String spb) {
        this.spb = spb;
    }

    public String getSpc() {
        return spc;
    }

    public void setSpc(String spc) {
        this.spc = spc;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getPaia() {
        return paia;
    }

    public void setPaia(String paia) {
        this.paia = paia;
    }

    public String getPaib() {
        return paib;
    }

    public void setPaib(String paib) {
        this.paib = paib;
    }

    public String getPaic() {
        return paic;
    }

    public void setPaic(String paic) {
        this.paic = paic;
    }

    public String getPaua() {
        return paua;
    }

    public void setPaua(String paua) {
        this.paua = paua;
    }

    public String getPaub() {
        return paub;
    }

    public void setPaub(String paub) {
        this.paub = paub;
    }

    public String getPauc() {
        return pauc;
    }

    public void setPauc(String pauc) {
        this.pauc = pauc;
    }

    public String getTemple() {
        return temple;
    }

    public void setTemple(String temple) {
        this.temple = temple;
    }

    public String getAvgp() {
        return avgp;
    }

    public void setAvgp(String avgp) {
        this.avgp = avgp;
    }

    public String getAvgq() {
        return avgq;
    }

    public void setAvgq(String avgq) {
        this.avgq = avgq;
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }


    public EMpSslCurve202009Domain vo2Domain() {
        EMpSslCurve202009Domain eMpSslCurve202009Domain = ReflectUtil.cast(this, EMpSslCurve202009Domain.class);
        return eMpSslCurve202009Domain;
    }
}
