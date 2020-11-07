/**
 * 用户操作明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.EEventOperDataYyyyDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.EEventOperDataYyyyVO;

import java.util.Date;
import java.math.BigDecimal;

public class EEventOperDataYyyyDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long logId;    //日志标识
    private String data;    //操作内容
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public EEventOperDataYyyyVO domain2VO() {
        EEventOperDataYyyyVO eEventOperDataYyyyVO = ReflectUtil.cast(this, EEventOperDataYyyyVO.class);
        return eEventOperDataYyyyVO;
    }

}
