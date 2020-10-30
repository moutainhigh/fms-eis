
/**
 * 通道参数表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IPChannelService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.PChannelVO;

import java.util.List;

public interface IPChannelService {

	public int insert(PChannelVO pChannelVO);

	public int update(PChannelVO pChannelVO);

	public int delete(PChannelVO pChannelVO);

	public PChannelVO findByKey(PChannelVO pChannelVO);

	public List<PChannelVO> findByWhere(PChannelVO pChannelVO);
}
