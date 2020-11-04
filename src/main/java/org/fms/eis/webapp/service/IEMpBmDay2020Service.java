
/**
 * 测量点日冻结电能示值
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpBmDay2020Service.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpBmDay2020VO;

import java.util.List;

public interface IEMpBmDay2020Service {

	public int insert(EMpBmDay2020VO eMpBmDay2020VO);

	public int update(EMpBmDay2020VO eMpBmDay2020VO);

	public int delete(EMpBmDay2020VO eMpBmDay2020VO);

	public HttpResult deleteList(List<EMpBmDay2020VO> deleteList) throws Exception;

	public EMpBmDay2020VO findByKey(EMpBmDay2020VO eMpBmDay2020VO);

	public List<EMpBmDay2020VO> findByWhere(EMpBmDay2020VO eMpBmDay2020VO);
}
