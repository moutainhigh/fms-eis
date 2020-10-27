
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IRCpService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.RCpVO;

import java.util.List;

public interface IRCpService {

	public int insert(RCpVO modelVO);

	public int update(RCpVO modelVO);

	public int delete(RCpVO modelVO);

	public RCpVO findByKey(RCpVO modelVO);

	public List<RCpVO> findByWhere(RCpVO modelVO);
}
