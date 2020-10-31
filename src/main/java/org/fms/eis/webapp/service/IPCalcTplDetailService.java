
/**
 * 计算方案模板明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPCalcTplDetailService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PCalcTplDetailVO;

import java.util.List;

public interface IPCalcTplDetailService {

    public int insert(PCalcTplDetailVO pCalcTplDetailVO);

    public int update(PCalcTplDetailVO pCalcTplDetailVO);

    public int delete(PCalcTplDetailVO pCalcTplDetailVO);

    public HttpResult deleteList(List<PCalcTplDetailVO> deleteList) throws Exception;

    public PCalcTplDetailVO findByKey(PCalcTplDetailVO pCalcTplDetailVO);

    public List<PCalcTplDetailVO> findByWhere(PCalcTplDetailVO pCalcTplDetailVO);
}
