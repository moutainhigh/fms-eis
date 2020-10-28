/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PTaskTplDetailAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPTaskTplDetailService;
import org.fms.eis.webapp.vo.PTaskTplDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PTaskTplDetail")
public class PTaskTplDetailAction {

	@Autowired
	@Qualifier("pTaskTplDetailServiceImpl")
	private IPTaskTplDetailService pTaskTplDetailService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PTaskTplDetailVO _PTaskTplDetailVO) {
		int i = pTaskTplDetailService.insert(_PTaskTplDetailVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PTaskTplDetailVO _pTaskTplDetailVO) {
		int i = pTaskTplDetailService.update(_pTaskTplDetailVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PTaskTplDetailVO _PTaskTplDetailVO) {
		int i = pTaskTplDetailService.delete(_PTaskTplDetailVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PTaskTplDetailVO _PTaskTplDetailVO) {
		PTaskTplDetailVO modelVo= pTaskTplDetailService.findByKey(_PTaskTplDetailVO);

		if (modelVo!=null)
			return new HttpResult<PTaskTplDetailVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PTaskTplDetailVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PTaskTplDetailVO _PTaskTplDetailVO) {
		List<PTaskTplDetailVO> listVo= pTaskTplDetailService.findByWhere(_PTaskTplDetailVO);

		if (listVo!=null)
			return new HttpResult<List<PTaskTplDetailVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PTaskTplDetailVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
