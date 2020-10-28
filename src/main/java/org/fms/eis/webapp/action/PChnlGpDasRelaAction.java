/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:19
 * Title : org.fms.eis.webapp.action.PChnlGpDasRelaAction.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.fms.eis.webapp.service.IPChnlGpDasRelaService;
import org.fms.eis.webapp.vo.PChnlGpDasRelaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("PChnlGpDasRela")
public class PChnlGpDasRelaAction {

	@Autowired
	@Qualifier("PChnlGpDasRelaServiceImpl")
	private IPChnlGpDasRelaService pChnlGpDasRelaService;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody PChnlGpDasRelaVO _PChnlGpDasRelaVO) {
		int i = pChnlGpDasRelaService.insert(_PChnlGpDasRelaVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody PChnlGpDasRelaVO _pChnlGpDasRelaVO) {
		int i = pChnlGpDasRelaService.update(_pChnlGpDasRelaVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody PChnlGpDasRelaVO _PChnlGpDasRelaVO) {
		int i = pChnlGpDasRelaService.delete(_PChnlGpDasRelaVO);

		if (i > 0)
			return new HttpResult<String>(HttpResult.SUCCESS, "删除成功", null);
		else
			return new HttpResult<String>(HttpResult.ERROR, "删除失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody PChnlGpDasRelaVO _PChnlGpDasRelaVO) {
		PChnlGpDasRelaVO modelVo= pChnlGpDasRelaService.findByKey(_PChnlGpDasRelaVO);

		if (modelVo!=null)
			return new HttpResult<PChnlGpDasRelaVO>(HttpResult.SUCCESS, "获取成功", modelVo);
		else
			return new HttpResult<PChnlGpDasRelaVO>(HttpResult.ERROR, "获取失败", null);

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResult<?> findByWhere(@RequestBody PChnlGpDasRelaVO _PChnlGpDasRelaVO) {
		List<PChnlGpDasRelaVO> listVo= pChnlGpDasRelaService.findByWhere(_PChnlGpDasRelaVO);

		if (listVo!=null)
			return new HttpResult<List<PChnlGpDasRelaVO>>(HttpResult.SUCCESS, "查询成功", listVo);
		else
			return new HttpResult<List<PChnlGpDasRelaVO>>(HttpResult.ERROR, "查询失败", null);

	}
}
