
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPSysRateShemeService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PSysRateShemeVO;

import java.util.List;

public interface IPSysRateShemeService {

	public int insert(PSysRateShemeVO modelVO);

	public int update(PSysRateShemeVO modelVO);

	public int delete(PSysRateShemeVO modelVO);

	public PSysRateShemeVO findByKey(PSysRateShemeVO modelVO);

	public List<PSysRateShemeVO> findByWhere(PSysRateShemeVO modelVO);
}
