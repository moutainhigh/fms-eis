
/**
 * 计算方案模板明细
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPCalcTplDetailService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PCalcTplDetailVO;

import java.util.List;

public interface IPCalcTplDetailService {

	public int insert(PCalcTplDetailVO pCalcTplDetailVO);

	public int update(PCalcTplDetailVO pCalcTplDetailVO);

	public int delete(PCalcTplDetailVO pCalcTplDetailVO);

	public PCalcTplDetailVO findByKey(PCalcTplDetailVO pCalcTplDetailVO);

	public List<PCalcTplDetailVO> findByWhere(PCalcTplDetailVO pCalcTplDetailVO);
}
