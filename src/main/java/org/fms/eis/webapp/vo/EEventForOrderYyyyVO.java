/**
 * 工单相关异常事件
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.EEventForOrderYyyyVO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.EEventForOrderYyyyDomain;

import java.util.Date;
import java.math.BigDecimal;

public class EEventForOrderYyyyVO extends ManagerParamVO {

    private BigDecimal eventNo;    //事件编码
    private String objId;    //对象编码
    private String objType;    //对象类型
    private String eventAlarmLevel;    //对象告警级别 标准编码：1.131告警级别【EVENT_GRADE】
    private String objName;    //对象名称
    private Long businessPlaceCode;    //管理单位

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date eventTime;    //发生时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dataTime;    //数据时间
    private String cFlag;    //是否采集
    private String endFlag;    //结束标志 0-开始 1-结束
    private String content;    //事件内容
    private BigDecimal chkunitId;    //指标标识
    private String chkCycle;    //检查周期 日、月、季、年等（暂时按计算方案编码）
    private String dataFlag;    //是否有数据
    private String eventData;    //事件数据 各分项采用分号间隔
    private String smsFlag;    //短信发送标志 00-未发送01-已发送
    private String dealFlag;    //处理标志 00-未处理01-已处理02-已生成工单
    private String handler;    //处理人

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dealTime;    //处理时间
    private String remark;    //处理备注
    private Long creatorId;    //创建者

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public BigDecimal getEventNo() {
        return eventNo;
    }

    public void setEventNo(BigDecimal eventNo) {
        this.eventNo = eventNo;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getEventAlarmLevel() {
        return eventAlarmLevel;
    }

    public void setEventAlarmLevel(String eventAlarmLevel) {
        this.eventAlarmLevel = eventAlarmLevel;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public Long getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    public void setBusinessPlaceCode(Long businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getCFlag() {
        return cFlag;
    }

    public void setCFlag(String cFlag) {
        this.cFlag = cFlag;
    }

    public String getEndFlag() {
        return endFlag;
    }

    public void setEndFlag(String endFlag) {
        this.endFlag = endFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BigDecimal getChkunitId() {
        return chkunitId;
    }

    public void setChkunitId(BigDecimal chkunitId) {
        this.chkunitId = chkunitId;
    }

    public String getChkCycle() {
        return chkCycle;
    }

    public void setChkCycle(String chkCycle) {
        this.chkCycle = chkCycle;
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
    }

    public String getEventData() {
        return eventData;
    }

    public void setEventData(String eventData) {
        this.eventData = eventData;
    }

    public String getSmsFlag() {
        return smsFlag;
    }

    public void setSmsFlag(String smsFlag) {
        this.smsFlag = smsFlag;
    }

    public String getDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(String dealFlag) {
        this.dealFlag = dealFlag;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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


    public EEventForOrderYyyyDomain vo2Domain() {
        EEventForOrderYyyyDomain eEventForOrderYyyyDomain = ReflectUtil.cast(this, EEventForOrderYyyyDomain.class);
        return eEventForOrderYyyyDomain;
    }
}
