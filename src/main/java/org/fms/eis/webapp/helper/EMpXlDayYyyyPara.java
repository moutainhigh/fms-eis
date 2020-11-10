package org.fms.eis.webapp.helper;

import org.fms.eis.webapp.vo.ManagerParamVO;

import javax.xml.crypto.Data;

public class EMpXlDayYyyyPara extends ManagerParamVO {

    private Data startDate;
    private Data endDate;

    public Data getStartDate() {
        return startDate;
    }

    public void setStartDate(Data startDate) {
        this.startDate = startDate;
    }

    public Data getEndDate() {
        return endDate;
    }

    public void setEndDate(Data endDate) {
        this.endDate = endDate;
    }
}
