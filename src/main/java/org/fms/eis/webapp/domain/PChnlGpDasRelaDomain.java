/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:32
 * Title : org.fms.eis.webapp.domain.TestDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.PChnlGpDasRelaVO;

import java.util.Date;

public class PChnlGpDasRelaDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long id;    //关系标识(系统内部标识)
    private Long chnlGroupId;    //通道组标识
    private Long dasId;    //采集主机标识
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

    public Long getChnlGroupId() {
        return chnlGroupId;
    }

    public void setChnlGroupId(Long chnlGroupId) {
        this.chnlGroupId = chnlGroupId;
    }

    public Long getDasId() {
        return dasId;
    }

    public void setDasId(Long dasId) {
        this.dasId = dasId;
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

    public PChnlGpDasRelaVO domain2VO() {
        PChnlGpDasRelaVO testVO = new PChnlGpDasRelaVO();
        testVO.setId(this.id);
        testVO.setChnlGroupId(this.chnlGroupId);
        testVO.setDasId(this.dasId);
        testVO.setCreatorId(this.creatorId);
        testVO.setCreateDate(this.createDate);
        testVO.setLastModifierId(this.lastModifierId);
        testVO.setLastModifyTime(this.lastModifyTime);
        return testVO;
    }

}
