package com.itheima.other;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	}
	public void query(View view){
		//得到内容提供者的解析器  中间人
		ContentResolver resolver = getContentResolver();
		Uri uri = Uri.parse("content://com.itheima.note.noteprovider/queryaa");
		Cursor cursor = resolver.query(uri, null, null, null, null);
		while(cursor.moveToNext()){
			String name = cursor.getString(cursor.getColumnIndex("name"));
			int id = cursor.getInt(cursor.getColumnIndex("id"));
			float money = cursor.getFloat(cursor.getColumnIndex("money"));
			System.out.println("id="+id+",name="+name+",money="+money);
		}
		cursor.close();
	}
	public void insert(View view){
		ContentResolver resolver = getContentResolver();
		Uri uri = Uri.parse("content://com.itheima.note.noteprovider/insert");
		ContentValues values = new ContentValues();
		values.put("name", "买洗头膏");
		values.put("money", 22.58f);
		resolver.insert(uri, values);
	}
	public void update(View view){
		ContentResolver resolver = getContentResolver();
		Uri uri = Uri.parse("content://com.itheima.note.noteprovider/update");
		ContentValues values = new ContentValues();
		values.put("name", "买洗头膏");
		values.put("money", 42.58f);
		resolver.update(uri, values, "name=?", new String[]{"买洗头膏"});
	}
	public void delete(View view){
		ContentResolver resolver = getContentResolver();
		Uri uri = Uri.parse("content://com.itheima.note.noteprovider/delete");
		resolver.delete(uri, "name=?", new String[]{"买洗头膏"});
	}
}
