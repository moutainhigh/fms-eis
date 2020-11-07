
/**
 * 人工任务执行日志表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IRDaManualTaskLogService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.RDaManualTaskLogVO;

import java.util.List;

public interface IRDaManualTaskLogService {

	public int insert(RDaManualTaskLogVO rDaManualTaskLogVO);

	public int update(RDaManualTaskLogVO rDaManualTaskLogVO);

	public int delete(RDaManualTaskLogVO rDaManualTaskLogVO);

	public HttpResult deleteList(List<RDaManualTaskLogVO> deleteList) throws Exception;

	public RDaManualTaskLogVO findByKey(RDaManualTaskLogVO rDaManualTaskLogVO);

	public List<RDaManualTaskLogVO> findByWhere(RDaManualTaskLogVO rDaManualTaskLogVO);
}
