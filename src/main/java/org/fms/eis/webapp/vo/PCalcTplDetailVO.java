/**
 * 计算方案模板明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.PCalcTplDetailVO.java
 **/
package org.fms.eis.webapp.vo;

import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.PCalcTplDetailDomain;

import java.util.Date;

public class PCalcTplDetailVO extends ManagerParamVO {

    private Long id;    //标识
    private Integer tplId;    //模板标识(P_CALC_TPL)
    private Long taskId;    //任务标识(P_CALC_TASK)
    private Long creatorId;    //创建者
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTplId() {
        return tplId;
    }

    public void setTplId(Integer tplId) {
        this.tplId = tplId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
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


    public PCalcTplDetailDomain vo2Domain() {
        PCalcTplDetailDomain pCalcTplDetailDomain = ReflectUtil.cast(this, PCalcTplDetailDomain.class);
        return pCalcTplDetailDomain;
    }
}
