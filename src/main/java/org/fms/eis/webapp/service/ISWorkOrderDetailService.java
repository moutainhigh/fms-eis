
/**
 * 异常工单明细
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.ISWorkOrderDetailService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.SWorkOrderDetailVO;

import java.util.List;

public interface ISWorkOrderDetailService {

	public int insert(SWorkOrderDetailVO sWorkOrderDetailVO);

	public int update(SWorkOrderDetailVO sWorkOrderDetailVO);

	public int delete(SWorkOrderDetailVO sWorkOrderDetailVO);

	public HttpResult deleteList(List<SWorkOrderDetailVO> deleteList) throws Exception;

	public SWorkOrderDetailVO findByKey(SWorkOrderDetailVO sWorkOrderDetailVO);

	public List<SWorkOrderDetailVO> findByWhere(SWorkOrderDetailVO sWorkOrderDetailVO);
}
