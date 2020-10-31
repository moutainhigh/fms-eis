
/**
 * 通道组
 * Author :
 * Date :
 * Title : org.fms.eis.webapp.service.IPChnlGroupService.java
 **/
package org.fms.eis.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.vo.PChnlGroupStaticVO;
import org.fms.eis.webapp.vo.PChnlGroupVO;

import java.util.List;

public interface IPChnlGroupService {

    public int insert(PChnlGroupVO pChnlGroupVO);

    public int update(PChnlGroupVO pChnlGroupVO);

    public int delete(PChnlGroupVO pChnlGroupVO);

    public HttpResult deleteList(List<PChnlGroupVO> deleteList) throws Exception;

    public PChnlGroupVO findByKey(PChnlGroupVO pChnlGroupVO);

    public List<PChnlGroupVO> findByWhere(PChnlGroupVO pChnlGroupVO);

    public List<PChnlGroupStaticVO> findByWhereStatic(PChnlGroupStaticVO pChnlGroupVO);

}
