/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PTaskTplAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPTaskTplService;
import org.fms.eis.webapp.vo.PTaskTplVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PTaskTpl")
public class PTaskTplAction {

	@Autowired
	@Qualifier("PTaskTplServiceImpl")
	private IPTaskTplService pTaskTplService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PTaskTplVO _PTaskTplVO) {
		int i = pTaskTplService.insert(_PTaskTplVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PTaskTplVO _pTaskTplVO) {
		int i = pTaskTplService.update(_pTaskTplVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PTaskTplVO _PTaskTplVO) {
		int i = pTaskTplService.delete(_PTaskTplVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PTaskTplVO _PTaskTplVO) {
		PTaskTplVO modelVo= pTaskTplService.findByKey(_PTaskTplVO);

		if (modelVo!=null)
			return new HttpResult<PTaskTplVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PTaskTplVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PTaskTplVO _PTaskTplVO) {
		List<PTaskTplVO> listVo= pTaskTplService.findByWhere(_PTaskTplVO);

		if (listVo!=null)
			return new HttpResult<List<PTaskTplVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PTaskTplVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
