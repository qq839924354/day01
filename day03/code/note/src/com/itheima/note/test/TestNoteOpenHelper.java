package com.itheima.note.test;

import com.itheima.note.db.NoteSQLiteOpenHelper;

import android.test.AndroidTestCase;

public class TestNoteOpenHelper extends AndroidTestCase {
	
	
	public void testCreateDB() throws Exception{
		//getContext ������� �ǻ�ȡ�� ���Կ�ܵ�һ������� ģ��ļٵ�������.
		NoteSQLiteOpenHelper helper = new NoteSQLiteOpenHelper(this.getContext());
		//ע�� ֻ��ִ���� getWritableDatabase  ����  getreadabledatabase() ���ݿ�Żᱻ����
		helper.getWritableDatabase();
	}
}