/**
 * 测量点分钟电量
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.action.EMpEngyMin202009Action.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IEMpEngyMin202009Service;
import org.fms.eis.webapp.vo.EMpEngyMin202009VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("EMpEngyMin202009")
public class EMpEngyMin202009Action {

	@Autowired
	@Qualifier("EMpEngyMin202009ServiceImpl")
	private IEMpEngyMin202009Service eMpEngyMin202009Service;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody EMpEngyMin202009VO eMpEngyMin202009VO) {
		int i = eMpEngyMin202009Service.insert(eMpEngyMin202009VO);

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
	public HttpResult<?> update(@RequestBody EMpEngyMin202009VO eMpEngyMin202009VO) {
		int i = eMpEngyMin202009Service.update(eMpEngyMin202009VO);

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
	public HttpResult<?> delete(@RequestBody List<EMpEngyMin202009VO> deleteList) throws Exception{
        HttpResult httpResult = eMpEngyMin202009Service.deleteList(deleteList);
        return httpResult;
	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody EMpEngyMin202009VO eMpEngyMin202009VO) {
		EMpEngyMin202009VO modelVo= eMpEngyMin202009Service.findByKey(eMpEngyMin202009VO);

		if (modelVo!=null)
		{
			return new HttpResult<EMpEngyMin202009VO>(HttpResult.SUCCESS, "获取成功", modelVo);
        }
		else
       {
			return new HttpResult<EMpEngyMin202009VO>(HttpResult.ERROR, "未检索到相关数据!", null);
       }

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResultPagination<?> findByWhere(@RequestBody EMpEngyMin202009VO eMpEngyMin202009VO) {

		return new  HttpResultPagination(eMpEngyMin202009VO,eMpEngyMin202009Service.findByWhere(eMpEngyMin202009VO));
	}
}
