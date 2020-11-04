
/**
 * 测量点日电量
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpEngyDay2020Service.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpEngyDay2020VO;

import java.util.List;

public interface IEMpEngyDay2020Service {

	public int insert(EMpEngyDay2020VO eMpEngyDay2020VO);

	public int update(EMpEngyDay2020VO eMpEngyDay2020VO);

	public int delete(EMpEngyDay2020VO eMpEngyDay2020VO);

	public HttpResult deleteList(List<EMpEngyDay2020VO> deleteList) throws Exception;

	public EMpEngyDay2020VO findByKey(EMpEngyDay2020VO eMpEngyDay2020VO);

	public List<EMpEngyDay2020VO> findByWhere(EMpEngyDay2020VO eMpEngyDay2020VO);
}
