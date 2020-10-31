/**
 * 通道组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.vo.PChnlGroupVO.java
 **/
package org.fms.eis.webapp.vo;

import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.PChnlGroupDomain;
import org.fms.eis.webapp.domain.PChnlGroupStaticDomain;

import java.util.Date;

public class PChnlGroupStaticVO extends PChnlGroupVO {

    private Integer chnlCnt;    //通道数
    private Integer gpDasCnt;    //主机数

    public Integer getChnlCnt() {
        return chnlCnt;
    }

    public void setChnlCnt(Integer chnlCnt) {
        this.chnlCnt = chnlCnt;
    }

    public Integer getGpDasCnt() {
        return gpDasCnt;
    }

    public void setGpDasCnt(Integer gpDasCnt) {
        this.gpDasCnt = gpDasCnt;
    }

    public PChnlGroupStaticDomain vo2Domain() {
        PChnlGroupStaticDomain pChnlGroupStaticDomain = ReflectUtil.cast(this, PChnlGroupStaticDomain.class);
        return pChnlGroupStaticDomain;
    }
}
