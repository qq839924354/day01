package com.itheima.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.itheima.xml.domain.SmsInfo;
import com.itheima.xml.service.SmsUtils;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		List<SmsInfo> smsInfos = new ArrayList<SmsInfo>();
		
		//模拟创建两个短信数据的对象.
		SmsInfo sms1 = new SmsInfo("你好啊  短信1", "5556", 1,9999);
		SmsInfo sms2 = new SmsInfo("你好啊  短信2", "5558", 1,8888);
		
		
		smsInfos.add(sms1);
		smsInfos.add(sms2);
		
		File file = new File(Environment.getExternalStorageDirectory(),"back.xml");
		try {
			SmsUtils.backUpSms(file, smsInfos);
			Toast.makeText(this, "备份短信成功", 0).show();
		} catch (Exception e) {
			e.printStackTrace();
			Toast.makeText(this, "备份短信失败", 0).show();
		}
		
		
	}



}
