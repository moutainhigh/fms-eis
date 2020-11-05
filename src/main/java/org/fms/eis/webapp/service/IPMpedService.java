
/**
 * 测量点
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPMpedService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PMpedVO;

import java.util.List;

public interface IPMpedService {

	public int insert(PMpedVO pMpedVO);

	public int update(PMpedVO pMpedVO);

	public int delete(PMpedVO pMpedVO);

	public HttpResult deleteList(List<PMpedVO> deleteList) throws Exception;

	public PMpedVO findByKey(PMpedVO pMpedVO);

	public List<PMpedVO> findByWhere(PMpedVO pMpedVO);

	public int updateList(List<PMpedVO> updateList);
}
