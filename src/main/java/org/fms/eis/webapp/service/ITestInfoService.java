
/**
 * Author : chizf
 * Date : 2020年10月22日 上午9:59:37
 * Title : org.fms.eis.webapp.service.ITestInfoService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.TestInfoVO;

import java.util.List;

public interface ITestInfoService {

	public int insert(TestInfoVO modelVO);

	public int update(TestInfoVO modelVO);

	public int delete(TestInfoVO modelVO);

	public TestInfoVO findByKey(TestInfoVO modelVO);

	public List<TestInfoVO> findByWhere(TestInfoVO modelVO);
}
