package com.itheima.junit.test;

import com.itheima.service.CalcService;

import android.test.AndroidTestCase;

public class TestCalcService extends AndroidTestCase {

	/**
	 * 所有的测试方法  应该把异常抛给测试框架
	 * @throws Exception
	 */
	public void testAdd() throws Exception{
		CalcService calcService = new CalcService();
		int result = calcService.add(3, 5);
		assertEquals(8, result);
	}
}
