
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPChnlGroupService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PChnlGroupVO;

import java.util.List;

public interface IPChnlGroupService {

	public int insert(PChnlGroupVO modelVO);

	public int update(PChnlGroupVO modelVO);

	public int delete(PChnlGroupVO modelVO);

	public PChnlGroupVO findByKey(PChnlGroupVO modelVO);

	public List<PChnlGroupVO> findByWhere(PChnlGroupVO modelVO);
}
