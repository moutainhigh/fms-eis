/**
 * 测量点日冻结需量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.action.EMpXlDay2020Action.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpXlDay2020Service;
import org.fms.eis.webapp.vo.EMpXlDay2020VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("EMpXlDay2020")
public class EMpXlDay2020Action {

	@Autowired
	@Qualifier("EMpXlDay2020ServiceImpl")
	private IEMpXlDay2020Service eMpXlDay2020Service;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody EMpXlDay2020VO eMpXlDay2020VO) {
		int i = eMpXlDay2020Service.insert(eMpXlDay2020VO);

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
	public HttpResult<?> update(@RequestBody EMpXlDay2020VO eMpXlDay2020VO) {
		int i = eMpXlDay2020Service.update(eMpXlDay2020VO);

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
	public HttpResult<?> delete(@RequestBody List<EMpXlDay2020VO> deleteList) throws Exception{
        HttpResult httpResult = eMpXlDay2020Service.deleteList(deleteList);
        return httpResult;
	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody EMpXlDay2020VO eMpXlDay2020VO) {
		EMpXlDay2020VO modelVo= eMpXlDay2020Service.findByKey(eMpXlDay2020VO);

		if (modelVo!=null)
		{
			return new HttpResult<EMpXlDay2020VO>(HttpResult.SUCCESS, "获取成功", modelVo);
        }
		else
       {
			return new HttpResult<EMpXlDay2020VO>(HttpResult.ERROR, "未检索到相关数据!", null);
       }

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResultPagination<?> findByWhere(@RequestBody EMpXlDay2020VO eMpXlDay2020VO) {

		return new  HttpResultPagination(eMpXlDay2020VO,eMpXlDay2020Service.findByWhere(eMpXlDay2020VO));
	}
}
