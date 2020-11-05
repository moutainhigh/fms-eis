/**
 * 测量点
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.vo.PMpedVO.java
 *
**/
package org.fms.eis.webapp.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import org.fms.eis.webapp.domain.PMpedDomain;

import java.util.Date;

public class PMpedVO extends ManagerParamVO {

		private Long id;	//测量点标识
		private String code;	//编号
		private String name;	//名称
		private Integer mpedIndex;	//测量点编号
		private Long cpId;	//采集点编号
		private String mpId;	//计量点标识
		private Long meterId;	//电能表标识
		private String mainFlag;	//总表标志
		private Long mMpedId;	//主表编码
		private Long pMpedId;	//母表编码
		private Long eMpedId;	//对端表编码
		private String voltCode;	//电压等级
		private Long consId;	//用户标识
		private Long tgId;	//台区标识
		private Long lineId;	//线路标识
		private Long subsId;	//厂站标识
		private Long tranId;	//变压器编码
		private Long capId;	//电容器编码
		private String businessPlaceCode;	//供电单位
		private String mpedProp;	//测量点属性
		private String mpType;	//测量点类型
		private String sideCode;	//挂表位置
		private Integer switchId;	//开关标识
		private String switchNo;	//开关编号
		private Long meterBoxId;	//所属表箱
		private String measMode;	//计量方式
		private String wiringMode;	//接线方式
		private String statusCode;	//当前状态
		private String voltType;	//电压监测点分类
		private Integer datainterval;	//数据间隔
		private String incrementFlag;	//是否增量
		private Integer calcTplId;	//计算方案模板
		private Integer calcScheme;	//月结算方案
		private String chkTplId;	//考核指标模板
		private String qCalcFlag;	//无功计算方式 
		private String mpCalcMode;	//参与电量考核方式
		private String guid;	//接口标识
		private String dataSrc;	//接口
		private String dataId;	//接口方标识
		private String areaCode;	//区域代码
		private Integer weight;	//显示顺序
		private String mpCalcType;	//测量点参与计算方式
		private Long settleMpedId;	//结算测量点
		private String meterClass;	//计量装置分类
		private Long creatorId;	//创建者
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
			private Date createDate;	//创建时间
		private Long lastModifierId;	//最后修改者
		private String lastModifyTime;	//最后修改时间
		
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
		public Integer getMpedIndex() {
			return mpedIndex;
		}
		public void setMpedIndex(Integer mpedIndex) {
			this.mpedIndex = mpedIndex;
		}
		public Long getCpId() {
			return cpId;
		}
		public void setCpId(Long cpId) {
			this.cpId = cpId;
		}
		public String getMpId() {
			return mpId;
		}
		public void setMpId(String mpId) {
			this.mpId = mpId;
		}
		public Long getMeterId() {
			return meterId;
		}
		public void setMeterId(Long meterId) {
			this.meterId = meterId;
		}
		public String getMainFlag() {
			return mainFlag;
		}
		public void setMainFlag(String mainFlag) {
			this.mainFlag = mainFlag;
		}
		public Long getMMpedId() {
			return mMpedId;
		}
		public void setMMpedId(Long mMpedId) {
			this.mMpedId = mMpedId;
		}
		public Long getPMpedId() {
			return pMpedId;
		}
		public void setPMpedId(Long pMpedId) {
			this.pMpedId = pMpedId;
		}
		public Long getEMpedId() {
			return eMpedId;
		}
		public void setEMpedId(Long eMpedId) {
			this.eMpedId = eMpedId;
		}
		public String getVoltCode() {
			return voltCode;
		}
		public void setVoltCode(String voltCode) {
			this.voltCode = voltCode;
		}
		public Long getConsId() {
			return consId;
		}
		public void setConsId(Long consId) {
			this.consId = consId;
		}
		public Long getTgId() {
			return tgId;
		}
		public void setTgId(Long tgId) {
			this.tgId = tgId;
		}
		public Long getLineId() {
			return lineId;
		}
		public void setLineId(Long lineId) {
			this.lineId = lineId;
		}
		public Long getSubsId() {
			return subsId;
		}
		public void setSubsId(Long subsId) {
			this.subsId = subsId;
		}
		public Long getTranId() {
			return tranId;
		}
		public void setTranId(Long tranId) {
			this.tranId = tranId;
		}
		public Long getCapId() {
			return capId;
		}
		public void setCapId(Long capId) {
			this.capId = capId;
		}
		public String getBusinessPlaceCode() {
			return businessPlaceCode;
		}
		public void setBusinessPlaceCode(String businessPlaceCode) {
			this.businessPlaceCode = businessPlaceCode;
		}
		public String getMpedProp() {
			return mpedProp;
		}
		public void setMpedProp(String mpedProp) {
			this.mpedProp = mpedProp;
		}
		public String getMpType() {
			return mpType;
		}
		public void setMpType(String mpType) {
			this.mpType = mpType;
		}
		public String getSideCode() {
			return sideCode;
		}
		public void setSideCode(String sideCode) {
			this.sideCode = sideCode;
		}
		public Integer getSwitchId() {
			return switchId;
		}
		public void setSwitchId(Integer switchId) {
			this.switchId = switchId;
		}
		public String getSwitchNo() {
			return switchNo;
		}
		public void setSwitchNo(String switchNo) {
			this.switchNo = switchNo;
		}
		public Long getMeterBoxId() {
			return meterBoxId;
		}
		public void setMeterBoxId(Long meterBoxId) {
			this.meterBoxId = meterBoxId;
		}
		public String getMeasMode() {
			return measMode;
		}
		public void setMeasMode(String measMode) {
			this.measMode = measMode;
		}
		public String getWiringMode() {
			return wiringMode;
		}
		public void setWiringMode(String wiringMode) {
			this.wiringMode = wiringMode;
		}
		public String getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}
		public String getVoltType() {
			return voltType;
		}
		public void setVoltType(String voltType) {
			this.voltType = voltType;
		}
		public Integer getDatainterval() {
			return datainterval;
		}
		public void setDatainterval(Integer datainterval) {
			this.datainterval = datainterval;
		}
		public String getIncrementFlag() {
			return incrementFlag;
		}
		public void setIncrementFlag(String incrementFlag) {
			this.incrementFlag = incrementFlag;
		}
		public Integer getCalcTplId() {
			return calcTplId;
		}
		public void setCalcTplId(Integer calcTplId) {
			this.calcTplId = calcTplId;
		}
		public Integer getCalcScheme() {
			return calcScheme;
		}
		public void setCalcScheme(Integer calcScheme) {
			this.calcScheme = calcScheme;
		}
		public String getChkTplId() {
			return chkTplId;
		}
		public void setChkTplId(String chkTplId) {
			this.chkTplId = chkTplId;
		}
		public String getQCalcFlag() {
			return qCalcFlag;
		}
		public void setQCalcFlag(String qCalcFlag) {
			this.qCalcFlag = qCalcFlag;
		}
		public String getMpCalcMode() {
			return mpCalcMode;
		}
		public void setMpCalcMode(String mpCalcMode) {
			this.mpCalcMode = mpCalcMode;
		}
		public String getGuid() {
			return guid;
		}
		public void setGuid(String guid) {
			this.guid = guid;
		}
		public String getDataSrc() {
			return dataSrc;
		}
		public void setDataSrc(String dataSrc) {
			this.dataSrc = dataSrc;
		}
		public String getDataId() {
			return dataId;
		}
		public void setDataId(String dataId) {
			this.dataId = dataId;
		}
		public String getAreaCode() {
			return areaCode;
		}
		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}
		public Integer getWeight() {
			return weight;
		}
		public void setWeight(Integer weight) {
			this.weight = weight;
		}
		public String getMpCalcType() {
			return mpCalcType;
		}
		public void setMpCalcType(String mpCalcType) {
			this.mpCalcType = mpCalcType;
		}
		public Long getSettleMpedId() {
			return settleMpedId;
		}
		public void setSettleMpedId(Long settleMpedId) {
			this.settleMpedId = settleMpedId;
		}
		public String getMeterClass() {
			return meterClass;
		}
		public void setMeterClass(String meterClass) {
			this.meterClass = meterClass;
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
	

	public PMpedDomain vo2Domain() {
        PMpedDomain pMpedDomain = ReflectUtil.cast(this, PMpedDomain.class);
        return pMpedDomain;
	}
}
