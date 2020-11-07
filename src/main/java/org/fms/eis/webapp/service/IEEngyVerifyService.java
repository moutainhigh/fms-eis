
/**
 * 表码电量审核
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEEngyVerifyService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EEngyVerifyVO;

import java.util.List;

public interface IEEngyVerifyService {

	public int insert(EEngyVerifyVO eEngyVerifyVO);

	public int update(EEngyVerifyVO eEngyVerifyVO);

	public int delete(EEngyVerifyVO eEngyVerifyVO);

	public HttpResult deleteList(List<EEngyVerifyVO> deleteList) throws Exception;

	public EEngyVerifyVO findByKey(EEngyVerifyVO eEngyVerifyVO);

	public List<EEngyVerifyVO> findByWhere(EEngyVerifyVO eEngyVerifyVO);
}
