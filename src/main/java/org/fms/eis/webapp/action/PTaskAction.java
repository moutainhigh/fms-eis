/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PTaskAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPTaskService;
import org.fms.eis.webapp.vo.PTaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PTask")
public class PTaskAction {

	@Autowired
	@Qualifier("PTaskServiceImpl")
	private IPTaskService pTaskService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PTaskVO _PTaskVO) {
		int i = pTaskService.insert(_PTaskVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PTaskVO _pTaskVO) {
		int i = pTaskService.update(_pTaskVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PTaskVO _PTaskVO) {
		int i = pTaskService.delete(_PTaskVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PTaskVO _PTaskVO) {
		PTaskVO modelVo= pTaskService.findByKey(_PTaskVO);

		if (modelVo!=null)
			return new HttpResult<PTaskVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PTaskVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PTaskVO _PTaskVO) {
		List<PTaskVO> listVo= pTaskService.findByWhere(_PTaskVO);

		if (listVo!=null)
			return new HttpResult<List<PTaskVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PTaskVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
