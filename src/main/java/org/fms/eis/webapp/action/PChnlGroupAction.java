/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.TestAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPChnlGroupService;
import org.fms.eis.webapp.vo.pChnlGroupVO;
import org.fms.eis.webapp.domain.pChnlGroupDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@RequestMapping("PChnlGroup")
public class PChnlGroupAction {

	@Autowired
	@Qualifier("PChnlGroupServiceImpl")
	private IPChnlGroupService pChnlGroupService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody pChnlGroupVO pchnlGroupVO) {
		int i = pChnlGroupService.insert(pchnlGroupVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody pChnlGroupVO pchnlGroupVO) {
		int i = pChnlGroupService.update(pchnlGroupVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody pChnlGroupVO pchnlGroupVO) {
		int i = pChnlGroupService.delete(pchnlGroupVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody pChnlGroupVO pchnlGroupVO) {
		pChnlGroupVO modelVo= pChnlGroupService.findByKey(pchnlGroupVO);

		if (modelVo!=null)
			return new HttpResult<pChnlGroupVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<pChnlGroupVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody pChnlGroupVO pchnlGroupVO) {
		List<pChnlGroupVO> listVo= pChnlGroupService.findByWhere(pchnlGroupVO);

		if (listVo!=null)
			return new HttpResult<List<pChnlGroupVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<pChnlGroupVO>>(HttpResult.ERROR, "查询失败", null);

	}

}
