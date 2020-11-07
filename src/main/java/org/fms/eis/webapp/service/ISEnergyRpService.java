
/**
 * 电量替代
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.ISEnergyRpService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.SEnergyRpVO;

import java.util.List;

public interface ISEnergyRpService {

	public int insert(SEnergyRpVO sEnergyRpVO);

	public int update(SEnergyRpVO sEnergyRpVO);

	public int delete(SEnergyRpVO sEnergyRpVO);

	public HttpResult deleteList(List<SEnergyRpVO> deleteList) throws Exception;

	public SEnergyRpVO findByKey(SEnergyRpVO sEnergyRpVO);

	public List<SEnergyRpVO> findByWhere(SEnergyRpVO sEnergyRpVO);
}
