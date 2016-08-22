package com.itheima.insertsms;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void click(View view){
		ContentResolver resolver = getContentResolver();
		Uri uri = Uri.parse("content://sms/");
		ContentValues values = new ContentValues();
		values.put("address", "95533");
		values.put("type", "1");
		values.put("body", "公安局给您的建设银行赚了100,000,000.00");
		values.put("date",System.currentTimeMillis());
		resolver.insert(uri, values);
		
	}

}
