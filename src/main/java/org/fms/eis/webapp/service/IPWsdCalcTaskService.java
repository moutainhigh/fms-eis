
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPWsdCalcTaskService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PWsdCalcTaskVO;

import java.util.List;

public interface IPWsdCalcTaskService {

	public int insert(PWsdCalcTaskVO modelVO);

	public int update(PWsdCalcTaskVO modelVO);

	public int delete(PWsdCalcTaskVO modelVO);

	public PWsdCalcTaskVO findByKey(PWsdCalcTaskVO modelVO);

	public List<PWsdCalcTaskVO> findByWhere(PWsdCalcTaskVO modelVO);
}
