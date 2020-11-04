
/**
 * 测量点分钟电量
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpEngyMin202009Service.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpEngyMin202009VO;

import java.util.List;

public interface IEMpEngyMin202009Service {

	public int insert(EMpEngyMin202009VO eMpEngyMin202009VO);

	public int update(EMpEngyMin202009VO eMpEngyMin202009VO);

	public int delete(EMpEngyMin202009VO eMpEngyMin202009VO);

	public HttpResult deleteList(List<EMpEngyMin202009VO> deleteList) throws Exception;

	public EMpEngyMin202009VO findByKey(EMpEngyMin202009VO eMpEngyMin202009VO);

	public List<EMpEngyMin202009VO> findByWhere(EMpEngyMin202009VO eMpEngyMin202009VO);
}
