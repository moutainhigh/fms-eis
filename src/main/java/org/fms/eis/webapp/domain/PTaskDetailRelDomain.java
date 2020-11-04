package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import org.fms.eis.webapp.vo.PTaskDetailRelVO;

public class PTaskDetailRelDomain extends PTaskDetailDomain implements MybatisEntity {
    private String dataName;

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public PTaskDetailRelVO vo2Domain() {
        PTaskDetailRelVO pTaskDetailRelVO = ReflectUtil.cast(this, PTaskDetailRelVO.class);
        return pTaskDetailRelVO;
    }
}
