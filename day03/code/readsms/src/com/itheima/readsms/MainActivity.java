package com.itheima.readsms;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv_content);
	}

	public void click(View view){
		//1.���������ṩ��  �м��� ��ȡ�û��Ķ�������.
		ContentResolver resolver  = getContentResolver();
		Uri uri = Uri.parse("content://sms/"); //���ݷ��� �����������еĶ��ŵ�·��
		Cursor cursor = resolver.query(uri, new String[]{"address","date","body","type"}, null, null, null);
		StringBuffer sb = new StringBuffer();
		while(cursor.moveToNext()){
			String address =cursor.getString(0);
			String date  = cursor.getString(1);
			String body = cursor.getString(2);
			String type = cursor.getString(3);
			System.out.println(address+"--"+date+"---"+body+"---"+type);
			sb.append(address+"--"+date+"---"+body+"---"+type);
			sb.append("\n");
		}
		cursor.close();
		tv.setText(sb.toString());
	}
}