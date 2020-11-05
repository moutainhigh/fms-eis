/**
 * 测量点
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.action.PMpedAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IPMpedService;
import org.fms.eis.webapp.vo.PMpedVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PMped")
public class PMpedAction {

	@Autowired
	@Qualifier("PMpedServiceImpl")
	private IPMpedService pMpedService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PMpedVO pMpedVO) {
		int i = pMpedService.insert(pMpedVO);

		if (i > 0)
		{
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		}
		else
		{
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
		}

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PMpedVO pMpedVO) {
		int i = pMpedService.update(pMpedVO);

		if (i > 0)
		{
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		}
		else
		{
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
		}

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody List<PMpedVO> deleteList) throws Exception{
        HttpResult httpResult = pMpedService.deleteList(deleteList);
        return httpResult;
	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PMpedVO pMpedVO) {
		PMpedVO modelVo= pMpedService.findByKey(pMpedVO);

		if (modelVo!=null)
		{
			return new HttpResult<PMpedVO>(HttpResult.SUCCESS, "获取成功", modelVo);
        }
		else
       {
			return new HttpResult<PMpedVO>(HttpResult.ERROR, "未检索到相关数据!", null);
       }

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResultPagination<?> findByWhere(@RequestBody PMpedVO pMpedVO) {

		return new  HttpResultPagination(pMpedVO,pMpedService.findByWhere(pMpedVO));
	}
}
