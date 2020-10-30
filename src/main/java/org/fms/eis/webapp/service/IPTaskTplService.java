
/**
 * 采集任务设置模板
※设置时根据设置的模板明细、任务明细自动生成终端的任务及明细
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPTaskTplService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PTaskTplVO;

import java.util.List;

public interface IPTaskTplService {

	public int insert(PTaskTplVO pTaskTplVO);

	public int update(PTaskTplVO pTaskTplVO);

	public int delete(PTaskTplVO pTaskTplVO);

	public PTaskTplVO findByKey(PTaskTplVO pTaskTplVO);

	public List<PTaskTplVO> findByWhere(PTaskTplVO pTaskTplVO);
}
