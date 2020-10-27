
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPChnlGpDasRelaService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PChnlGpDasRelaVO;

import java.util.List;

public interface IPChnlGpDasRelaService {

	public int insert(PChnlGpDasRelaVO modelVO);

	public int update(PChnlGpDasRelaVO modelVO);

	public int delete(PChnlGpDasRelaVO modelVO);

	public PChnlGpDasRelaVO findByKey(PChnlGpDasRelaVO modelVO);

	public List<PChnlGpDasRelaVO> findByWhere(PChnlGpDasRelaVO modelVO);
}
