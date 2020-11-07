/**
 * 异常检测事件
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.EEventCheckDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.EEventCheckVO;

import java.util.Date;
import java.math.BigDecimal;

public class EEventCheckDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private BigDecimal eventNo;    //事件编码
    private String objId;    //对象编码
    private String objType;    //对象类型
    private String eventAlarmLevel;    //对象告警级别 标准编码：1.131告警级别【EVENT_GRADE】0---由事件编码决定99—不告警其他—由该字段决定
    private String objName;    //对象名称
    private Long businessPlaceCode;    //管理单位
    private Date eventTime;    //发生时间
    private Date dataTime;    //数据时间
    private String cFlag;    //是否采集
    private String endFlag;    //结束标志 0-开始 1-结束
    private String content;    //事件内容
    private String chkCycle;    //检查周期 日、月、季、年等（暂时按计算方案编码）
    private String dataFlag;    //是否有数据
    private String eventData;    //事件数据 各分项采用分号间隔
    private String smsFlag;    //短信发送标志 00-未发送01-已发送
    private String dealFlag;    //处理标志 00-未处理01-已处理
    private String handler;    //处理人
    private Date dealTime;    //处理时间
    private String remark;    //处理备注
    private Long creatorId;    //创建者
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

    public EEventCheckVO domain2VO() {
        EEventCheckVO eEventCheckVO = ReflectUtil.cast(this, EEventCheckVO.class);
        return eEventCheckVO;
    }

}
