
/**
 * 测量点月冻结需量表
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IEMpXlMonService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.EMpXlMonVO;

import java.util.List;

public interface IEMpXlMonService {

    public int insert(EMpXlMonVO eMpXlMonVO);

    public int update(EMpXlMonVO eMpXlMonVO);

    public int delete(EMpXlMonVO eMpXlMonVO);

    public HttpResult deleteList(List<EMpXlMonVO> deleteList) throws Exception;

    public EMpXlMonVO findByKey(EMpXlMonVO eMpXlMonVO);

    public List<EMpXlMonVO> findByWhere(EMpXlMonVO eMpXlMonVO);
}
