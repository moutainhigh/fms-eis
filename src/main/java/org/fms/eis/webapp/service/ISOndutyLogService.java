
/**
 * 值班日志
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.ISOndutyLogService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.SOndutyLogVO;

import java.util.List;

public interface ISOndutyLogService {

	public int insert(SOndutyLogVO sOndutyLogVO);

	public int update(SOndutyLogVO sOndutyLogVO);

	public int delete(SOndutyLogVO sOndutyLogVO);

	public HttpResult deleteList(List<SOndutyLogVO> deleteList) throws Exception;

	public SOndutyLogVO findByKey(SOndutyLogVO sOndutyLogVO);

	public List<SOndutyLogVO> findByWhere(SOndutyLogVO sOndutyLogVO);
}
