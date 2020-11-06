/**
 * 计算方案模板
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.PCalcTplVO.java
 **/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.PCalcTplDomain;

import java.util.Date;

public class PCalcTplVO extends ManagerParamVO {

    private Long id;    //标识
    private String name;    //模板名称
    private String type;    //适应数据范围类型（1---厂站关口点 ２－厂站非关口点 暂时只支持测量点和考核对象两种类型）
    private String defaultFlag;    //是否默认方案（默认1---是 2-否）
    private Integer weight;//排序
    private Long creatorId;    //创建者
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(String defaultFlag) {
        this.defaultFlag = defaultFlag;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public PCalcTplDomain vo2Domain() {
        PCalcTplDomain pCalcTplDomain = ReflectUtil.cast(this, PCalcTplDomain.class);
        return pCalcTplDomain;
    }


}
