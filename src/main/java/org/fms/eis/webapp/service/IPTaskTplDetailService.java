
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPTaskTplDetailService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PTaskTplDetailVO;

import java.util.List;

public interface IPTaskTplDetailService {

	public int insert(PTaskTplDetailVO modelVO);

	public int update(PTaskTplDetailVO modelVO);

	public int delete(PTaskTplDetailVO modelVO);

	public PTaskTplDetailVO findByKey(PTaskTplDetailVO modelVO);

	public List<PTaskTplDetailVO> findByWhere(PTaskTplDetailVO modelVO);
}
