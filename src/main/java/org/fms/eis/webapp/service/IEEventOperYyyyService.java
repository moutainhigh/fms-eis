
/**
 * 用户操作日志
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEEventOperYyyyService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EEventOperYyyyVO;

import java.util.List;

public interface IEEventOperYyyyService {

	public int insert(EEventOperYyyyVO eEventOperYyyyVO);

	public int update(EEventOperYyyyVO eEventOperYyyyVO);

	public int delete(EEventOperYyyyVO eEventOperYyyyVO);

	public HttpResult deleteList(List<EEventOperYyyyVO> deleteList) throws Exception;

	public EEventOperYyyyVO findByKey(EEventOperYyyyVO eEventOperYyyyVO);

	public List<EEventOperYyyyVO> findByWhere(EEventOperYyyyVO eEventOperYyyyVO);
}
