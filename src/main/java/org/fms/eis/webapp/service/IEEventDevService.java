
/**
 * 主站设备事件
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEEventDevService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EEventDevVO;

import java.util.List;

public interface IEEventDevService {

	public int insert(EEventDevVO eEventDevVO);

	public int update(EEventDevVO eEventDevVO);

	public int delete(EEventDevVO eEventDevVO);

	public HttpResult deleteList(List<EEventDevVO> deleteList) throws Exception;

	public EEventDevVO findByKey(EEventDevVO eEventDevVO);

	public List<EEventDevVO> findByWhere(EEventDevVO eEventDevVO);
}
