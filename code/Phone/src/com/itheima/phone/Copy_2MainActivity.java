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
	//1.����ť����һ������¼�
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //����activity��ʾ������
        setContentView(R.layout.activity_main);
        //�ؼ����� ֻ������һ��
        et_number = (EditText) findViewById(R.id.et_number);
        //2.��ѯ�������ϵ� button 
        Button bt_dail = (Button) this.findViewById(R.id.btn_dail);
        
        // ���������ڲ���ķ�ʽ  ʵ�ֵ���¼�
        bt_dail.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//����ť�������ʱ��  ��ȡ�绰����
				String number = et_number.getText().toString();
				//���Ⲧ������绰.
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_CALL);
				//����Ҫ����ĺ���
				intent.setData(Uri.parse("tel:"+number));
				//�򿪲��ŵĽ���
				startActivity(intent);
				
			}
		});
       
    }
    

}