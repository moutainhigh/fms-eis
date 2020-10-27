
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPTaskTplService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PTaskTplVO;

import java.util.List;

public interface IPTaskTplService {

	public int insert(PTaskTplVO modelVO);

	public int update(PTaskTplVO modelVO);

	public int delete(PTaskTplVO modelVO);

	public PTaskTplVO findByKey(PTaskTplVO modelVO);

	public List<PTaskTplVO> findByWhere(PTaskTplVO modelVO);
}
