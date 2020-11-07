
/**
 * 追加电量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpAppendService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpAppendVO;

import java.util.List;

public interface IEMpAppendService {

	public int insert(EMpAppendVO eMpAppendVO);

	public int update(EMpAppendVO eMpAppendVO);

	public int delete(EMpAppendVO eMpAppendVO);

	public HttpResult deleteList(List<EMpAppendVO> deleteList) throws Exception;

	public EMpAppendVO findByKey(EMpAppendVO eMpAppendVO);

	public List<EMpAppendVO> findByWhere(EMpAppendVO eMpAppendVO);
}
