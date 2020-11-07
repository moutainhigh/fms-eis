/**
 * 人工任务执行日志表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.RDaManualTaskLogDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.RDaManualTaskLogVO;

import java.util.Date;
import java.math.BigDecimal;

public class RDaManualTaskLogDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private String taskId;    //任务编号
    private Long cpId;    //终端编号
    private Date createTime;    //产生时间
    private Date sendTime;    //发送时间
    private String cpTaskName;    //任务名称
    private String cpTaskDescribe;    //任务描述
    private String ip;    //IP
    private String operatorNo;    //操作人员 操作员编号
    private String execStatus;    //执行状态 1.40参数下发成功标志
    private Long creatorId;    //创建者
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间
    private Date createDate;    //存盘时间

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getCpTaskName() {
        return cpTaskName;
    }

    public void setCpTaskName(String cpTaskName) {
        this.cpTaskName = cpTaskName;
    }

    public String getCpTaskDescribe() {
        return cpTaskDescribe;
    }

    public void setCpTaskDescribe(String cpTaskDescribe) {
        this.cpTaskDescribe = cpTaskDescribe;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
    }

    public String getExecStatus() {
        return execStatus;
    }

    public void setExecStatus(String execStatus) {
        this.execStatus = execStatus;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public RDaManualTaskLogVO domain2VO() {
        RDaManualTaskLogVO rDaManualTaskLogVO = ReflectUtil.cast(this, RDaManualTaskLogVO.class);
        return rDaManualTaskLogVO;
    }

}
