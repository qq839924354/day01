package com.itheima.phone;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Copy_2MainActivity extends Activity {
	private EditText et_number;
	//1.给按钮设置一个点击事件
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置activity显示的内容
        setContentView(R.layout.activity_main);
        //控件查找 只查找了一次
        et_number = (EditText) findViewById(R.id.et_number);
        //2.查询到界面上的 button 
        Button bt_dail = (Button) this.findViewById(R.id.btn_dail);
        
        // 采用匿名内部类的方式  实现点击事件
        bt_dail.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//当按钮被点击的时候  获取电话号码
				String number = et_number.getText().toString();
				//向外拨打这个电话.
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_CALL);
				//设置要拨打的号码
				intent.setData(Uri.parse("tel:"+number));
				//打开拨号的界面
				startActivity(intent);
				
			}
		});
       
    }
    

}
