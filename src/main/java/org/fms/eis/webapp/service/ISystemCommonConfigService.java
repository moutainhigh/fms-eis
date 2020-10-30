
/**
 *  下拉表 -迟子曰改
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.ISystemCommonConfigService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.SystemCommonConfigVO;

import java.util.List;

public interface ISystemCommonConfigService {

	public int insert(SystemCommonConfigVO systemCommonConfigVO);

	public int update(SystemCommonConfigVO systemCommonConfigVO);

	public int delete(SystemCommonConfigVO systemCommonConfigVO);

	public SystemCommonConfigVO findByKey(SystemCommonConfigVO systemCommonConfigVO);

	public List<SystemCommonConfigVO> findByWhere(SystemCommonConfigVO systemCommonConfigVO);
}
