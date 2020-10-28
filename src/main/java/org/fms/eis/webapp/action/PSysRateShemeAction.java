/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PSysRateShemeAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPSysRateShemeService;
import org.fms.eis.webapp.vo.PSysRateShemeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PSysRateSheme")
public class PSysRateShemeAction {

	@Autowired
	@Qualifier("pSysRateShemeServiceImpl")
	private IPSysRateShemeService pSysRateShemeService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PSysRateShemeVO _PSysRateShemeVO) {
		int i = pSysRateShemeService.insert(_PSysRateShemeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PSysRateShemeVO _pSysRateShemeVO) {
		int i = pSysRateShemeService.update(_pSysRateShemeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PSysRateShemeVO _PSysRateShemeVO) {
		int i = pSysRateShemeService.delete(_PSysRateShemeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PSysRateShemeVO _PSysRateShemeVO) {
		PSysRateShemeVO modelVo= pSysRateShemeService.findByKey(_PSysRateShemeVO);

		if (modelVo!=null)
			return new HttpResult<PSysRateShemeVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PSysRateShemeVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PSysRateShemeVO _PSysRateShemeVO) {
		List<PSysRateShemeVO> listVo= pSysRateShemeService.findByWhere(_PSysRateShemeVO);

		if (listVo!=null)
			return new HttpResult<List<PSysRateShemeVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PSysRateShemeVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
