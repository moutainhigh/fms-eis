/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:32
 * Title : org.fms.eis.webapp.domain.TestDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.TgInfoVO;

import java.util.Date;

public class TgInfoDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
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
    private String tgCap;    //容量
    private Long consId;    //大用户编码

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

    public TgInfoVO domain2VO() {
        TgInfoVO testVO = new TgInfoVO();
        testVO.setId(this.id);
        testVO.setTgNo(this.tgNo);
        testVO.setTgName(this.tgName);
        testVO.setTgType(this.tgType);
        testVO.setAddress(this.address);
        testVO.setCreateDate(this.createDate);
        testVO.setRemark(this.remark);
        testVO.setStatus(this.status);
        testVO.setCommonTransClass(this.commonTransClass);
        testVO.setBusinessPlaceCode(this.businessPlaceCode);
        testVO.setTgCap(this.tgCap);
        testVO.setConsId(this.consId);
        return testVO;
    }

}
