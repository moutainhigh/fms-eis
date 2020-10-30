
/**
 * 计算任务
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPCalcTaskService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PCalcTaskVO;

import java.util.List;

public interface IPCalcTaskService {

	public int insert(PCalcTaskVO pCalcTaskVO);

	public int update(PCalcTaskVO pCalcTaskVO);

	public int delete(PCalcTaskVO pCalcTaskVO);

	public PCalcTaskVO findByKey(PCalcTaskVO pCalcTaskVO);

	public List<PCalcTaskVO> findByWhere(PCalcTaskVO pCalcTaskVO);
}
