
/**
 * 计量业务触发表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IRWorkTriggerService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.RWorkTriggerVO;

import java.util.List;

public interface IRWorkTriggerService {

	public int insert(RWorkTriggerVO rWorkTriggerVO);

	public int update(RWorkTriggerVO rWorkTriggerVO);

	public int delete(RWorkTriggerVO rWorkTriggerVO);

	public HttpResult deleteList(List<RWorkTriggerVO> deleteList) throws Exception;

	public RWorkTriggerVO findByKey(RWorkTriggerVO rWorkTriggerVO);

	public List<RWorkTriggerVO> findByWhere(RWorkTriggerVO rWorkTriggerVO);
}
