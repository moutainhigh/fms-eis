
/**
 * 计算方案模板
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPCalcTplService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PCalcTplVO;

import java.util.List;

public interface IPCalcTplService {

    public int insert(PCalcTplVO pCalcTplVO);

    public int update(PCalcTplVO pCalcTplVO);

    public int delete(PCalcTplVO pCalcTplVO);

    public HttpResult deleteList(List<PCalcTplVO> deleteList) throws Exception;

    public PCalcTplVO findByKey(PCalcTplVO pCalcTplVO);

    public List<PCalcTplVO> findByWhere(PCalcTplVO pCalcTplVO);
}
