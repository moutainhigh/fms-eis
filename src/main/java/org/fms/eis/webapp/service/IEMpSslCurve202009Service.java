
/**
 * 测量点瞬时量曲线表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpSslCurve202009Service.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpSslCurve202009VO;

import java.util.List;

public interface IEMpSslCurve202009Service {

	public int insert(EMpSslCurve202009VO eMpSslCurve202009VO);

	public int update(EMpSslCurve202009VO eMpSslCurve202009VO);

	public int delete(EMpSslCurve202009VO eMpSslCurve202009VO);

	public HttpResult deleteList(List<EMpSslCurve202009VO> deleteList) throws Exception;

	public EMpSslCurve202009VO findByKey(EMpSslCurve202009VO eMpSslCurve202009VO);

	public List<EMpSslCurve202009VO> findByWhere(EMpSslCurve202009VO eMpSslCurve202009VO);
}
