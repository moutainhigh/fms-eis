/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.ITestService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.pChnlGroupVO;

import java.util.List;

public interface IPChnlGroupService {

	public int insert(pChnlGroupVO testVO);

	public int update(pChnlGroupVO testVO);

	public int delete(pChnlGroupVO testVO);

	public pChnlGroupVO findByKey(pChnlGroupVO testVO);

	public List<pChnlGroupVO> findByWhere(pChnlGroupVO testVO);
}
