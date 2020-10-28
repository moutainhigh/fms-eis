/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PWsdCalcTaskAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPWsdCalcTaskService;
import org.fms.eis.webapp.vo.PWsdCalcTaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PWsdCalcTask")
public class PWsdCalcTaskAction {

	@Autowired
	@Qualifier("pWsdCalcTaskServiceImpl")
	private IPWsdCalcTaskService pWsdCalcTaskService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PWsdCalcTaskVO _PWsdCalcTaskVO) {
		int i = pWsdCalcTaskService.insert(_PWsdCalcTaskVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PWsdCalcTaskVO _pWsdCalcTaskVO) {
		int i = pWsdCalcTaskService.update(_pWsdCalcTaskVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PWsdCalcTaskVO _PWsdCalcTaskVO) {
		int i = pWsdCalcTaskService.delete(_PWsdCalcTaskVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PWsdCalcTaskVO _PWsdCalcTaskVO) {
		PWsdCalcTaskVO modelVo= pWsdCalcTaskService.findByKey(_PWsdCalcTaskVO);

		if (modelVo!=null)
			return new HttpResult<PWsdCalcTaskVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PWsdCalcTaskVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PWsdCalcTaskVO _PWsdCalcTaskVO) {
		List<PWsdCalcTaskVO> listVo= pWsdCalcTaskService.findByWhere(_PWsdCalcTaskVO);

		if (listVo!=null)
			return new HttpResult<List<PWsdCalcTaskVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PWsdCalcTaskVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
