/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.TgInfoAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.ITgInfoService;
import org.fms.eis.webapp.vo.TgInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("TgInfo")
public class TgInfoAction {

	@Autowired
	@Qualifier("TgInfoServiceImpl")
	private ITgInfoService tgInfoService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody TgInfoVO _TgInfoVO) {
		int i = tgInfoService.insert(_TgInfoVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody TgInfoVO _tgInfoVO) {
		int i = tgInfoService.update(_tgInfoVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody TgInfoVO _TgInfoVO) {
		int i = tgInfoService.delete(_TgInfoVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody TgInfoVO _TgInfoVO) {
		TgInfoVO modelVo= tgInfoService.findByKey(_TgInfoVO);

		if (modelVo!=null)
			return new HttpResult<TgInfoVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<TgInfoVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody TgInfoVO _TgInfoVO) {
		List<TgInfoVO> listVo= tgInfoService.findByWhere(_TgInfoVO);

		if (listVo!=null)
			return new HttpResult<List<TgInfoVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<TgInfoVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
