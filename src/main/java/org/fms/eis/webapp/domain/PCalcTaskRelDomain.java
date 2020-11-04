package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import org.fms.eis.webapp.vo.PCalcTaskRelVO;
import org.fms.eis.webapp.vo.PCalcTaskVO;

public class PCalcTaskRelDomain extends PCalcTaskDomain implements MybatisEntity {
    private Long relID;//P_CALC_TPL_DETAIL表ID
    private Integer tplID;//P_CALC_TPL表的ID

    public Long getRelID() {
        return relID;
    }

    public void setRelID(Long relID) {
        this.relID = relID;
    }

    public Integer getTplID() {
        return tplID;
    }

    public void setTplID(Integer tplID) {
        this.tplID = tplID;
    }

    public PCalcTaskRelVO domain2VO() {
        PCalcTaskRelVO modelVO = ReflectUtil.cast(this, PCalcTaskRelVO.class);
        return modelVO;
    }
}
