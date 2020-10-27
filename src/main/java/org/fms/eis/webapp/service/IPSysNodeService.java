
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPSysNodeService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PSysNodeVO;

import java.util.List;

public interface IPSysNodeService {

	public int insert(PSysNodeVO modelVO);

	public int update(PSysNodeVO modelVO);

	public int delete(PSysNodeVO modelVO);

	public PSysNodeVO findByKey(PSysNodeVO modelVO);

	public List<PSysNodeVO> findByWhere(PSysNodeVO modelVO);
}
