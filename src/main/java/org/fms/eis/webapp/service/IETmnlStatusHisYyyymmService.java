
/**
 * 终端状态历史信息
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IETmnlStatusHisYyyymmService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.ETmnlStatusHisYyyymmVO;

import java.util.List;

public interface IETmnlStatusHisYyyymmService {

	public int insert(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO);

	public int update(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO);

	public int delete(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO);

	public HttpResult deleteList(List<ETmnlStatusHisYyyymmVO> deleteList) throws Exception;

	public ETmnlStatusHisYyyymmVO findByKey(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO);

	public List<ETmnlStatusHisYyyymmVO> findByWhere(ETmnlStatusHisYyyymmVO eTmnlStatusHisYyyymmVO);
}
