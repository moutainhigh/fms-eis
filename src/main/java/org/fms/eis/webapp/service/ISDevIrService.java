
/**
 * 记录计量点新装及变更过程中的电能表，互感器，计量柜、计量屏，计量箱，失压仪，采集终端等设备的装拆信息实体，定义了设
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.ISDevIrService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.SDevIrVO;

import java.util.List;

public interface ISDevIrService {

	public int insert(SDevIrVO sDevIrVO);

	public int update(SDevIrVO sDevIrVO);

	public int delete(SDevIrVO sDevIrVO);

	public HttpResult deleteList(List<SDevIrVO> deleteList) throws Exception;

	public SDevIrVO findByKey(SDevIrVO sDevIrVO);

	public List<SDevIrVO> findByWhere(SDevIrVO sDevIrVO);
}
