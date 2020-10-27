
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IDropSqlService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.DropSqlVO;

import java.util.List;

public interface IDropSqlService {

	public int insert(DropSqlVO modelVO);

	public int update(DropSqlVO modelVO);

	public int delete(DropSqlVO modelVO);

	public DropSqlVO findByKey(DropSqlVO modelVO);

	public List<DropSqlVO> findByWhere(DropSqlVO modelVO);
}
