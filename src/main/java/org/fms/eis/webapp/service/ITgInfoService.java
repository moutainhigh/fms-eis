
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.ITgInfoService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.TgInfoVO;

import java.util.List;

public interface ITgInfoService {

	public int insert(TgInfoVO modelVO);

	public int update(TgInfoVO modelVO);

	public int delete(TgInfoVO modelVO);

	public TgInfoVO findByKey(TgInfoVO modelVO);

	public List<TgInfoVO> findByWhere(TgInfoVO modelVO);
}
