
/**
 * 通道组主机关系
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPChnlGpDasRelaService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PChnlGpDasRelaVO;

import java.util.List;

public interface IPChnlGpDasRelaService {

	public int insert(PChnlGpDasRelaVO pChnlGpDasRelaVO);

	public int update(PChnlGpDasRelaVO pChnlGpDasRelaVO);

	public int delete(PChnlGpDasRelaVO pChnlGpDasRelaVO);

	public PChnlGpDasRelaVO findByKey(PChnlGpDasRelaVO pChnlGpDasRelaVO);

	public List<PChnlGpDasRelaVO> findByWhere(PChnlGpDasRelaVO pChnlGpDasRelaVO);
}
