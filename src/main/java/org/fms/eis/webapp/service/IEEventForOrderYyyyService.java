
/**
 * 工单相关异常事件
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEEventForOrderYyyyService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EEventForOrderYyyyVO;

import java.util.List;

public interface IEEventForOrderYyyyService {

	public int insert(EEventForOrderYyyyVO eEventForOrderYyyyVO);

	public int update(EEventForOrderYyyyVO eEventForOrderYyyyVO);

	public int delete(EEventForOrderYyyyVO eEventForOrderYyyyVO);

	public HttpResult deleteList(List<EEventForOrderYyyyVO> deleteList) throws Exception;

	public EEventForOrderYyyyVO findByKey(EEventForOrderYyyyVO eEventForOrderYyyyVO);

	public List<EEventForOrderYyyyVO> findByWhere(EEventForOrderYyyyVO eEventForOrderYyyyVO);
}
