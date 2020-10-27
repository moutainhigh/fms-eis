/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.SystemCommonConfigAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.ISystemCommonConfigService;
import org.fms.eis.webapp.vo.SystemCommonConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("SystemCommonConfig")
public class SystemCommonConfigAction {

	@Autowired
	@Qualifier("SystemCommonConfigServiceImpl")
	private ISystemCommonConfigService systemCommonConfigService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody SystemCommonConfigVO _SystemCommonConfigVO) {
		int i = systemCommonConfigService.insert(_SystemCommonConfigVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody SystemCommonConfigVO _systemCommonConfigVO) {
		int i = systemCommonConfigService.update(_systemCommonConfigVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody SystemCommonConfigVO _SystemCommonConfigVO) {
		int i = systemCommonConfigService.delete(_SystemCommonConfigVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody SystemCommonConfigVO _SystemCommonConfigVO) {
		SystemCommonConfigVO modelVo= systemCommonConfigService.findByKey(_SystemCommonConfigVO);

		if (modelVo!=null)
			return new HttpResult<SystemCommonConfigVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<SystemCommonConfigVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody SystemCommonConfigVO _SystemCommonConfigVO) {
		List<SystemCommonConfigVO> listVo= systemCommonConfigService.findByWhere(_SystemCommonConfigVO);

		if (listVo!=null)
			return new HttpResult<List<SystemCommonConfigVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<SystemCommonConfigVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
