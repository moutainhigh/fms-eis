
/**
 * 测量点瞬时量曲线表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpSslCurveYyyymmService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpSslCurveYyyymmVO;

import java.util.List;

public interface IEMpSslCurveYyyymmService {

	public int insert(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO);

	public int update(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO);

	public int delete(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO);

	public HttpResult deleteList(List<EMpSslCurveYyyymmVO> deleteList) throws Exception;

	public EMpSslCurveYyyymmVO findByKey(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO);

	public List<EMpSslCurveYyyymmVO> findByWhere(EMpSslCurveYyyymmVO eMpSslCurveYyyymmVO);
}
