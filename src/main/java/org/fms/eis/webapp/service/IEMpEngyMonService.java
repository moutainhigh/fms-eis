
/**
 * 测量点月电量
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpEngyMonService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpEngyMonVO;

import java.util.List;

public interface IEMpEngyMonService {

	public int insert(EMpEngyMonVO eMpEngyMonVO);

	public int update(EMpEngyMonVO eMpEngyMonVO);

	public int delete(EMpEngyMonVO eMpEngyMonVO);

	public HttpResult deleteList(List<EMpEngyMonVO> deleteList) throws Exception;

	public EMpEngyMonVO findByKey(EMpEngyMonVO eMpEngyMonVO);

	public List<EMpEngyMonVO> findByWhere(EMpEngyMonVO eMpEngyMonVO);
}
