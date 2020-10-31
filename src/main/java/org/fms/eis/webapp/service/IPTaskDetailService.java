
/**
 * 采集任务明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPTaskDetailService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PTaskDetailVO;

import java.util.List;

public interface IPTaskDetailService {

    public int insert(PTaskDetailVO pTaskDetailVO);

    public int update(PTaskDetailVO pTaskDetailVO);

    public int delete(PTaskDetailVO pTaskDetailVO);

    public HttpResult deleteList(List<PTaskDetailVO> deleteList) throws Exception;

    public PTaskDetailVO findByKey(PTaskDetailVO pTaskDetailVO);

    public List<PTaskDetailVO> findByWhere(PTaskDetailVO pTaskDetailVO);
}
