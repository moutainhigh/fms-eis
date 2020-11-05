
/**
 * 
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPMeterModelService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PMeterModelVO;

import java.util.List;

public interface IPMeterModelService {

	public int insert(PMeterModelVO pMeterModelVO);

	public int update(PMeterModelVO pMeterModelVO);

	public int delete(PMeterModelVO pMeterModelVO);

	public HttpResult deleteList(List<PMeterModelVO> deleteList) throws Exception;

	public PMeterModelVO findByKey(PMeterModelVO pMeterModelVO);

	public List<PMeterModelVO> findByWhere(PMeterModelVO pMeterModelVO);
}
