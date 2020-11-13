
/**
 * 测量点日电量
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpEngyDayYyyyService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpEngyDayYyyyVO;

import java.util.List;

public interface IEMpEngyDayYyyyService {

	public int insert(EMpEngyDayYyyyVO eMpEngyDayYyyyVO);

	public int update(EMpEngyDayYyyyVO eMpEngyDayYyyyVO);

	public int delete(EMpEngyDayYyyyVO eMpEngyDayYyyyVO);

	public HttpResult deleteList(List<EMpEngyDayYyyyVO> deleteList) throws Exception;

	public EMpEngyDayYyyyVO findByKey(EMpEngyDayYyyyVO eMpEngyDayYyyyVO);

	public List<EMpEngyDayYyyyVO> findByWhere(EMpEngyDayYyyyVO eMpEngyDayYyyyVO);
}
