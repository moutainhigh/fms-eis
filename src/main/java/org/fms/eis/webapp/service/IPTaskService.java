
/**
 * 采集任务
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPTaskService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PTaskVO;

import java.util.List;

public interface IPTaskService {

	public int insert(PTaskVO pTaskVO);

	public int update(PTaskVO pTaskVO);

	public int delete(PTaskVO pTaskVO);

	public PTaskVO findByKey(PTaskVO pTaskVO);

	public List<PTaskVO> findByWhere(PTaskVO pTaskVO);
}
