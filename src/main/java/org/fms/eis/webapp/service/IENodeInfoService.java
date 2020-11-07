
/**
 * 系统节点运行信息
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IENodeInfoService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.ENodeInfoVO;

import java.util.List;

public interface IENodeInfoService {

	public int insert(ENodeInfoVO eNodeInfoVO);

	public int update(ENodeInfoVO eNodeInfoVO);

	public int delete(ENodeInfoVO eNodeInfoVO);

	public HttpResult deleteList(List<ENodeInfoVO> deleteList) throws Exception;

	public ENodeInfoVO findByKey(ENodeInfoVO eNodeInfoVO);

	public List<ENodeInfoVO> findByWhere(ENodeInfoVO eNodeInfoVO);
}
