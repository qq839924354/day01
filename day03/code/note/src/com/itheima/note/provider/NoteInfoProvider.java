package com.itheima.note.provider;

import com.itheima.note.db.NoteSQLiteOpenHelper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class NoteInfoProvider extends ContentProvider {

	private static final int QUERY = 1;
	private static final int INSERT = 2;
	private static final int DELETE = 3;
	private static final int UPDATE = 4;

	// ����code �������uri��ƥ��ķ���ֵ
	// �ڵ�ǰӦ�ó�����ڲ� ����һ��·���ļ����
	private static UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
	private SQLiteDatabase db;

	static {
		// ����һ��ƥ�����
		// 1.�������һ��·�� com.itheima.note.noteprovider/query ��ѯ�Ĳ���
		matcher.addURI("com.itheima.note.noteprovider", "query", QUERY);
		matcher.addURI("com.itheima.note.noteprovider", "insert", INSERT);
		matcher.addURI("com.itheima.note.noteprovider", "delete", DELETE);
		matcher.addURI("com.itheima.note.noteprovider", "update", UPDATE);
	}

	@Override
	public boolean onCreate() {
		NoteSQLiteOpenHelper helper = new NoteSQLiteOpenHelper(getContext());
		db = helper.getWritableDatabase();
		return false;
	}

	/**
	 * �����ṩ�߱�¶�Ĳ�ѯ�ķ���.
	 */
	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		// 1.��Ҫ������ ,��� uri��·��.
		int code = matcher.match(uri);
		if (code == QUERY) {
			// ��ѯ����
			NoteSQLiteOpenHelper helper = new NoteSQLiteOpenHelper(getContext());
			SQLiteDatabase db = helper.getReadableDatabase();
			Cursor cursor = db.rawQuery("select * from account", null);
			return cursor;
		} else {
			throw new IllegalArgumentException("·�����ܱ�ʶ��,�Ҳ���ʶ��...");
		}
	}

	@Override
	public String getType(Uri uri) {
		int code = matcher.match(uri);
		if (code == QUERY) {
			//����һ������
			return "vnd.android.cursor.item/note";
			//���ض�������
			//return "vnd.android.cursor.dir/note"
		}
	
		
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		int code = matcher.match(uri);
		if (code == INSERT) {
			db.insert("account", null, values);
		} else {
			throw new IllegalArgumentException("·�����ܱ�ʶ��,�Ҳ���ʶ��...");
		}

		return null;
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		int code = matcher.match(uri);
		if (code == DELETE) {
			db.delete("account", selection, selectionArgs);
		} else {
			throw new IllegalArgumentException("·�����ܱ�ʶ��,�Ҳ���ʶ��...");
		}

		return 0;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		int code = matcher.match(uri);
		if (code == UPDATE) {
			db.update("account", values, selection, selectionArgs);
		} else {
			throw new IllegalArgumentException("·�����ܱ�ʶ��,�Ҳ���ʶ��...");
		}
		return 0;
	}

}