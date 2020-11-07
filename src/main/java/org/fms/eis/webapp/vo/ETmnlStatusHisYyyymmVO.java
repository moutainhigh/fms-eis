/**
 * 终端状态历史信息
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.ETmnlStatusHisYyyymmVO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.ETmnlStatusHisYyyymmDomain;

import java.util.Date;
import java.math.BigDecimal;

public class ETmnlStatusHisYyyymmVO extends ManagerParamVO {

    private Long cpId;    //采集点编码 采集点表.为性能改成数字

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dataTime;    //数据时间
    private BigDecimal status;    //状态 1在线0离线
    private BigDecimal nodeId;    //采集主机
    private String areaCode;    //区域代码
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

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getNodeId() {
        return nodeId;
    }

    public void setNodeId(BigDecimal nodeId) {
        this.nodeId = nodeId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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


    public ETmnlStatusHisYyyymmDomain vo2Domain() {
        ETmnlStatusHisYyyymmDomain eTmnlStatusHisYyyymmDomain = ReflectUtil.cast(this, ETmnlStatusHisYyyymmDomain.class);
        return eTmnlStatusHisYyyymmDomain;
    }
}
