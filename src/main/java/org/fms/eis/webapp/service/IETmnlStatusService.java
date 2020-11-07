
/**
 * 终端状态信息
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IETmnlStatusService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.ETmnlStatusVO;

import java.util.List;

public interface IETmnlStatusService {

	public int insert(ETmnlStatusVO eTmnlStatusVO);

	public int update(ETmnlStatusVO eTmnlStatusVO);

	public int delete(ETmnlStatusVO eTmnlStatusVO);

	public HttpResult deleteList(List<ETmnlStatusVO> deleteList) throws Exception;

	public ETmnlStatusVO findByKey(ETmnlStatusVO eTmnlStatusVO);

	public List<ETmnlStatusVO> findByWhere(ETmnlStatusVO eTmnlStatusVO);
}
