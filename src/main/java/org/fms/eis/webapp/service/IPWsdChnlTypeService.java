
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.IPWsdChnlTypeService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PWsdChnlTypeVO;

import java.util.List;

public interface IPWsdChnlTypeService {

	public int insert(PWsdChnlTypeVO modelVO);

	public int update(PWsdChnlTypeVO modelVO);

	public int delete(PWsdChnlTypeVO modelVO);

	public PWsdChnlTypeVO findByKey(PWsdChnlTypeVO modelVO);

	public List<PWsdChnlTypeVO> findByWhere(PWsdChnlTypeVO modelVO);
}
