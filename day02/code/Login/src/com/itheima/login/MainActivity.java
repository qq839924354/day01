package com.itheima.login;

import java.util.Map;

import com.itheima.login.service.SaveService;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";
	private EditText et_name;
	private EditText et_password;
	private CheckBox cb_remember;
	private RadioGroup rg_save_location;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et_name = (EditText) findViewById(R.id.et_name);
		et_password = (EditText) findViewById(R.id.et_password);
		cb_remember = (CheckBox) findViewById(R.id.cb_remember);
		rg_save_location = (RadioGroup) findViewById(R.id.rg_save_location);

		// ��� rom�ļ������Ƿ� �� ������Ϣ
		/*try {
			String result = SaveService.readFromRom(this);
			String[] infos = result.split(":");
			et_name.setText(infos[0]);
			et_password.setText(infos[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		//��ȡsp���������
		
		Map<String, String> map = SaveService.readFromSP(this);
		et_name.setText(map.get("name"));
		et_password.setText(map.get("password"));
		
	}

	public void login(View view) {
		String name = et_name.getText().toString().trim();
		String password = et_password.getText().toString().trim();
		if (TextUtils.isEmpty(name) || TextUtils.isEmpty(password)) {
			Toast.makeText(this, R.string.error_msg, Toast.LENGTH_SHORT).show();
			return;
		}
		if (cb_remember.isChecked()) {
			Log.i(TAG, "��ס����");
			Log.d(TAG, "NAME=" + name);
			Log.d(TAG, "PASSWORD=" + password);
			int radiobuttonId = rg_save_location.getCheckedRadioButtonId();
			switch (radiobuttonId) {
			case R.id.rb_rom:
				try {
					SaveService.saveToRom(this, name, password);
					Toast.makeText(this, "����rom�û������� �ɹ�", Toast.LENGTH_LONG)
							.show();
				} catch (Exception e) {
					e.printStackTrace();
					Toast.makeText(this, "����rom�û������� ʧ��", Toast.LENGTH_LONG)
							.show();
				}
				break;

			case R.id.rb_sd:
				if (Environment.MEDIA_MOUNTED.equals(Environment
						.getExternalStorageState())) {
					try {
						SaveService.saveTOSD(name, password);
						Toast.makeText(this, "����sd�û������� �ɹ�", Toast.LENGTH_LONG)
								.show();
					} catch (Exception e) {
						e.printStackTrace();
						Toast.makeText(this, "����sd�û������� ʧ��", Toast.LENGTH_LONG)
								.show();
					}
				}else{
					Toast.makeText(this, "sd�������� ,����sd��״̬", 0).show();
				}
				break;
				
			case R.id.rb_sp:
				SaveService.saveTOSP(this, name, password);
				Toast.makeText(this, "���浽sp���", 0).show();
				break;
			}

		} else {
			Log.i(TAG, "����Ҫ��ס����");
		}

	}

}