
/**
 * 采集主机组
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPWsdChnlTypeService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PWsdChnlTypeVO;

import java.util.List;

public interface IPWsdChnlTypeService {

	public int insert(PWsdChnlTypeVO pWsdChnlTypeVO);

	public int update(PWsdChnlTypeVO pWsdChnlTypeVO);

	public int delete(PWsdChnlTypeVO pWsdChnlTypeVO);

	public PWsdChnlTypeVO findByKey(PWsdChnlTypeVO pWsdChnlTypeVO);

	public List<PWsdChnlTypeVO> findByWhere(PWsdChnlTypeVO pWsdChnlTypeVO);
}
