/**
 * 电力计划表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.EPlanYyyyDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.EPlanYyyyVO;

import java.util.Date;
import java.math.BigDecimal;

public class EPlanYyyyDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long planId;    //唯一标识
    private String objId;    //对象编码
    private String objType;    //对象类型 标准编码
    private Date dataTime;    //时间
    private String planType;    //计划类型 标准编码
    private BigDecimal planCycle;    //计划周期 计算方案表
    private BigDecimal planValue;    //计划值
    private BigDecimal planUpLimit;    //计划上限值
    private BigDecimal planDownLimit;    //计划下限值
    private Long creatorId;    //创建者
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
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

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public BigDecimal getPlanCycle() {
        return planCycle;
    }

    public void setPlanCycle(BigDecimal planCycle) {
        this.planCycle = planCycle;
    }

    public BigDecimal getPlanValue() {
        return planValue;
    }

    public void setPlanValue(BigDecimal planValue) {
        this.planValue = planValue;
    }

    public BigDecimal getPlanUpLimit() {
        return planUpLimit;
    }

    public void setPlanUpLimit(BigDecimal planUpLimit) {
        this.planUpLimit = planUpLimit;
    }

    public BigDecimal getPlanDownLimit() {
        return planDownLimit;
    }

    public void setPlanDownLimit(BigDecimal planDownLimit) {
        this.planDownLimit = planDownLimit;
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

    public EPlanYyyyVO domain2VO() {
        EPlanYyyyVO ePlanYyyyVO = ReflectUtil.cast(this, EPlanYyyyVO.class);
        return ePlanYyyyVO;
    }

}
