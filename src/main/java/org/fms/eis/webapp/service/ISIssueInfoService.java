
/**
 * 系统公告
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.ISIssueInfoService.java
 *
**/
package org.fms.eis.webapp.service;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.SIssueInfoVO;

import java.util.List;

public interface ISIssueInfoService {

	public int insert(SIssueInfoVO sIssueInfoVO);

	public int update(SIssueInfoVO sIssueInfoVO);

	public int delete(SIssueInfoVO sIssueInfoVO);

	public HttpResult deleteList(List<SIssueInfoVO> deleteList) throws Exception;

	public SIssueInfoVO findByKey(SIssueInfoVO sIssueInfoVO);

	public List<SIssueInfoVO> findByWhere(SIssueInfoVO sIssueInfoVO);
}
