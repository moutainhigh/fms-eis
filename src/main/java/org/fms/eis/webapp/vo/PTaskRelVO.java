package org.fms.eis.webapp.vo;

import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.PTaskDomain;
import org.fms.eis.webapp.domain.PTaskRelDomain;

public class PTaskRelVO extends PTaskVO{

    private Integer isSelect;//是否选中 0-否 1-是
    private Long relID;//关联ID
    private Long tplID;//任务模板ID

    public Integer getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(Integer isSelect) {
        this.isSelect = isSelect;
    }

    public Long getRelID() {
        return relID;
    }

    public void setRelID(Long relID) {
        this.relID = relID;
    }


    public PTaskRelDomain vo2Domain() {
        PTaskRelDomain modelDomain = ReflectUtil.cast(this, PTaskRelDomain.class);
        return modelDomain;
    }


    public Long getTplID() {
        return tplID;
    }

    public void setTplID(Long tplID) {
        this.tplID = tplID;
    }
}
