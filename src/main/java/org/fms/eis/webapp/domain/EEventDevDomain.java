/**
 * 主站设备事件
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.EEventDevDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.EEventDevVO;

import java.util.Date;
import java.math.BigDecimal;

public class EEventDevDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long logId;    //设备事件标识
    private BigDecimal devId;    //设备ID 系统节点表中唯一标识
    private String devName;    //设备名称
    private String devIp;    //IP
    private Date logTime;    //发生时间
    private String content;    //事件内容
    private Long creatorId;    //创建者
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public BigDecimal getDevId() {
        return devId;
    }

    public void setDevId(BigDecimal devId) {
        this.devId = devId;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevIp() {
        return devIp;
    }

    public void setDevIp(String devIp) {
        this.devIp = devIp;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public EEventDevVO domain2VO() {
        EEventDevVO eEventDevVO = ReflectUtil.cast(this, EEventDevVO.class);
        return eEventDevVO;
    }

}
