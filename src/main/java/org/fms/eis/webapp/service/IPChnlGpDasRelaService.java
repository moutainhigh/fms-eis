
/**
 * 通道组主机关系
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPChnlGpDasRelaService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PChnlGpDasRelaVO;

import java.util.List;

public interface IPChnlGpDasRelaService {

    public int insert(PChnlGpDasRelaVO pChnlGpDasRelaVO);

    public int update(PChnlGpDasRelaVO pChnlGpDasRelaVO);

    public int delete(PChnlGpDasRelaVO pChnlGpDasRelaVO);

    public HttpResult deleteList(List<PChnlGpDasRelaVO> deleteList) throws Exception;

    public PChnlGpDasRelaVO findByKey(PChnlGpDasRelaVO pChnlGpDasRelaVO);

    public List<PChnlGpDasRelaVO> findByWhere(PChnlGpDasRelaVO pChnlGpDasRelaVO);
}
