
/**
 * 电力计划表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEPlanYyyyService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EPlanYyyyVO;

import java.util.List;

public interface IEPlanYyyyService {

	public int insert(EPlanYyyyVO ePlanYyyyVO);

	public int update(EPlanYyyyVO ePlanYyyyVO);

	public int delete(EPlanYyyyVO ePlanYyyyVO);

	public HttpResult deleteList(List<EPlanYyyyVO> deleteList) throws Exception;

	public EPlanYyyyVO findByKey(EPlanYyyyVO ePlanYyyyVO);

	public List<EPlanYyyyVO> findByWhere(EPlanYyyyVO ePlanYyyyVO);
}
