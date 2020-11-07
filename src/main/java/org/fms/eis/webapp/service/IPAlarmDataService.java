
/**
 * 告警范围
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPAlarmDataService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PAlarmDataVO;

import java.util.List;

public interface IPAlarmDataService {

	public int insert(PAlarmDataVO pAlarmDataVO);

	public int update(PAlarmDataVO pAlarmDataVO);

	public int delete(PAlarmDataVO pAlarmDataVO);

	public HttpResult deleteList(List<PAlarmDataVO> deleteList) throws Exception;

	public PAlarmDataVO findByKey(PAlarmDataVO pAlarmDataVO);

	public List<PAlarmDataVO> findByWhere(PAlarmDataVO pAlarmDataVO);
}
