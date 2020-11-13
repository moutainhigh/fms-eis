
/**
 * 测量点日冻结电能示值
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpBmDayYyyyService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpBmDayYyyyVO;

import java.util.List;

public interface IEMpBmDayYyyyService {

	public int insert(EMpBmDayYyyyVO eMpBmDayYyyyVO);

	public int update(EMpBmDayYyyyVO eMpBmDayYyyyVO);

	public int delete(EMpBmDayYyyyVO eMpBmDayYyyyVO);

	public HttpResult deleteList(List<EMpBmDayYyyyVO> deleteList) throws Exception;

	public EMpBmDayYyyyVO findByKey(EMpBmDayYyyyVO eMpBmDayYyyyVO);

	public List<EMpBmDayYyyyVO> findByWhere(EMpBmDayYyyyVO eMpBmDayYyyyVO);
}
