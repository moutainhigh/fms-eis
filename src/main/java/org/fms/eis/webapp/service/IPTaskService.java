
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPTaskService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PTaskVO;

import java.util.List;

public interface IPTaskService {

	public int insert(PTaskVO modelVO);

	public int update(PTaskVO modelVO);

	public int delete(PTaskVO modelVO);

	public PTaskVO findByKey(PTaskVO modelVO);

	public List<PTaskVO> findByWhere(PTaskVO modelVO);
}
