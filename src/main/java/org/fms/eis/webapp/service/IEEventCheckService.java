
/**
 * 异常检测事件
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEEventCheckService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EEventCheckVO;

import java.util.List;

public interface IEEventCheckService {

	public int insert(EEventCheckVO eEventCheckVO);

	public int update(EEventCheckVO eEventCheckVO);

	public int delete(EEventCheckVO eEventCheckVO);

	public HttpResult deleteList(List<EEventCheckVO> deleteList) throws Exception;

	public EEventCheckVO findByKey(EEventCheckVO eEventCheckVO);

	public List<EEventCheckVO> findByWhere(EEventCheckVO eEventCheckVO);
}
