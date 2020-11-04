/**
 * 测量点日冻结电能示值
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.action.EMpBmDay2020Action.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpBmDay2020Service;
import org.fms.eis.webapp.vo.EMpBmDay2020VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("EMpBmDay2020")
public class EMpBmDay2020Action {

	@Autowired
	@Qualifier("EMpBmDay2020ServiceImpl")
	private IEMpBmDay2020Service eMpBmDay2020Service;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody EMpBmDay2020VO eMpBmDay2020VO) {
		int i = eMpBmDay2020Service.insert(eMpBmDay2020VO);

		if (i > 0)
		{
			return new HttpResult<String>(HttpResult.SUCCESS, "新增成功", null);
		}
		else
		{
			return new HttpResult<String>(HttpResult.ERROR, "新增失败", null);
		}

	}

	@ResponseBody
	@PostMapping(params = "method=update")
	public HttpResult<?> update(@RequestBody EMpBmDay2020VO eMpBmDay2020VO) {
		int i = eMpBmDay2020Service.update(eMpBmDay2020VO);

		if (i > 0)
		{
			return new HttpResult<String>(HttpResult.SUCCESS, "编辑成功", null);
		}
		else
		{
			return new HttpResult<String>(HttpResult.ERROR, "编辑失败", null);
		}

	}

	@ResponseBody
	@PostMapping(params = "method=delete")
	public HttpResult<?> delete(@RequestBody List<EMpBmDay2020VO> deleteList) throws Exception{
        HttpResult httpResult = eMpBmDay2020Service.deleteList(deleteList);
        return httpResult;
	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody EMpBmDay2020VO eMpBmDay2020VO) {
		EMpBmDay2020VO modelVo= eMpBmDay2020Service.findByKey(eMpBmDay2020VO);

		if (modelVo!=null)
		{
			return new HttpResult<EMpBmDay2020VO>(HttpResult.SUCCESS, "获取成功", modelVo);
        }
		else
       {
			return new HttpResult<EMpBmDay2020VO>(HttpResult.ERROR, "未检索到相关数据!", null);
       }

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResultPagination<?> findByWhere(@RequestBody EMpBmDay2020VO eMpBmDay2020VO) {

		return new  HttpResultPagination(eMpBmDay2020VO,eMpBmDay2020Service.findByWhere(eMpBmDay2020VO));
	}
}
