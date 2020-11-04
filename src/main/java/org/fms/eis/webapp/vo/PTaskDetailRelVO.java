package org.fms.eis.webapp.vo;

import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.PDaserverGroupStaticDomain;
import org.fms.eis.webapp.domain.PTaskDetailDomain;
import org.fms.eis.webapp.domain.PTaskDetailRelDomain;

public class PTaskDetailRelVO extends PTaskDetailVO {

    private String dataName;//数据任务项名称

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public PTaskDetailRelDomain vo2Domain() {
        PTaskDetailRelDomain pTaskDetailRelDomain = ReflectUtil.cast(this, PTaskDetailRelDomain.class);
        return pTaskDetailRelDomain;
    }
}
