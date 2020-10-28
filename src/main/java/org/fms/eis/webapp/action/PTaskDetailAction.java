/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PTaskDetailAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPTaskDetailService;
import org.fms.eis.webapp.vo.PTaskDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PTaskDetail")
public class PTaskDetailAction {

	@Autowired
	@Qualifier("pTaskDetailServiceImpl")
	private IPTaskDetailService pTaskDetailService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PTaskDetailVO _PTaskDetailVO) {
		int i = pTaskDetailService.insert(_PTaskDetailVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PTaskDetailVO _pTaskDetailVO) {
		int i = pTaskDetailService.update(_pTaskDetailVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PTaskDetailVO _PTaskDetailVO) {
		int i = pTaskDetailService.delete(_PTaskDetailVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PTaskDetailVO _PTaskDetailVO) {
		PTaskDetailVO modelVo= pTaskDetailService.findByKey(_PTaskDetailVO);

		if (modelVo!=null)
			return new HttpResult<PTaskDetailVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PTaskDetailVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PTaskDetailVO _PTaskDetailVO) {
		List<PTaskDetailVO> listVo= pTaskDetailService.findByWhere(_PTaskDetailVO);

		if (listVo!=null)
			return new HttpResult<List<PTaskDetailVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PTaskDetailVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
