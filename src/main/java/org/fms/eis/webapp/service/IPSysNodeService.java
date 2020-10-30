
/**
 * 系统节点
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPSysNodeService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PSysNodeVO;

import java.util.List;

public interface IPSysNodeService {

	public int insert(PSysNodeVO pSysNodeVO);

	public int update(PSysNodeVO pSysNodeVO);

	public int delete(PSysNodeVO pSysNodeVO);

	public PSysNodeVO findByKey(PSysNodeVO pSysNodeVO);

	public List<PSysNodeVO> findByWhere(PSysNodeVO pSysNodeVO);
}
