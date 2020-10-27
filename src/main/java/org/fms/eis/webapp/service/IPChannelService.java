
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPChannelService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PChannelVO;

import java.util.List;

public interface IPChannelService {

	public int insert(PChannelVO modelVO);

	public int update(PChannelVO modelVO);

	public int delete(PChannelVO modelVO);

	public PChannelVO findByKey(PChannelVO modelVO);

	public List<PChannelVO> findByWhere(PChannelVO modelVO);
}
