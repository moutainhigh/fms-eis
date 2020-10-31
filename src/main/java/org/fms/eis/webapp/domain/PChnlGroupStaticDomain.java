/**
 * 通道组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.PChnlGroupDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.PChnlGroupStaticVO;
import org.fms.eis.webapp.vo.PChnlGroupVO;

import java.util.Date;

public class PChnlGroupStaticDomain extends PChnlGroupDomain implements MybatisEntity {

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

    public PChnlGroupStaticVO domain2VO() {
        PChnlGroupStaticVO pChnlGroupStaticVO = ReflectUtil.cast(this, PChnlGroupStaticVO.class);
        return pChnlGroupStaticVO;
    }

}
