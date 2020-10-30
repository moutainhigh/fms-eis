
/**
 * 计算方案模板
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPCalcTplService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PCalcTplVO;

import java.util.List;

public interface IPCalcTplService {

	public int insert(PCalcTplVO pCalcTplVO);

	public int update(PCalcTplVO pCalcTplVO);

	public int delete(PCalcTplVO pCalcTplVO);

	public PCalcTplVO findByKey(PCalcTplVO pCalcTplVO);

	public List<PCalcTplVO> findByWhere(PCalcTplVO pCalcTplVO);
}
