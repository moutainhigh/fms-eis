
/**
 * 电能示值回收表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEBmRollbackService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EBmRollbackVO;

import java.util.List;

public interface IEBmRollbackService {

	public int insert(EBmRollbackVO eBmRollbackVO);

	public int update(EBmRollbackVO eBmRollbackVO);

	public int delete(EBmRollbackVO eBmRollbackVO);

	public HttpResult deleteList(List<EBmRollbackVO> deleteList) throws Exception;

	public EBmRollbackVO findByKey(EBmRollbackVO eBmRollbackVO);

	public List<EBmRollbackVO> findByWhere(EBmRollbackVO eBmRollbackVO);
}
