
/**
 * 测量点日冻结需量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IEMpXlDay2020Service.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpXlDay2020VO;

import java.util.List;

public interface IEMpXlDay2020Service {

	public int insert(EMpXlDay2020VO eMpXlDay2020VO);

	public int update(EMpXlDay2020VO eMpXlDay2020VO);

	public int delete(EMpXlDay2020VO eMpXlDay2020VO);

	public HttpResult deleteList(List<EMpXlDay2020VO> deleteList) throws Exception;

	public EMpXlDay2020VO findByKey(EMpXlDay2020VO eMpXlDay2020VO);

	public List<EMpXlDay2020VO> findByWhere(EMpXlDay2020VO eMpXlDay2020VO);
}
