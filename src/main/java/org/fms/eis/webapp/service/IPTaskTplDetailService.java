
/**
 * 采集任务模板明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPTaskTplDetailService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PTaskTplDetailVO;

import java.util.List;

public interface IPTaskTplDetailService {

    public int insert(PTaskTplDetailVO pTaskTplDetailVO);

    public int update(PTaskTplDetailVO pTaskTplDetailVO);

    public int delete(PTaskTplDetailVO pTaskTplDetailVO);

    public HttpResult deleteList(List<PTaskTplDetailVO> deleteList) throws Exception;

    public PTaskTplDetailVO findByKey(PTaskTplDetailVO pTaskTplDetailVO);

    public List<PTaskTplDetailVO> findByWhere(PTaskTplDetailVO pTaskTplDetailVO);
}
