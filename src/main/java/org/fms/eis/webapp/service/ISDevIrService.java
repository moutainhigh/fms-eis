
/**
 * 设备装拆记录表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.ISDevIrService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.SDevIrVO;

import java.util.List;

public interface ISDevIrService {

    public int insert(SDevIrVO sDevIrVO);

    public int update(SDevIrVO sDevIrVO);

    public int delete(SDevIrVO sDevIrVO);

    public HttpResult deleteList(List<SDevIrVO> deleteList) throws Exception;

    public SDevIrVO findByKey(SDevIrVO sDevIrVO);

    public List<SDevIrVO> findByWhere(SDevIrVO sDevIrVO);
}
