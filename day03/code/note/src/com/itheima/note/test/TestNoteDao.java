package com.itheima.note.test;

import java.util.List;

import android.test.AndroidTestCase;

import com.itheima.note.db.dao.NoteDao;
import com.itheima.note.domain.NoteBean;

public class TestNoteDao extends AndroidTestCase {
	NoteDao dao	; 
	
	
	/**
	 * 测试框架初始化完毕后  初始化数据的操作
	 */
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		dao = new NoteDao(getContext());
	}
	/**
	 * 测试框架执行完毕后  擦屁股的操作
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() throws Exception {
	
		for (int i = 0; i < 20; i++) {
			dao.add("3月"+i+"号打酱油", 2.58f+i);
		}
	}

	public void testupdate() throws Exception{
		//NoteDao dao = new NoteDao(getContext());
		dao.update(2, 9.88f);
	}
	
	public void testDelete() throws Exception{
		//NoteDao dao = new NoteDao(getContext());
		dao.delete(1);
	}
	
	
	public void testFindAll() throws Exception{
		//NoteDao dao = new NoteDao(getContext());
		List<NoteBean> beans = dao.findAll();
		for(NoteBean bean:beans){
			System.out.println(bean.toString());
		}
	}
	
	public void testTrans() throws Exception{
		dao.testTransaction();
	}
}
