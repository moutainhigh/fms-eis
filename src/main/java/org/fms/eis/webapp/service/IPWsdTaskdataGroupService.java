
/**
 * 规约数据单元组（※相当于原来变电站采集的规约信息体类型）
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPWsdTaskdataGroupService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PWsdTaskdataGroupVO;

import java.util.List;

public interface IPWsdTaskdataGroupService {

	public int insert(PWsdTaskdataGroupVO pWsdTaskdataGroupVO);

	public int update(PWsdTaskdataGroupVO pWsdTaskdataGroupVO);

	public int delete(PWsdTaskdataGroupVO pWsdTaskdataGroupVO);

	public PWsdTaskdataGroupVO findByKey(PWsdTaskdataGroupVO pWsdTaskdataGroupVO);

	public List<PWsdTaskdataGroupVO> findByWhere(PWsdTaskdataGroupVO pWsdTaskdataGroupVO);
}
