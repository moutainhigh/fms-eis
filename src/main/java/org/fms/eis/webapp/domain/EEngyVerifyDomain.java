/**
 * 表码电量审核
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.EEngyVerifyDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.EEngyVerifyVO;

import java.util.Date;
import java.math.BigDecimal;

public class EEngyVerifyDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long mpedId;    //测量点编码 本实体记录的唯一标识
    private Date dataTime;    //数据时间
    private String dataType;    //业务类型 01-表码修改
    private String schemeType;    //电量方案类型 日月分钟等
    private String datasaveType;    //数据来源 曲线，日月冻结等
    private BigDecimal p1r0;    //正向有功总
    private BigDecimal p2r0;    //反向有功总
    private BigDecimal p3r0;    //正向无功总
    private BigDecimal p4r0;    //反向无功总
    private BigDecimal p5r0;    //一象限无功总
    private BigDecimal p6r0;    //二象限无功总
    private BigDecimal p7r0;    //三象限无功总
    private BigDecimal p8r0;    //四象限无功总
    private BigDecimal p1r1;    //正向有功尖
    private BigDecimal p2r1;    //反向有功尖
    private BigDecimal p3r1;    //正向无功尖
    private BigDecimal p4r1;    //反向无功尖
    private BigDecimal p5r1;    //一象限无功尖
    private BigDecimal p6r1;    //二象限无功尖
    private BigDecimal p7r1;    //三象限无功尖
    private BigDecimal p8r1;    //四象限无功尖
    private BigDecimal p1r2;    //正向有功峰
    private BigDecimal p2r2;    //反向有功峰
    private BigDecimal p3r2;    //正向无功峰
    private BigDecimal p4r2;    //反向无功峰
    private BigDecimal p5r2;    //一象限无功峰
    private BigDecimal p6r2;    //二象限无功峰
    private BigDecimal p7r2;    //三象限无功峰
    private BigDecimal p8r2;    //四象限无功峰
    private BigDecimal p1r3;    //正向有功平
    private BigDecimal p2r3;    //反向有功平
    private BigDecimal p3r3;    //正向无功平
    private BigDecimal p4r3;    //反向无功平
    private BigDecimal p5r3;    //一象限无功平
    private BigDecimal p6r3;    //二象限无功平
    private BigDecimal p7r3;    //三象限无功平
    private BigDecimal p8r3;    //四象限无功平
    private BigDecimal p1r4;    //正向有功谷
    private BigDecimal p2r4;    //反向有功谷
    private BigDecimal p3r4;    //正向无功谷
    private BigDecimal p4r4;    //反向无功谷
    private BigDecimal p5r4;    //一象限无功谷
    private BigDecimal p6r4;    //二象限无功谷
    private BigDecimal p7r4;    //三象限无功谷
    private BigDecimal p8r4;    //四象限无功谷
    private BigDecimal p1r5;    //正向有功脊谷
    private BigDecimal p2r5;    //反向有功脊谷
    private BigDecimal p3r5;    //正向无功脊谷
    private BigDecimal p4r5;    //反向无功脊谷
    private BigDecimal p5r5;    //一象限无功脊谷
    private BigDecimal p6r5;    //二象限无功脊谷
    private BigDecimal p7r5;    //三象限无功脊谷
    private BigDecimal p8r5;    //四象限无功脊谷
    private String operator;    //操作人员
    private String verifyFlag;    //状态 00-待审核
    private Date createTime;    //产生时间
    private String createMachine;    //产生主机
    private String auditor;    //审核员
    private Date verifyTime;    //审核时间
    private String modiType;    //追加原因
    private Long creatorId;    //创建者
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public Long getMpedId() {
        return mpedId;
    }

    public void setMpedId(Long mpedId) {
        this.mpedId = mpedId;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getSchemeType() {
        return schemeType;
    }

    public void setSchemeType(String schemeType) {
        this.schemeType = schemeType;
    }

    public String getDatasaveType() {
        return datasaveType;
    }

    public void setDatasaveType(String datasaveType) {
        this.datasaveType = datasaveType;
    }

    public BigDecimal getP1r0() {
        return p1r0;
    }

    public void setP1r0(BigDecimal p1r0) {
        this.p1r0 = p1r0;
    }

    public BigDecimal getP2r0() {
        return p2r0;
    }

    public void setP2r0(BigDecimal p2r0) {
        this.p2r0 = p2r0;
    }

    public BigDecimal getP3r0() {
        return p3r0;
    }

    public void setP3r0(BigDecimal p3r0) {
        this.p3r0 = p3r0;
    }

    public BigDecimal getP4r0() {
        return p4r0;
    }

    public void setP4r0(BigDecimal p4r0) {
        this.p4r0 = p4r0;
    }

    public BigDecimal getP5r0() {
        return p5r0;
    }

    public void setP5r0(BigDecimal p5r0) {
        this.p5r0 = p5r0;
    }

    public BigDecimal getP6r0() {
        return p6r0;
    }

    public void setP6r0(BigDecimal p6r0) {
        this.p6r0 = p6r0;
    }

    public BigDecimal getP7r0() {
        return p7r0;
    }

    public void setP7r0(BigDecimal p7r0) {
        this.p7r0 = p7r0;
    }

    public BigDecimal getP8r0() {
        return p8r0;
    }

    public void setP8r0(BigDecimal p8r0) {
        this.p8r0 = p8r0;
    }

    public BigDecimal getP1r1() {
        return p1r1;
    }

    public void setP1r1(BigDecimal p1r1) {
        this.p1r1 = p1r1;
    }

    public BigDecimal getP2r1() {
        return p2r1;
    }

    public void setP2r1(BigDecimal p2r1) {
        this.p2r1 = p2r1;
    }

    public BigDecimal getP3r1() {
        return p3r1;
    }

    public void setP3r1(BigDecimal p3r1) {
        this.p3r1 = p3r1;
    }

    public BigDecimal getP4r1() {
        return p4r1;
    }

    public void setP4r1(BigDecimal p4r1) {
        this.p4r1 = p4r1;
    }

    public BigDecimal getP5r1() {
        return p5r1;
    }

    public void setP5r1(BigDecimal p5r1) {
        this.p5r1 = p5r1;
    }

    public BigDecimal getP6r1() {
        return p6r1;
    }

    public void setP6r1(BigDecimal p6r1) {
        this.p6r1 = p6r1;
    }

    public BigDecimal getP7r1() {
        return p7r1;
    }

    public void setP7r1(BigDecimal p7r1) {
        this.p7r1 = p7r1;
    }

    public BigDecimal getP8r1() {
        return p8r1;
    }

    public void setP8r1(BigDecimal p8r1) {
        this.p8r1 = p8r1;
    }

    public BigDecimal getP1r2() {
        return p1r2;
    }

    public void setP1r2(BigDecimal p1r2) {
        this.p1r2 = p1r2;
    }

    public BigDecimal getP2r2() {
        return p2r2;
    }

    public void setP2r2(BigDecimal p2r2) {
        this.p2r2 = p2r2;
    }

    public BigDecimal getP3r2() {
        return p3r2;
    }

    public void setP3r2(BigDecimal p3r2) {
        this.p3r2 = p3r2;
    }

    public BigDecimal getP4r2() {
        return p4r2;
    }

    public void setP4r2(BigDecimal p4r2) {
        this.p4r2 = p4r2;
    }

    public BigDecimal getP5r2() {
        return p5r2;
    }

    public void setP5r2(BigDecimal p5r2) {
        this.p5r2 = p5r2;
    }

    public BigDecimal getP6r2() {
        return p6r2;
    }

    public void setP6r2(BigDecimal p6r2) {
        this.p6r2 = p6r2;
    }

    public BigDecimal getP7r2() {
        return p7r2;
    }

    public void setP7r2(BigDecimal p7r2) {
        this.p7r2 = p7r2;
    }

    public BigDecimal getP8r2() {
        return p8r2;
    }

    public void setP8r2(BigDecimal p8r2) {
        this.p8r2 = p8r2;
    }

    public BigDecimal getP1r3() {
        return p1r3;
    }

    public void setP1r3(BigDecimal p1r3) {
        this.p1r3 = p1r3;
    }

    public BigDecimal getP2r3() {
        return p2r3;
    }

    public void setP2r3(BigDecimal p2r3) {
        this.p2r3 = p2r3;
    }

    public BigDecimal getP3r3() {
        return p3r3;
    }

    public void setP3r3(BigDecimal p3r3) {
        this.p3r3 = p3r3;
    }

    public BigDecimal getP4r3() {
        return p4r3;
    }

    public void setP4r3(BigDecimal p4r3) {
        this.p4r3 = p4r3;
    }

    public BigDecimal getP5r3() {
        return p5r3;
    }

    public void setP5r3(BigDecimal p5r3) {
        this.p5r3 = p5r3;
    }

    public BigDecimal getP6r3() {
        return p6r3;
    }

    public void setP6r3(BigDecimal p6r3) {
        this.p6r3 = p6r3;
    }

    public BigDecimal getP7r3() {
        return p7r3;
    }

    public void setP7r3(BigDecimal p7r3) {
        this.p7r3 = p7r3;
    }

    public BigDecimal getP8r3() {
        return p8r3;
    }

    public void setP8r3(BigDecimal p8r3) {
        this.p8r3 = p8r3;
    }

    public BigDecimal getP1r4() {
        return p1r4;
    }

    public void setP1r4(BigDecimal p1r4) {
        this.p1r4 = p1r4;
    }

    public BigDecimal getP2r4() {
        return p2r4;
    }

    public void setP2r4(BigDecimal p2r4) {
        this.p2r4 = p2r4;
    }

    public BigDecimal getP3r4() {
        return p3r4;
    }

    public void setP3r4(BigDecimal p3r4) {
        this.p3r4 = p3r4;
    }

    public BigDecimal getP4r4() {
        return p4r4;
    }

    public void setP4r4(BigDecimal p4r4) {
        this.p4r4 = p4r4;
    }

    public BigDecimal getP5r4() {
        return p5r4;
    }

    public void setP5r4(BigDecimal p5r4) {
        this.p5r4 = p5r4;
    }

    public BigDecimal getP6r4() {
        return p6r4;
    }

    public void setP6r4(BigDecimal p6r4) {
        this.p6r4 = p6r4;
    }

    public BigDecimal getP7r4() {
        return p7r4;
    }

    public void setP7r4(BigDecimal p7r4) {
        this.p7r4 = p7r4;
    }

    public BigDecimal getP8r4() {
        return p8r4;
    }

    public void setP8r4(BigDecimal p8r4) {
        this.p8r4 = p8r4;
    }

    public BigDecimal getP1r5() {
        return p1r5;
    }

    public void setP1r5(BigDecimal p1r5) {
        this.p1r5 = p1r5;
    }

    public BigDecimal getP2r5() {
        return p2r5;
    }

    public void setP2r5(BigDecimal p2r5) {
        this.p2r5 = p2r5;
    }

    public BigDecimal getP3r5() {
        return p3r5;
    }

    public void setP3r5(BigDecimal p3r5) {
        this.p3r5 = p3r5;
    }

    public BigDecimal getP4r5() {
        return p4r5;
    }

    public void setP4r5(BigDecimal p4r5) {
        this.p4r5 = p4r5;
    }

    public BigDecimal getP5r5() {
        return p5r5;
    }

    public void setP5r5(BigDecimal p5r5) {
        this.p5r5 = p5r5;
    }

    public BigDecimal getP6r5() {
        return p6r5;
    }

    public void setP6r5(BigDecimal p6r5) {
        this.p6r5 = p6r5;
    }

    public BigDecimal getP7r5() {
        return p7r5;
    }

    public void setP7r5(BigDecimal p7r5) {
        this.p7r5 = p7r5;
    }

    public BigDecimal getP8r5() {
        return p8r5;
    }

    public void setP8r5(BigDecimal p8r5) {
        this.p8r5 = p8r5;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getVerifyFlag() {
        return verifyFlag;
    }

    public void setVerifyFlag(String verifyFlag) {
        this.verifyFlag = verifyFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateMachine() {
        return createMachine;
    }

    public void setCreateMachine(String createMachine) {
        this.createMachine = createMachine;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getModiType() {
        return modiType;
    }

    public void setModiType(String modiType) {
        this.modiType = modiType;
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

    public EEngyVerifyVO domain2VO() {
        EEngyVerifyVO eEngyVerifyVO = ReflectUtil.cast(this, EEngyVerifyVO.class);
        return eEngyVerifyVO;
    }

}
