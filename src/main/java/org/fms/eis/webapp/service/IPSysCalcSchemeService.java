
/**
 * 计算方案
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPSysCalcSchemeService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PSysCalcSchemeVO;

import java.util.List;

public interface IPSysCalcSchemeService {

    public int insert(PSysCalcSchemeVO pSysCalcSchemeVO);

    public int update(PSysCalcSchemeVO pSysCalcSchemeVO);

    public int delete(PSysCalcSchemeVO pSysCalcSchemeVO);

    public HttpResult deleteList(List<PSysCalcSchemeVO> deleteList) throws Exception;

    public PSysCalcSchemeVO findByKey(PSysCalcSchemeVO pSysCalcSchemeVO);

    public List<PSysCalcSchemeVO> findByWhere(PSysCalcSchemeVO pSysCalcSchemeVO);
}
