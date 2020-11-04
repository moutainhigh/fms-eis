
/**
 * 测量点电能示值曲线
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpBmCurve202009Service.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpBmCurve202009VO;

import java.util.List;

public interface IEMpBmCurve202009Service {

	public int insert(EMpBmCurve202009VO eMpBmCurve202009VO);

	public int update(EMpBmCurve202009VO eMpBmCurve202009VO);

	public int delete(EMpBmCurve202009VO eMpBmCurve202009VO);

	public HttpResult deleteList(List<EMpBmCurve202009VO> deleteList) throws Exception;

	public EMpBmCurve202009VO findByKey(EMpBmCurve202009VO eMpBmCurve202009VO);

	public List<EMpBmCurve202009VO> findByWhere(EMpBmCurve202009VO eMpBmCurve202009VO);
}
