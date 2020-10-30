
/**
 * 采集任务明细
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPTaskDetailService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PTaskDetailVO;

import java.util.List;

public interface IPTaskDetailService {

	public int insert(PTaskDetailVO pTaskDetailVO);

	public int update(PTaskDetailVO pTaskDetailVO);

	public int delete(PTaskDetailVO pTaskDetailVO);

	public PTaskDetailVO findByKey(PTaskDetailVO pTaskDetailVO);

	public List<PTaskDetailVO> findByWhere(PTaskDetailVO pTaskDetailVO);
}
