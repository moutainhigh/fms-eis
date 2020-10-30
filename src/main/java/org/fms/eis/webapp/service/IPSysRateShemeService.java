
/**
 * 多费率方案定义表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPSysRateShemeService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PSysRateShemeVO;

import java.util.List;

public interface IPSysRateShemeService {

	public int insert(PSysRateShemeVO pSysRateShemeVO);

	public int update(PSysRateShemeVO pSysRateShemeVO);

	public int delete(PSysRateShemeVO pSysRateShemeVO);

	public PSysRateShemeVO findByKey(PSysRateShemeVO pSysRateShemeVO);

	public List<PSysRateShemeVO> findByWhere(PSysRateShemeVO pSysRateShemeVO);
}
