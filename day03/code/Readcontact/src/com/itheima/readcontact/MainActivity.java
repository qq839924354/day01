package com.itheima.readcontact;

import android.app.Activity;
import android.content.ContentResolver;
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

	public void click(View view) {
		ContentResolver resolver = getContentResolver();
		// raw_contact ����uri
		Uri uri = Uri.parse("content://com.android.contacts/raw_contacts");
		// data ����uri
		Uri dataUri = Uri.parse("content://com.android.contacts/data");
		Cursor cursor = resolver.query(uri, new String[] { "contact_id" },
				null, null, null);
		while (cursor.moveToNext()) {
			String id = cursor.getString(0);
			if (id != null) {
				Cursor dataCursor = resolver.query(dataUri, new String[] {
						"data1", "mimetype" }, "raw_contact_id=?",
						new String[] { id }, null);
				while (dataCursor.moveToNext()) {
					String data = dataCursor.getString(0);
					String mimetype = dataCursor.getString(1);
					System.out.println("data:" + data);
					System.out.println("mimetype:" + mimetype);

				}
				dataCursor.close();
				System.out.println("----------");
			}
		}
		cursor.close();
	}

}
