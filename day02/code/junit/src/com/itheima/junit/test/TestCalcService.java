package com.itheima.junit.test;

import com.itheima.service.CalcService;

import android.test.AndroidTestCase;

public class TestCalcService extends AndroidTestCase {

	/**
	 * ���еĲ��Է���  Ӧ�ð��쳣�׸����Կ��
	 * @throws Exception
	 */
	public void testAdd() throws Exception{
		CalcService calcService = new CalcService();
		int result = calcService.add(3, 5);
		assertEquals(8, result);
	}
}
