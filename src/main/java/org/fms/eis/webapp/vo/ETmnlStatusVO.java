/**
 * 终端状态信息
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.ETmnlStatusVO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.ETmnlStatusDomain;

import java.util.Date;
import java.math.BigDecimal;

public class ETmnlStatusVO extends ManagerParamVO {

    private Long cpId;    //采集点编码 采集点表
    private BigDecimal ctrlHostid;    //控制主机
    private String status;    //终端状态 1正常/在线
    private String mChnl1;    //主通讯方式主通道状态
    private String mChnl2;    //主通讯方式备通道状态
    private String sChnl1;    //备通讯方式主通道状态
    private String sChnl2;    //备通讯方式备通道状态
    private String mPower;    //主电源状态
    private String sPower;    //备电源状态
    private String timeStatus;    //终端时钟

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date checkTime;    //时钟检查时间
    private String meterStatus;    //表计状态
    private String psEnsureFlag;    //是否保电
    private String eliminateFlag;    //是否剔除
    private String remoteCtrlFlag;    //遥控状态
    private String alarmSetFlag;    //催费告警设置状态
    private String alarmExeFlag;    //催费告警投入状态
    private String upSendFlag;    //是否主动上报
    private String upLinkFlag;    //是否与主站通话
    private Long creatorId;    //创建者

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

    public BigDecimal getCtrlHostid() {
        return ctrlHostid;
    }

    public void setCtrlHostid(BigDecimal ctrlHostid) {
        this.ctrlHostid = ctrlHostid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMChnl1() {
        return mChnl1;
    }

    public void setMChnl1(String mChnl1) {
        this.mChnl1 = mChnl1;
    }

    public String getMChnl2() {
        return mChnl2;
    }

    public void setMChnl2(String mChnl2) {
        this.mChnl2 = mChnl2;
    }

    public String getSChnl1() {
        return sChnl1;
    }

    public void setSChnl1(String sChnl1) {
        this.sChnl1 = sChnl1;
    }

    public String getSChnl2() {
        return sChnl2;
    }

    public void setSChnl2(String sChnl2) {
        this.sChnl2 = sChnl2;
    }

    public String getMPower() {
        return mPower;
    }

    public void setMPower(String mPower) {
        this.mPower = mPower;
    }

    public String getSPower() {
        return sPower;
    }

    public void setSPower(String sPower) {
        this.sPower = sPower;
    }

    public String getTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(String timeStatus) {
        this.timeStatus = timeStatus;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getMeterStatus() {
        return meterStatus;
    }

    public void setMeterStatus(String meterStatus) {
        this.meterStatus = meterStatus;
    }

    public String getPsEnsureFlag() {
        return psEnsureFlag;
    }

    public void setPsEnsureFlag(String psEnsureFlag) {
        this.psEnsureFlag = psEnsureFlag;
    }

    public String getEliminateFlag() {
        return eliminateFlag;
    }

    public void setEliminateFlag(String eliminateFlag) {
        this.eliminateFlag = eliminateFlag;
    }

    public String getRemoteCtrlFlag() {
        return remoteCtrlFlag;
    }

    public void setRemoteCtrlFlag(String remoteCtrlFlag) {
        this.remoteCtrlFlag = remoteCtrlFlag;
    }

    public String getAlarmSetFlag() {
        return alarmSetFlag;
    }

    public void setAlarmSetFlag(String alarmSetFlag) {
        this.alarmSetFlag = alarmSetFlag;
    }

    public String getAlarmExeFlag() {
        return alarmExeFlag;
    }

    public void setAlarmExeFlag(String alarmExeFlag) {
        this.alarmExeFlag = alarmExeFlag;
    }

    public String getUpSendFlag() {
        return upSendFlag;
    }

    public void setUpSendFlag(String upSendFlag) {
        this.upSendFlag = upSendFlag;
    }

    public String getUpLinkFlag() {
        return upLinkFlag;
    }

    public void setUpLinkFlag(String upLinkFlag) {
        this.upLinkFlag = upLinkFlag;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getLastModifierId() {
        return lastModifierId;
    }

    public void setLastModifierId(Long lastModifierId) {
        this.lastModifierId = lastModifierId;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }


    public ETmnlStatusDomain vo2Domain() {
        ETmnlStatusDomain eTmnlStatusDomain = ReflectUtil.cast(this, ETmnlStatusDomain.class);
        return eTmnlStatusDomain;
    }
}
