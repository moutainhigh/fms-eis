
/**
 * 测量点电能示值曲线
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpBmCurveYyyymmService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpBmCurveYyyymmVO;

import java.util.List;

public interface IEMpBmCurveYyyymmService {

	public int insert(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO);

	public int update(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO);

	public int delete(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO);

	public HttpResult deleteList(List<EMpBmCurveYyyymmVO> deleteList) throws Exception;

	public EMpBmCurveYyyymmVO findByKey(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO);

	public List<EMpBmCurveYyyymmVO> findByWhere(EMpBmCurveYyyymmVO eMpBmCurveYyyymmVO);
}
