/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:32
 * Title : org.fms.eis.webapp.domain.TestDomain.java
 **/
package org.fms.eis.webapp.domain;

import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.mybatis.MybatisEntity;
import com.riozenc.titanTool.mybatis.pagination.Page;
import org.fms.eis.webapp.vo.DropSqlVO;

import java.util.Date;

public class DropSqlDomain extends Page implements MybatisEntity {
    @TablePrimaryKey
    private Integer id;    //
    private String dropCode;    //
    private String dropName;    //
    private String dropSql;    //
    private String dropType;    //
    private String remark;    //
    private String status;    //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDropCode() {
        return dropCode;
    }

    public void setDropCode(String dropCode) {
        this.dropCode = dropCode;
    }

    public String getDropName() {
        return dropName;
    }

    public void setDropName(String dropName) {
        this.dropName = dropName;
    }

    public String getDropSql() {
        return dropSql;
    }

    public void setDropSql(String dropSql) {
        this.dropSql = dropSql;
    }

    public String getDropType() {
        return dropType;
    }

    public void setDropType(String dropType) {
        this.dropType = dropType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DropSqlVO domain2VO() {
        DropSqlVO testVO = new DropSqlVO();
        testVO.setId(this.id);
        testVO.setDropCode(this.dropCode);
        testVO.setDropName(this.dropName);
        testVO.setDropSql(this.dropSql);
        testVO.setDropType(this.dropType);
        testVO.setRemark(this.remark);
        testVO.setStatus(this.status);
        return testVO;
    }

}
