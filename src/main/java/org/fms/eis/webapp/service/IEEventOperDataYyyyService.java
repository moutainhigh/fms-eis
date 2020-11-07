
/**
 * 用户操作明细
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEEventOperDataYyyyService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EEventOperDataYyyyVO;

import java.util.List;

public interface IEEventOperDataYyyyService {

	public int insert(EEventOperDataYyyyVO eEventOperDataYyyyVO);

	public int update(EEventOperDataYyyyVO eEventOperDataYyyyVO);

	public int delete(EEventOperDataYyyyVO eEventOperDataYyyyVO);

	public HttpResult deleteList(List<EEventOperDataYyyyVO> deleteList) throws Exception;

	public EEventOperDataYyyyVO findByKey(EEventOperDataYyyyVO eEventOperDataYyyyVO);

	public List<EEventOperDataYyyyVO> findByWhere(EEventOperDataYyyyVO eEventOperDataYyyyVO);
}
