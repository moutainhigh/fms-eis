
/**
 * 终端对时日志表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IRCheckClockLogService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.RCheckClockLogVO;

import java.util.List;

public interface IRCheckClockLogService {

	public int insert(RCheckClockLogVO rCheckClockLogVO);

	public int update(RCheckClockLogVO rCheckClockLogVO);

	public int delete(RCheckClockLogVO rCheckClockLogVO);

	public HttpResult deleteList(List<RCheckClockLogVO> deleteList) throws Exception;

	public RCheckClockLogVO findByKey(RCheckClockLogVO rCheckClockLogVO);

	public List<RCheckClockLogVO> findByWhere(RCheckClockLogVO rCheckClockLogVO);
}
