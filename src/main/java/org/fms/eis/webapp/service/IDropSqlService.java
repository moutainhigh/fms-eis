
/**
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IDropSqlService.java
 **/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.DropSqlVO;

import java.util.List;

public interface IDropSqlService {

    public int insert(DropSqlVO dropSqlVO);

    public int update(DropSqlVO dropSqlVO);

    public int delete(DropSqlVO dropSqlVO);

    public DropSqlVO findByKey(DropSqlVO dropSqlVO);

    public List<DropSqlVO> findByWhere(DropSqlVO dropSqlVO);
}
