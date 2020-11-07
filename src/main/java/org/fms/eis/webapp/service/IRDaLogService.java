
/**
 * 采集日志表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IRDaLogService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.RDaLogVO;

import java.util.List;

public interface IRDaLogService {

	public int insert(RDaLogVO rDaLogVO);

	public int update(RDaLogVO rDaLogVO);

	public int delete(RDaLogVO rDaLogVO);

	public HttpResult deleteList(List<RDaLogVO> deleteList) throws Exception;

	public RDaLogVO findByKey(RDaLogVO rDaLogVO);

	public List<RDaLogVO> findByWhere(RDaLogVO rDaLogVO);
}
