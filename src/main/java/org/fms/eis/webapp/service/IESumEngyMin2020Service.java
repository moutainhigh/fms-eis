
/**
 * 电量考核单元分钟电量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.IESumEngyMin2020Service.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.ESumEngyMin2020VO;

import java.util.List;

public interface IESumEngyMin2020Service {

	public int insert(ESumEngyMin2020VO eSumEngyMin2020VO);

	public int update(ESumEngyMin2020VO eSumEngyMin2020VO);

	public int delete(ESumEngyMin2020VO eSumEngyMin2020VO);

	public HttpResult deleteList(List<ESumEngyMin2020VO> deleteList) throws Exception;

	public ESumEngyMin2020VO findByKey(ESumEngyMin2020VO eSumEngyMin2020VO);

	public List<ESumEngyMin2020VO> findByWhere(ESumEngyMin2020VO eSumEngyMin2020VO);
}
