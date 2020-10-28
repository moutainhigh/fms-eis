/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PChannelAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPChannelService;
import org.fms.eis.webapp.vo.PChannelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PChannel")
public class PChannelAction {

	@Autowired
	@Qualifier("pChannelServiceImpl")
	private IPChannelService pChannelService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PChannelVO _PChannelVO) {
		int i = pChannelService.insert(_PChannelVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PChannelVO _pChannelVO) {
		int i = pChannelService.update(_pChannelVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PChannelVO _PChannelVO) {
		int i = pChannelService.delete(_PChannelVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PChannelVO _PChannelVO) {
		PChannelVO modelVo= pChannelService.findByKey(_PChannelVO);

		if (modelVo!=null)
			return new HttpResult<PChannelVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PChannelVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PChannelVO _PChannelVO) {
		List<PChannelVO> listVo= pChannelService.findByWhere(_PChannelVO);

		if (listVo!=null)
			return new HttpResult<List<PChannelVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PChannelVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
