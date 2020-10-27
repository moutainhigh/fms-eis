/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.RCpAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IRCpService;
import org.fms.eis.webapp.vo.RCpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("RCp")
public class RCpAction {

	@Autowired
	@Qualifier("RCpServiceImpl")
	private IRCpService rCpService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody RCpVO _RCpVO) {
		int i = rCpService.insert(_RCpVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody RCpVO _rCpVO) {
		int i = rCpService.update(_rCpVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody RCpVO _RCpVO) {
		int i = rCpService.delete(_RCpVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody RCpVO _RCpVO) {
		RCpVO modelVo= rCpService.findByKey(_RCpVO);

		if (modelVo!=null)
			return new HttpResult<RCpVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<RCpVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody RCpVO _RCpVO) {
		List<RCpVO> listVo= rCpService.findByWhere(_RCpVO);

		if (listVo!=null)
			return new HttpResult<List<RCpVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<RCpVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
