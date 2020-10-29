/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:32
 * Title : org.fms.eis.webapp.domain.TestDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.PTaskTplDetailVO;

import java.util.Date;

public class PTaskTplDetailDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long id;    //标识
    private Long tplId;    //模板标识【P_TASK_TPL】
    private Long taskId;    //任务标识【P_TASK】
    private Integer weight;    //排序
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

    public Long getTplId() {
        return tplId;
    }

    public void setTplId(Long tplId) {
        this.tplId = tplId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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

    public PTaskTplDetailVO domain2VO() {
        PTaskTplDetailVO testVO = new PTaskTplDetailVO();
        testVO.setId(this.id);
        testVO.setTplId(this.tplId);
        testVO.setTaskId(this.taskId);
        testVO.setWeight(this.weight);
        testVO.setCreatorId(this.creatorId);
        testVO.setCreateDate(this.createDate);
        testVO.setLastModifierId(this.lastModifierId);
        testVO.setLastModifyTime(this.lastModifyTime);
        return testVO;
    }

}
