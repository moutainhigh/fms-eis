/**
 * 电量考核单元分钟电量表
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.action.ESumEngyMin2020Action.java
 *
**/
package org.fms.eis.webapp.action;

import com.riozenc.titanTool.spring.web.http.HttpResult;
import com.riozenc.titanTool.spring.web.http.HttpResultPagination;
import org.fms.eis.webapp.service.IESumEngyMin2020Service;
import org.fms.eis.webapp.vo.ESumEngyMin2020VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@ControllerAdvice
@RequestMapping("ESumEngyMin2020")
public class ESumEngyMin2020Action {

	@Autowired
	@Qualifier("ESumEngyMin2020ServiceImpl")
	private IESumEngyMin2020Service eSumEngyMin2020Service;

	@ResponseBody
	@PostMapping(params = "method=insert")
	public HttpResult<?> insert(@RequestBody ESumEngyMin2020VO eSumEngyMin2020VO) {
		int i = eSumEngyMin2020Service.insert(eSumEngyMin2020VO);

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
	public HttpResult<?> update(@RequestBody ESumEngyMin2020VO eSumEngyMin2020VO) {
		int i = eSumEngyMin2020Service.update(eSumEngyMin2020VO);

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
	public HttpResult<?> delete(@RequestBody List<ESumEngyMin2020VO> deleteList) throws Exception{
        HttpResult httpResult = eSumEngyMin2020Service.deleteList(deleteList);
        return httpResult;
	}

	@ResponseBody
	@PostMapping(params = "method=findByKey")
	public HttpResult<?> findByKey(@RequestBody ESumEngyMin2020VO eSumEngyMin2020VO) {
		ESumEngyMin2020VO modelVo= eSumEngyMin2020Service.findByKey(eSumEngyMin2020VO);

		if (modelVo!=null)
		{
			return new HttpResult<ESumEngyMin2020VO>(HttpResult.SUCCESS, "获取成功", modelVo);
        }
		else
       {
			return new HttpResult<ESumEngyMin2020VO>(HttpResult.ERROR, "未检索到相关数据!", null);
       }

	}

	@ResponseBody
	@PostMapping(params = "method=findByWhere")
	public HttpResultPagination<?> findByWhere(@RequestBody ESumEngyMin2020VO eSumEngyMin2020VO) {

		return new  HttpResultPagination(eSumEngyMin2020VO,eSumEngyMin2020Service.findByWhere(eSumEngyMin2020VO));
	}
}
