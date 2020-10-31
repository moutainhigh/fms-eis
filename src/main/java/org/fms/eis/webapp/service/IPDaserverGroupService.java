
/**
 * 采集主机组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPDaserverGroupService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PDaserverGroupVO;

import java.util.List;

public interface IPDaserverGroupService {

    public int insert(PDaserverGroupVO pDaserverGroupVO);

    public int update(PDaserverGroupVO pDaserverGroupVO);

    public int delete(PDaserverGroupVO pDaserverGroupVO);

    public HttpResult deleteList(List<PDaserverGroupVO> deleteList) throws Exception;

    public PDaserverGroupVO findByKey(PDaserverGroupVO pDaserverGroupVO);

    public List<PDaserverGroupVO> findByWhere(PDaserverGroupVO pDaserverGroupVO);
}
