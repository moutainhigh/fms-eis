
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.ISystemCommonConfigService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.SystemCommonConfigVO;

import java.util.List;

public interface ISystemCommonConfigService {

	public int insert(SystemCommonConfigVO modelVO);

	public int update(SystemCommonConfigVO modelVO);

	public int delete(SystemCommonConfigVO modelVO);

	public SystemCommonConfigVO findByKey(SystemCommonConfigVO modelVO);

	public List<SystemCommonConfigVO> findByWhere(SystemCommonConfigVO modelVO);
}
