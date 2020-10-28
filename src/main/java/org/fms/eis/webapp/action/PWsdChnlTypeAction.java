/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PWsdChnlTypeAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPWsdChnlTypeService;
import org.fms.eis.webapp.vo.PWsdChnlTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PWsdChnlType")
public class PWsdChnlTypeAction {

	@Autowired
	@Qualifier("pWsdChnlTypeServiceImpl")
	private IPWsdChnlTypeService pWsdChnlTypeService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PWsdChnlTypeVO _PWsdChnlTypeVO) {
		int i = pWsdChnlTypeService.insert(_PWsdChnlTypeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PWsdChnlTypeVO _pWsdChnlTypeVO) {
		int i = pWsdChnlTypeService.update(_pWsdChnlTypeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PWsdChnlTypeVO _PWsdChnlTypeVO) {
		int i = pWsdChnlTypeService.delete(_PWsdChnlTypeVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PWsdChnlTypeVO _PWsdChnlTypeVO) {
		PWsdChnlTypeVO modelVo= pWsdChnlTypeService.findByKey(_PWsdChnlTypeVO);

		if (modelVo!=null)
			return new HttpResult<PWsdChnlTypeVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PWsdChnlTypeVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PWsdChnlTypeVO _PWsdChnlTypeVO) {
		List<PWsdChnlTypeVO> listVo= pWsdChnlTypeService.findByWhere(_PWsdChnlTypeVO);

		if (listVo!=null)
			return new HttpResult<List<PWsdChnlTypeVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PWsdChnlTypeVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
