
/**
 * 测量点月冻结电能示值
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpBmMonService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpBmMonVO;

import java.util.List;

public interface IEMpBmMonService {

	public int insert(EMpBmMonVO eMpBmMonVO);

	public int update(EMpBmMonVO eMpBmMonVO);

	public int delete(EMpBmMonVO eMpBmMonVO);

	public HttpResult deleteList(List<EMpBmMonVO> deleteList) throws Exception;

	public EMpBmMonVO findByKey(EMpBmMonVO eMpBmMonVO);

	public List<EMpBmMonVO> findByWhere(EMpBmMonVO eMpBmMonVO);
}
