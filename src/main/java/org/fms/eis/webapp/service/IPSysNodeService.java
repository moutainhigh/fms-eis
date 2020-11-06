
/**
 * 系统节点
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPSysNodeService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PChnlGpDasRelaVO;
import org.fms.eis.webapp.vo.PDaserverGroupVO;
import org.fms.eis.webapp.vo.PSysNodeVO;

import java.util.List;
import java.util.Map;

public interface IPSysNodeService {

    public int insert(PSysNodeVO pSysNodeVO);

    public int update(PSysNodeVO pSysNodeVO);

    public int delete(PSysNodeVO pSysNodeVO);

    public HttpResult deleteList(List<PSysNodeVO> deleteList) throws Exception;

    public PSysNodeVO findByKey(PSysNodeVO pSysNodeVO);

    public List<PSysNodeVO> findByWhere(PSysNodeVO pSysNodeVO);

    public int updateListDaserverGroup(List<PSysNodeVO> sysNodeVOList);

    public List<PSysNodeVO> findByRelDasGroup(String value);
}
