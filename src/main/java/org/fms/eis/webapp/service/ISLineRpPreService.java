
/**
 * 旁路事件审核表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.ISLineRpPreService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.SLineRpPreVO;

import java.util.List;

public interface ISLineRpPreService {

	public int insert(SLineRpPreVO sLineRpPreVO);

	public int update(SLineRpPreVO sLineRpPreVO);

	public int delete(SLineRpPreVO sLineRpPreVO);

	public HttpResult deleteList(List<SLineRpPreVO> deleteList) throws Exception;

	public SLineRpPreVO findByKey(SLineRpPreVO sLineRpPreVO);

	public List<SLineRpPreVO> findByWhere(SLineRpPreVO sLineRpPreVO);
}
