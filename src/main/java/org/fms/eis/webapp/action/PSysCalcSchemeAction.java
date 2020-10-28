/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PSysCalcSchemeAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPSysCalcSchemeService;
import org.fms.eis.webapp.vo.PSysCalcSchemeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PSysCalcScheme")
public class PSysCalcSchemeAction {

	@Autowired
	@Qualifier("pSysCalcSchemeServiceImpl")
	private IPSysCalcSchemeService pSysCalcSchemeService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PSysCalcSchemeVO _PSysCalcSchemeVO) {
		int i = pSysCalcSchemeService.insert(_PSysCalcSchemeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PSysCalcSchemeVO _pSysCalcSchemeVO) {
		int i = pSysCalcSchemeService.update(_pSysCalcSchemeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PSysCalcSchemeVO _PSysCalcSchemeVO) {
		int i = pSysCalcSchemeService.delete(_PSysCalcSchemeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PSysCalcSchemeVO _PSysCalcSchemeVO) {
		PSysCalcSchemeVO modelVo= pSysCalcSchemeService.findByKey(_PSysCalcSchemeVO);

		if (modelVo!=null)
			return new HttpResult<PSysCalcSchemeVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PSysCalcSchemeVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PSysCalcSchemeVO _PSysCalcSchemeVO) {
		List<PSysCalcSchemeVO> listVo= pSysCalcSchemeService.findByWhere(_PSysCalcSchemeVO);

		if (listVo!=null)
			return new HttpResult<List<PSysCalcSchemeVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PSysCalcSchemeVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
