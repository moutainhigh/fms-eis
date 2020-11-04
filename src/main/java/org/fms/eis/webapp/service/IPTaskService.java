
/**
 * 采集任务
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPTaskService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PCalcTaskRelVO;
import org.fms.eis.webapp.vo.PTaskRelVO;
import org.fms.eis.webapp.vo.PTaskVO;

import java.util.List;

public interface IPTaskService {

    public int insert(PTaskVO pTaskVO);

    public int update(PTaskVO pTaskVO);

    public int delete(PTaskVO pTaskVO);

    public HttpResult deleteList(List<PTaskVO> deleteList) throws Exception;

    public PTaskVO findByKey(PTaskVO pTaskVO);

    public List<PTaskVO> findByWhere(PTaskVO pTaskVO);

    public List<PTaskRelVO> findByTaskTpl(PTaskRelVO pTaskVO);
}
