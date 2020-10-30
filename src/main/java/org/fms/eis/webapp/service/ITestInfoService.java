
/**
 * 
 * Author : 
 * Date : 
 * Title : org.fms.eis.webapp.service.ITestInfoService.java
 *
**/
package org.fms.eis.webapp.service;

import org.fms.eis.webapp.vo.TestInfoVO;

import java.util.List;

public interface ITestInfoService {

	public int insert(TestInfoVO testInfoVO);

	public int update(TestInfoVO testInfoVO);

	public int delete(TestInfoVO testInfoVO);

	public TestInfoVO findByKey(TestInfoVO testInfoVO);

	public List<TestInfoVO> findByWhere(TestInfoVO testInfoVO);
}
