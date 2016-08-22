package com.itheima.listdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.Base64;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MainActivity extends Activity {
	private ListView lv;
	public String tag = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv = (ListView) findViewById(R.id.lv);
		// ����listview��������.
		// ���� mvc�ķ�ʽ ���listview�ؼ�
		// model ����
		// view listview�Ŀؼ�
		// control ����

		// lv.setAdapter(new MyAdapter());

		// lv.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
		// R.id.tv_name, new String[] { "aaaa", "bbbb", "cccc", "ddddd" }));

		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		
		Map<String, String> item1 = new HashMap<String, String>();
		item1.put("name", "zhangsna");
		item1.put("number", "124245");
		
		Map<String, String> item2 = new HashMap<String, String>();
		item2.put("name", "lisi");
		item2.put("number", "4545");
		
		data.add(item1);
		data.add(item2);
		
		lv.setAdapter(new SimpleAdapter(this, data, R.layout.list_item,
				new String[] { "name", "number" }, new int[] { R.id.tv_name,
						R.id.tv_number }));
	}

	/**
	 * �Զ��������������
	 * 
	 * @author Administrator
	 * 
	 */
	private class MyAdapter extends BaseAdapter {

		/**
		 * ����listview�����ж����Ŀ.
		 */
		@Override
		public int getCount() {
			return 15;
		}

		/**
		 * ����ÿ��λ�ö�Ӧ��view����
		 */
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// ��������������˶��ٴ�?
			Log.i(tag, "POSITION:" + position);
			TextView tv = new TextView(MainActivity.this);
			tv.setTextSize(30);
			tv.setTextColor(Color.RED);
			tv.setText("���ǵ�" + position + "����Ŀ");
			return tv;
		}

		@Override
		public Object getItem(int position) {
			return null;
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}

	}

}