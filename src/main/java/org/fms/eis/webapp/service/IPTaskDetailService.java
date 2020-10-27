
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPTaskDetailService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PTaskDetailVO;

import java.util.List;

public interface IPTaskDetailService {

	public int insert(PTaskDetailVO modelVO);

	public int update(PTaskDetailVO modelVO);

	public int delete(PTaskDetailVO modelVO);

	public PTaskDetailVO findByKey(PTaskDetailVO modelVO);

	public List<PTaskDetailVO> findByWhere(PTaskDetailVO modelVO);
}
