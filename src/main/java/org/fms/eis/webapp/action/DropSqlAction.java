/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.DropSqlAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IDropSqlService;
import org.fms.eis.webapp.vo.DropSqlVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("DropSql")
public class DropSqlAction {

	@Autowired
	@Qualifier("DropSqlServiceImpl")
	private IDropSqlService dropSqlService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody DropSqlVO _DropSqlVO) {
		int i = dropSqlService.insert(_DropSqlVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody DropSqlVO _dropSqlVO) {
		int i = dropSqlService.update(_dropSqlVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody DropSqlVO _DropSqlVO) {
		int i = dropSqlService.delete(_DropSqlVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody DropSqlVO _DropSqlVO) {
		DropSqlVO modelVo= dropSqlService.findByKey(_DropSqlVO);

		if (modelVo!=null)
			return new HttpResult<DropSqlVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<DropSqlVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody DropSqlVO _DropSqlVO) {
		List<DropSqlVO> listVo= dropSqlService.findByWhere(_DropSqlVO);

		if (listVo!=null)
			return new HttpResult<List<DropSqlVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<DropSqlVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
