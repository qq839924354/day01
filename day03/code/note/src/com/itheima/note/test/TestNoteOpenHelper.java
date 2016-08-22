package com.itheima.note.test;

import com.itheima.note.db.NoteSQLiteOpenHelper;

import android.test.AndroidTestCase;

public class TestNoteOpenHelper extends AndroidTestCase {
	
	
	public void testCreateDB() throws Exception{
		//getContext 这个方法 是获取到 测试框架的一个虚拟的 模拟的假的上下文.
		NoteSQLiteOpenHelper helper = new NoteSQLiteOpenHelper(this.getContext());
		//注意 只有执行了 getWritableDatabase  或者  getreadabledatabase() 数据库才会被创建
		helper.getWritableDatabase();
	}
}
