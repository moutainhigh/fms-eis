
/**
 * 测量点日冻结需量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IEMpXlDayYyyyService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpXlDayYyyyVO;

import java.util.List;

public interface IEMpXlDayYyyyService {

    public int insert(EMpXlDayYyyyVO eMpXlDayYyyyVO);

    public int update(EMpXlDayYyyyVO eMpXlDayYyyyVO);

    public int delete(EMpXlDayYyyyVO eMpXlDayYyyyVO);

    public HttpResult deleteList(List<EMpXlDayYyyyVO> deleteList) throws Exception;

    public EMpXlDayYyyyVO findByKey(EMpXlDayYyyyVO eMpXlDayYyyyVO);

    public List<EMpXlDayYyyyVO> findByWhere(EMpXlDayYyyyVO eMpXlDayYyyyVO);
}
