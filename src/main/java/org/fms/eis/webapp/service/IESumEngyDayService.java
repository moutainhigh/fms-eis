
/**
 * 电量考核单元日电量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IESumEngyDayService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.ESumEngyDayVO;

import java.util.List;

public interface IESumEngyDayService {

	public int insert(ESumEngyDayVO eSumEngyDayVO);

	public int update(ESumEngyDayVO eSumEngyDayVO);

	public int delete(ESumEngyDayVO eSumEngyDayVO);

	public HttpResult deleteList(List<ESumEngyDayVO> deleteList) throws Exception;

	public ESumEngyDayVO findByKey(ESumEngyDayVO eSumEngyDayVO);

	public List<ESumEngyDayVO> findByWhere(ESumEngyDayVO eSumEngyDayVO);
}
