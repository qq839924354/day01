package com.itheima.note.db.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itheima.note.db.NoteSQLiteOpenHelper;
import com.itheima.note.domain.NoteBean;

public class NoteDao2 {
	private NoteSQLiteOpenHelper helper;

	public NoteDao2(Context context) {
		helper = new NoteSQLiteOpenHelper(context);
	}

	/**
	 * 添加一条账目信息 到数据库
	 * 
	 * @param name
	 *            花销的名称
	 * @param money
	 *            金额
	 * 
	 * @return true 插入成功 false 失败
	 */
	public boolean add(String name, float money) {
		SQLiteDatabase db = helper.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("name", name);
		values.put("money", money);
		long rawid = db.insert("account", null, values);
		db.close();
		if (rawid > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean delete(int id) {
		SQLiteDatabase db = helper.getWritableDatabase();
		int result = db.delete("account", "id=?", new String[] { id + "" });
		db.close();
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean update(int id, float newmoney) {
		SQLiteDatabase db = helper.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("id", id);
		values.put("money", newmoney);
		int result = db.update("account", values, "id=?", new String[] { id
				+ "" });
		db.close();
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 返回数据库所有的条目
	 * 
	 * @return
	 */
	public List<NoteBean> findAll() {
		// 得到可读的数据库
		SQLiteDatabase db = helper.getReadableDatabase();
		List<NoteBean> noteBeans = new ArrayList<NoteBean>();
		Cursor cursor = db.query("account", new String[] { "id", "name",
				"money" }, null, null, null, null, null);
		while (cursor.moveToNext()) {
			int id = cursor.getInt(cursor.getColumnIndex("id"));
			String name = cursor.getString(cursor.getColumnIndex("name"));
			float money = cursor.getFloat(cursor.getColumnIndex("money"));
			NoteBean bean = new NoteBean(id, money, name);
			noteBeans.add(bean);
			bean = null;
		}
		db.close();
		return noteBeans;

	}
}
