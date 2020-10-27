
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPSysCalcSchemeService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PSysCalcSchemeVO;

import java.util.List;

public interface IPSysCalcSchemeService {

	public int insert(PSysCalcSchemeVO modelVO);

	public int update(PSysCalcSchemeVO modelVO);

	public int delete(PSysCalcSchemeVO modelVO);

	public PSysCalcSchemeVO findByKey(PSysCalcSchemeVO modelVO);

	public List<PSysCalcSchemeVO> findByWhere(PSysCalcSchemeVO modelVO);
}
