
/**
 * 测量点分钟电量
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpEngyMinYyyymmService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpEngyMinYyyymmVO;

import java.util.List;

public interface IEMpEngyMinYyyymmService {

	public int insert(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO);

	public int update(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO);

	public int delete(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO);

	public HttpResult deleteList(List<EMpEngyMinYyyymmVO> deleteList) throws Exception;

	public EMpEngyMinYyyymmVO findByKey(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO);

	public List<EMpEngyMinYyyymmVO> findByWhere(EMpEngyMinYyyymmVO eMpEngyMinYyyymmVO);
}
