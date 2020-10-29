/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:32
 * Title : org.fms.eis.webapp.domain.TestDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.RCpVO;

import java.util.Date;

public class RCpDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long id;    //编码(本实体记录的唯一标识)
    private String code;    //采集点编号
    private String name;    //采集点名称(具体的采集点名称，当一户一套采集装置时，可以使用户名。)
    private String cpTypeCode;    //采集点类型
    private String statusCode;    //采集点状态
    private String cpAddr;    //采集点地址码
    private String gpsLongitude;    //GPS经度
    private String gpsLatitude;    //GPS纬度
    private String businessPlaceCode;    //管理单位
    private String tplId;    //采集任务模板标识
    private String terminalId;    //运行终端标识
    private String relaObjType;    //所属对象类型
    private String relaObjId;    //所属对象标示
    private String cFlag;    //是否采集
    private String terminalAddr;    //终端地址码
    private Long protocolId;    //规约类型
    private Long ctrlHostid;    //采集主机
    private Long masterChnlGroup;    //主通道组
    private String masterIpPort;    //主用IP地址
    private String masterTel;    //主电话
    private Long spareChnlGroup;    //备通道组
    private String spareIpPort;    //备用IP地址
    private String spareTel;    //备电话
    private String gprsCode;    //GPRS号码
    private Integer heartbeatCycle;    //心跳周期
    private String algNo;    //算法编号
    private String algKey;    //算法密钥
    private String areaCode;    //行政区划
    private Long masterid;    //主站编码
    private String guid;    //GUID
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpTypeCode() {
        return cpTypeCode;
    }

    public void setCpTypeCode(String cpTypeCode) {
        this.cpTypeCode = cpTypeCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getCpAddr() {
        return cpAddr;
    }

    public void setCpAddr(String cpAddr) {
        this.cpAddr = cpAddr;
    }

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public String getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    public void setBusinessPlaceCode(String businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode;
    }

    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getRelaObjType() {
        return relaObjType;
    }

    public void setRelaObjType(String relaObjType) {
        this.relaObjType = relaObjType;
    }

    public String getRelaObjId() {
        return relaObjId;
    }

    public void setRelaObjId(String relaObjId) {
        this.relaObjId = relaObjId;
    }

    public String getCFlag() {
        return cFlag;
    }

    public void setCFlag(String cFlag) {
        this.cFlag = cFlag;
    }

    public String getTerminalAddr() {
        return terminalAddr;
    }

    public void setTerminalAddr(String terminalAddr) {
        this.terminalAddr = terminalAddr;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public Long getCtrlHostid() {
        return ctrlHostid;
    }

    public void setCtrlHostid(Long ctrlHostid) {
        this.ctrlHostid = ctrlHostid;
    }

    public Long getMasterChnlGroup() {
        return masterChnlGroup;
    }

    public void setMasterChnlGroup(Long masterChnlGroup) {
        this.masterChnlGroup = masterChnlGroup;
    }

    public String getMasterIpPort() {
        return masterIpPort;
    }

    public void setMasterIpPort(String masterIpPort) {
        this.masterIpPort = masterIpPort;
    }

    public String getMasterTel() {
        return masterTel;
    }

    public void setMasterTel(String masterTel) {
        this.masterTel = masterTel;
    }

    public Long getSpareChnlGroup() {
        return spareChnlGroup;
    }

    public void setSpareChnlGroup(Long spareChnlGroup) {
        this.spareChnlGroup = spareChnlGroup;
    }

    public String getSpareIpPort() {
        return spareIpPort;
    }

    public void setSpareIpPort(String spareIpPort) {
        this.spareIpPort = spareIpPort;
    }

    public String getSpareTel() {
        return spareTel;
    }

    public void setSpareTel(String spareTel) {
        this.spareTel = spareTel;
    }

    public String getGprsCode() {
        return gprsCode;
    }

    public void setGprsCode(String gprsCode) {
        this.gprsCode = gprsCode;
    }

    public Integer getHeartbeatCycle() {
        return heartbeatCycle;
    }

    public void setHeartbeatCycle(Integer heartbeatCycle) {
        this.heartbeatCycle = heartbeatCycle;
    }

    public String getAlgNo() {
        return algNo;
    }

    public void setAlgNo(String algNo) {
        this.algNo = algNo;
    }

    public String getAlgKey() {
        return algKey;
    }

    public void setAlgKey(String algKey) {
        this.algKey = algKey;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Long getMasterid() {
        return masterid;
    }

    public void setMasterid(Long masterid) {
        this.masterid = masterid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public RCpVO domain2VO() {
        RCpVO testVO = new RCpVO();
        testVO.setId(this.id);
        testVO.setCode(this.code);
        testVO.setName(this.name);
        testVO.setCpTypeCode(this.cpTypeCode);
        testVO.setStatusCode(this.statusCode);
        testVO.setCpAddr(this.cpAddr);
        testVO.setGpsLongitude(this.gpsLongitude);
        testVO.setGpsLatitude(this.gpsLatitude);
        testVO.setBusinessPlaceCode(this.businessPlaceCode);
        testVO.setTplId(this.tplId);
        testVO.setTerminalId(this.terminalId);
        testVO.setRelaObjType(this.relaObjType);
        testVO.setRelaObjId(this.relaObjId);
        testVO.setCFlag(this.cFlag);
        testVO.setTerminalAddr(this.terminalAddr);
        testVO.setProtocolId(this.protocolId);
        testVO.setCtrlHostid(this.ctrlHostid);
        testVO.setMasterChnlGroup(this.masterChnlGroup);
        testVO.setMasterIpPort(this.masterIpPort);
        testVO.setMasterTel(this.masterTel);
        testVO.setSpareChnlGroup(this.spareChnlGroup);
        testVO.setSpareIpPort(this.spareIpPort);
        testVO.setSpareTel(this.spareTel);
        testVO.setGprsCode(this.gprsCode);
        testVO.setHeartbeatCycle(this.heartbeatCycle);
        testVO.setAlgNo(this.algNo);
        testVO.setAlgKey(this.algKey);
        testVO.setAreaCode(this.areaCode);
        testVO.setMasterid(this.masterid);
        testVO.setGuid(this.guid);
        testVO.setCreatorId(this.creatorId);
        testVO.setCreateDate(this.createDate);
        testVO.setLastModifierId(this.lastModifierId);
        testVO.setLastModifyTime(this.lastModifyTime);
        return testVO;
    }

}
