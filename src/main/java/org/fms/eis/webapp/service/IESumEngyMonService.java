
/**
 * 电量考核单元月电量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IESumEngyMonService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.ESumEngyMonVO;

import java.util.List;

public interface IESumEngyMonService {

	public int insert(ESumEngyMonVO eSumEngyMonVO);

	public int update(ESumEngyMonVO eSumEngyMonVO);

	public int delete(ESumEngyMonVO eSumEngyMonVO);

	public HttpResult deleteList(List<ESumEngyMonVO> deleteList) throws Exception;

	public ESumEngyMonVO findByKey(ESumEngyMonVO eSumEngyMonVO);

	public List<ESumEngyMonVO> findByWhere(ESumEngyMonVO eSumEngyMonVO);
}
