
/**
 * 规约定义表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPWsdProtocolService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PWsdProtocolVO;

import java.util.List;

public interface IPWsdProtocolService {

    public int insert(PWsdProtocolVO pWsdProtocolVO);

    public int update(PWsdProtocolVO pWsdProtocolVO);

    public int delete(PWsdProtocolVO pWsdProtocolVO);

    public HttpResult deleteList(List<PWsdProtocolVO> deleteList) throws Exception;

    public PWsdProtocolVO findByKey(PWsdProtocolVO pWsdProtocolVO);

    public List<PWsdProtocolVO> findByWhere(PWsdProtocolVO pWsdProtocolVO);
}
