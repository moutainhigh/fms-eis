
/**
 * 采集任务明细
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPTaskDetailService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PTaskDetailRelVO;
import org.fms.eis.webapp.vo.PTaskDetailVO;
import org.fms.eis.webapp.vo.PTaskTplDetailVO;
import org.fms.eis.webapp.vo.PWsdTaskdataRelVO;

import java.util.List;

public interface IPTaskDetailService {

    public int insert(PTaskDetailVO pTaskDetailVO);

    public int update(PTaskDetailVO pTaskDetailVO);

    public int delete(PTaskDetailVO pTaskDetailVO);

    public int deleteList(List<PTaskDetailVO> deleteList);

    public PTaskDetailVO findByKey(PTaskDetailVO pTaskDetailVO);

    public List<PTaskDetailVO> findByWhere(PTaskDetailVO pTaskDetailVO);

    public List<PWsdTaskdataRelVO> findByTaskRel(PWsdTaskdataRelVO modelVO);

    public List<PWsdTaskdataRelVO> findByTaskNoRel(PWsdTaskdataRelVO modelVO);

    public int insertList(List<PTaskDetailVO> insertList);
}
