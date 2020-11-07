/**
 * 用户操作日志
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.domain.EEventOperYyyyDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.common.reflect.ReflectUtil;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.EEventOperYyyyVO;

import java.util.Date;
import java.math.BigDecimal;

public class EEventOperYyyyDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Long logId;    //日志标识
    private String sysUserName;    //用户名
    private String userName;    //用户姓名
    private String loginIp;    //IP地址
    private Date logTime;    //日志时间
    private String objId;    //操作对象标识
    private String objType;    //操作对象类型
    private String objName;    //操作对象名称
    private String operType;    //操作类型 操作类型，包括1、增加；2、删除；3、修改；4、上招；5、下发；
    private String operProp;    //操作功能分类 1、档案2、终端参数3、数据4、控制命令
    private String menuId;    //功能项
    private String undoFlag;    //是否可撤销
    private String content;    //操作内容
    private Long creatorId;    //创建者
    private Date createDate;    //创建时间
    private Long lastModifierId;    //最后修改者
    private String lastModifyTime;    //最后修改时间

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getOperProp() {
        return operProp;
    }

    public void setOperProp(String operProp) {
        this.operProp = operProp;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getUndoFlag() {
        return undoFlag;
    }

    public void setUndoFlag(String undoFlag) {
        this.undoFlag = undoFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public EEventOperYyyyVO domain2VO() {
        EEventOperYyyyVO eEventOperYyyyVO = ReflectUtil.cast(this, EEventOperYyyyVO.class);
        return eEventOperYyyyVO;
    }

}
