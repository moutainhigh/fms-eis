
/**
 * 采集任务执行日志表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IRDaTaskLogService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.RDaTaskLogVO;

import java.util.List;

public interface IRDaTaskLogService {

	public int insert(RDaTaskLogVO rDaTaskLogVO);

	public int update(RDaTaskLogVO rDaTaskLogVO);

	public int delete(RDaTaskLogVO rDaTaskLogVO);

	public HttpResult deleteList(List<RDaTaskLogVO> deleteList) throws Exception;

	public RDaTaskLogVO findByKey(RDaTaskLogVO rDaTaskLogVO);

	public List<RDaTaskLogVO> findByWhere(RDaTaskLogVO rDaTaskLogVO);
}
