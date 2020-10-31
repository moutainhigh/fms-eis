
/**
 * 采集点
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IRCpService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.RCpVO;

import java.util.List;

public interface IRCpService {

    public int insert(RCpVO rCpVO);

    public int update(RCpVO rCpVO);

    public int delete(RCpVO rCpVO);

    public HttpResult deleteList(List<RCpVO> deleteList) throws Exception;

    public RCpVO findByKey(RCpVO rCpVO);

    public List<RCpVO> findByWhere(RCpVO rCpVO);
}
