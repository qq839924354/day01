package com.itheima.note.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class NoteSQLiteOpenHelper extends SQLiteOpenHelper {

	private static final String TAG = "NoteSQLiteOpenHelper";
	/**
	 * context ������ name ���ݿ������ cursorfactory �α깤�� һ������null Ĭ���α깤�� version ���ݿ�İ汾
	 * �汾�Ŵ�1��ʼ��
	 * 
	 * @param context
	 */
	public NoteSQLiteOpenHelper(Context context) {
		super(context, "note.db", null, 3);
	}

	/**
	 * oncreate ���� �������ݿ��һ������ʱ����Ǳ����� �ʺ������ݿ���ṹ�ĳ�ʼ��
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		Log.i(TAG, "oncreate ������������...");
		db.execSQL("create table account (id integer primary key autoincrement , name  varchar(20), money varchar(20) )");
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		Log.i(TAG,"onupdate ������������ ,����������������������ݿ���ṹ�Ĳ���");
		//db.execSQL(sql);
	}

}