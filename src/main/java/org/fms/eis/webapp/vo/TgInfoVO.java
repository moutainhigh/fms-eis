/**
 * 台区表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.TgInfoVO.java
 **/
package org.fms.eis.webapp.vo;

import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.TgInfoDomain;

import java.util.Date;

public class TgInfoVO extends ManagerParamVO {

    private Long id;    //ID
    private String tgNo;    //台区编号
    private String tgName;    //台区名称
    private String tgType;    //公变专变标志
    private String address;    //台区位置
    private Date createDate;    //创建时间
    private String remark;    //备注
    private String status;    //状态
    private String commonTransClass;    //公变分类
    private Long businessPlaceCode;    //营业区域
    private String tgCap;    //容量（为可并列运行的变压器容量之和）
    private Long consId;    //大用户编码（用于专变台区）

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTgNo() {
        return tgNo;
    }

    public void setTgNo(String tgNo) {
        this.tgNo = tgNo;
    }

    public String getTgName() {
        return tgName;
    }

    public void setTgName(String tgName) {
        this.tgName = tgName;
    }

    public String getTgType() {
        return tgType;
    }

    public void setTgType(String tgType) {
        this.tgType = tgType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCommonTransClass() {
        return commonTransClass;
    }

    public void setCommonTransClass(String commonTransClass) {
        this.commonTransClass = commonTransClass;
    }

    public Long getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    public void setBusinessPlaceCode(Long businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode;
    }

    public String getTgCap() {
        return tgCap;
    }

    public void setTgCap(String tgCap) {
        this.tgCap = tgCap;
    }

    public Long getConsId() {
        return consId;
    }

    public void setConsId(Long consId) {
        this.consId = consId;
    }


    public TgInfoDomain vo2Domain() {
        TgInfoDomain tgInfoDomain = ReflectUtil.cast(this, TgInfoDomain.class);
        return tgInfoDomain;
    }
}
