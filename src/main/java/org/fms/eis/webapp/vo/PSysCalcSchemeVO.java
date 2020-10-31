/**
 * 计算方案
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.PSysCalcSchemeVO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.PSysCalcSchemeDomain;

import java.util.Date;

public class PSysCalcSchemeVO extends ManagerParamVO {

    private Integer id;    //方案ID
    private String name;    //名称(1：分钟2：日3：月)
    private String type;    //方案类型
    private String status;    //是否有效
    private String begmon;    //起始月
    private Integer begday;    //起始日
    private Integer beghour;    //起始时
    private Integer endmon;    //结束月
    private Integer endday;    //结束日
    private Integer endhour;    //结束时
    private String defset;    //是否默认
    private Integer cycle;    //生存周期
    private Long creatorId;    //创建者

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBegmon() {
        return begmon;
    }

    public void setBegmon(String begmon) {
        this.begmon = begmon;
    }

    public Integer getBegday() {
        return begday;
    }

    public void setBegday(Integer begday) {
        this.begday = begday;
    }

    public Integer getBeghour() {
        return beghour;
    }

    public void setBeghour(Integer beghour) {
        this.beghour = beghour;
    }

    public Integer getEndmon() {
        return endmon;
    }

    public void setEndmon(Integer endmon) {
        this.endmon = endmon;
    }

    public Integer getEndday() {
        return endday;
    }

    public void setEndday(Integer endday) {
        this.endday = endday;
    }

    public Integer getEndhour() {
        return endhour;
    }

    public void setEndhour(Integer endhour) {
        this.endhour = endhour;
    }

    public String getDefset() {
        return defset;
    }

    public void setDefset(String defset) {
        this.defset = defset;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
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


    public PSysCalcSchemeDomain vo2Domain() {
        PSysCalcSchemeDomain pSysCalcSchemeDomain = ReflectUtil.cast(this, PSysCalcSchemeDomain.class);
        return pSysCalcSchemeDomain;
    }
}
