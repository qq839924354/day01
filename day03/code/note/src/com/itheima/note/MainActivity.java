package com.itheima.note;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.itheima.note.db.dao.NoteDao2;
import com.itheima.note.domain.NoteBean;

public class MainActivity extends Activity {
	private ListView lv;
	private NoteDao2 dao;
	private List<NoteBean> noteBeans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv  = (ListView) findViewById(R.id.lv);
        dao = new NoteDao2(this);
        noteBeans = dao.findAll();
        
        
        lv.setAdapter(new MyAdapter());
        
    }

    private class MyAdapter extends BaseAdapter{
		@Override
		public int getCount() {
			return noteBeans.size();
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			//利用打气筒  把xml文件 转化成 view对象.
			View view = View.inflate(getApplicationContext(), R.layout.list_item, null);
			TextView tv_id  = (TextView) view.findViewById(R.id.tv_id);
			TextView tv_money  = (TextView)view.findViewById(R.id.tv_money);
			TextView tv_name  = (TextView)view.findViewById(R.id.tv_name);
			NoteBean bean = noteBeans.get(position);
			tv_id.setText("id:"+bean.getId());
			tv_money.setText("$:"+bean.getMoney());
			tv_name.setText(bean.getName());
			return view;
		}
		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

    }
    
    
    
    
}
