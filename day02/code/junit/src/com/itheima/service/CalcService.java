package com.itheima.service;

import android.util.Log;

public class CalcService {
	private static final String tag = "CalcService";
	/**
	 * ��ӵ�ҵ�񷽷�
	 * @param x ��һ��int
	 * @param y �ڶ���int
	 * @return
	 */
	public int add(int x ,int y){
		Log.v(tag, "x="+x);
		Log.d(tag, "y="+y);
		int result = x+y;
		Log.i(tag,"result="+result);
		Log.w(tag,"result="+result);
		Log.e(tag,"result="+result);
		
		System.out.println("out result="+result);
		System.err.println("error result="+result);
		
		return result;
	}

	
	
}
