
/**
 * 用户登录日志
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEEventLoginService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EEventLoginVO;

import java.util.List;

public interface IEEventLoginService {

	public int insert(EEventLoginVO eEventLoginVO);

	public int update(EEventLoginVO eEventLoginVO);

	public int delete(EEventLoginVO eEventLoginVO);

	public HttpResult deleteList(List<EEventLoginVO> deleteList) throws Exception;

	public EEventLoginVO findByKey(EEventLoginVO eEventLoginVO);

	public List<EEventLoginVO> findByWhere(EEventLoginVO eEventLoginVO);
}
