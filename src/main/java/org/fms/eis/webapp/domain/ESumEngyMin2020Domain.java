/**
 * 电量考核单元分钟电量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.ESumEngyMin2020Domain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.ESumEngyMin2020VO;

import java.util.Date;
import java.math.BigDecimal;

public class ESumEngyMin2020Domain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private BigDecimal sumId;    //电量考核单元标识
    private Date dataTime;    //数据时间
    private BigDecimal schemeId;    //计算方案
    private String property;    //数据属性
    private BigDecimal pr0;    //有功总
    private String pr0P;    //质量码
    private BigDecimal qr0;    //无功总
    private String qr0P;    //质量码
    private BigDecimal pr1;    //有功尖
    private BigDecimal qr1;    //无功尖
    private BigDecimal pr2;    //有功峰
    private BigDecimal qr2;    //无功峰
    private BigDecimal pr3;    //有功平
    private BigDecimal qr3;    //无功平
    private BigDecimal pr4;    //有功谷
    private BigDecimal qr4;    //无功谷
    private BigDecimal pr5;    //有功脊谷
    private BigDecimal qr5;    //无功脊谷
    private Date savedatetime;    //创建时间
    private String areaCode;    //
    private String status;    //数据状态

    public BigDecimal getSumId() {
        return sumId;
    }

    public void setSumId(BigDecimal sumId) {
        this.sumId = sumId;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public BigDecimal getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(BigDecimal schemeId) {
        this.schemeId = schemeId;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public BigDecimal getPr0() {
        return pr0;
    }

    public void setPr0(BigDecimal pr0) {
        this.pr0 = pr0;
    }

    public String getPr0P() {
        return pr0P;
    }

    public void setPr0P(String pr0P) {
        this.pr0P = pr0P;
    }

    public BigDecimal getQr0() {
        return qr0;
    }

    public void setQr0(BigDecimal qr0) {
        this.qr0 = qr0;
    }

    public String getQr0P() {
        return qr0P;
    }

    public void setQr0P(String qr0P) {
        this.qr0P = qr0P;
    }

    public BigDecimal getPr1() {
        return pr1;
    }

    public void setPr1(BigDecimal pr1) {
        this.pr1 = pr1;
    }

    public BigDecimal getQr1() {
        return qr1;
    }

    public void setQr1(BigDecimal qr1) {
        this.qr1 = qr1;
    }

    public BigDecimal getPr2() {
        return pr2;
    }

    public void setPr2(BigDecimal pr2) {
        this.pr2 = pr2;
    }

    public BigDecimal getQr2() {
        return qr2;
    }

    public void setQr2(BigDecimal qr2) {
        this.qr2 = qr2;
    }

    public BigDecimal getPr3() {
        return pr3;
    }

    public void setPr3(BigDecimal pr3) {
        this.pr3 = pr3;
    }

    public BigDecimal getQr3() {
        return qr3;
    }

    public void setQr3(BigDecimal qr3) {
        this.qr3 = qr3;
    }

    public BigDecimal getPr4() {
        return pr4;
    }

    public void setPr4(BigDecimal pr4) {
        this.pr4 = pr4;
    }

    public BigDecimal getQr4() {
        return qr4;
    }

    public void setQr4(BigDecimal qr4) {
        this.qr4 = qr4;
    }

    public BigDecimal getPr5() {
        return pr5;
    }

    public void setPr5(BigDecimal pr5) {
        this.pr5 = pr5;
    }

    public BigDecimal getQr5() {
        return qr5;
    }

    public void setQr5(BigDecimal qr5) {
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

    public ESumEngyMin2020VO domain2VO() {
        ESumEngyMin2020VO eSumEngyMin2020VO = ReflectUtil.cast(this, ESumEngyMin2020VO.class);
        return eSumEngyMin2020VO;
    }

}
