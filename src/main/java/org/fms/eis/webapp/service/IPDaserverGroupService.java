
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPDaserverGroupService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PDaserverGroupVO;

import java.util.List;

public interface IPDaserverGroupService {

	public int insert(PDaserverGroupVO modelVO);

	public int update(PDaserverGroupVO modelVO);

	public int delete(PDaserverGroupVO modelVO);

	public PDaserverGroupVO findByKey(PDaserverGroupVO modelVO);

	public List<PDaserverGroupVO> findByWhere(PDaserverGroupVO modelVO);
}
