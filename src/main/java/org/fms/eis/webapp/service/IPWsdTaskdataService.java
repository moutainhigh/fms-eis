
/**
 * 规约数据单元
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPWsdTaskdataService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PWsdTaskdataVO;

import java.util.List;

public interface IPWsdTaskdataService {

	public int insert(PWsdTaskdataVO pWsdTaskdataVO);

	public int update(PWsdTaskdataVO pWsdTaskdataVO);

	public int delete(PWsdTaskdataVO pWsdTaskdataVO);

	public PWsdTaskdataVO findByKey(PWsdTaskdataVO pWsdTaskdataVO);

	public List<PWsdTaskdataVO> findByWhere(PWsdTaskdataVO pWsdTaskdataVO);
}
