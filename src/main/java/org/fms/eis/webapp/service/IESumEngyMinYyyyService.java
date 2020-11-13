
/**
 * 电量考核单元分钟电量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IESumEngyMinYyyyService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.ESumEngyMinYyyyVO;

import java.util.List;

public interface IESumEngyMinYyyyService {

	public int insert(ESumEngyMinYyyyVO eSumEngyMinYyyyVO);

	public int update(ESumEngyMinYyyyVO eSumEngyMinYyyyVO);

	public int delete(ESumEngyMinYyyyVO eSumEngyMinYyyyVO);

	public HttpResult deleteList(List<ESumEngyMinYyyyVO> deleteList) throws Exception;

	public ESumEngyMinYyyyVO findByKey(ESumEngyMinYyyyVO eSumEngyMinYyyyVO);

	public List<ESumEngyMinYyyyVO> findByWhere(ESumEngyMinYyyyVO eSumEngyMinYyyyVO);
}
