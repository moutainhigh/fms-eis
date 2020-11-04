/**
 * 电量考核单元分钟电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.ESumEngyMin2020VO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.ESumEngyMin2020Domain;

import java.util.Date;

public class ESumEngyMin2020VO extends ManagerParamVO {

    private String sumId;    //电量考核单元标识

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dataTime;    //数据时间
    private String schemeId;    //计算方案
    private String property;    //数据属性
    private String pr0;    //有功总
    private String pr0P;    //质量码
    private String qr0;    //无功总
    private String qr0P;    //质量码
    private String pr1;    //有功尖
    private String qr1;    //无功尖
    private String pr2;    //有功峰
    private String qr2;    //无功峰
    private String pr3;    //有功平
    private String qr3;    //无功平
    private String pr4;    //有功谷
    private String qr4;    //无功谷
    private String pr5;    //有功脊谷
    private String qr5;    //无功脊谷

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date savedatetime;    //创建时间
    private String areaCode;    //
    private String status;    //数据状态

    public String getSumId() {
        return sumId;
    }

    public void setSumId(String sumId) {
        this.sumId = sumId;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getPr0() {
        return pr0;
    }

    public void setPr0(String pr0) {
        this.pr0 = pr0;
    }

    public String getPr0P() {
        return pr0P;
    }

    public void setPr0P(String pr0P) {
        this.pr0P = pr0P;
    }

    public String getQr0() {
        return qr0;
    }

    public void setQr0(String qr0) {
        this.qr0 = qr0;
    }

    public String getQr0P() {
        return qr0P;
    }

    public void setQr0P(String qr0P) {
        this.qr0P = qr0P;
    }

    public String getPr1() {
        return pr1;
    }

    public void setPr1(String pr1) {
        this.pr1 = pr1;
    }

    public String getQr1() {
        return qr1;
    }

    public void setQr1(String qr1) {
        this.qr1 = qr1;
    }

    public String getPr2() {
        return pr2;
    }

    public void setPr2(String pr2) {
        this.pr2 = pr2;
    }

    public String getQr2() {
        return qr2;
    }

    public void setQr2(String qr2) {
        this.qr2 = qr2;
    }

    public String getPr3() {
        return pr3;
    }

    public void setPr3(String pr3) {
        this.pr3 = pr3;
    }

    public String getQr3() {
        return qr3;
    }

    public void setQr3(String qr3) {
        this.qr3 = qr3;
    }

    public String getPr4() {
        return pr4;
    }

    public void setPr4(String pr4) {
        this.pr4 = pr4;
    }

    public String getQr4() {
        return qr4;
    }

    public void setQr4(String qr4) {
        this.qr4 = qr4;
    }

    public String getPr5() {
        return pr5;
    }

    public void setPr5(String pr5) {
        this.pr5 = pr5;
    }

    public String getQr5() {
        return qr5;
    }

    public void setQr5(String qr5) {
        this.qr5 = qr5;
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


    public ESumEngyMin2020Domain vo2Domain() {
        ESumEngyMin2020Domain eSumEngyMin2020Domain = ReflectUtil.cast(this, ESumEngyMin2020Domain.class);
        return eSumEngyMin2020Domain;
    }
}
