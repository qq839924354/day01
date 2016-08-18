package com.itheima.testmode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	private RadioGroup rg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rg = (RadioGroup) findViewById(R.id.rg);
	}

	public void generateFile(View view) {
		switch (rg.getCheckedRadioButtonId()) {
		case R.id.rb_private:
			savePrivate();
			break;
		case R.id.rb_readable:
			saveReadble();
			break;
		case R.id.rb_writeable:
			savewriteable();
			break;
		case R.id.rb_all:
			saveAll();
			break;
		case R.id.rb_sd:
			saveSD();
			break;
			
		case R.id.rb_append:
			saveAppend();
			break;
		}

	}

	private void saveAppend() {
		try {
			FileOutputStream fos = this.openFileOutput("append.txt",
					MODE_APPEND);
			fos.write("我是追加模式生成的文件".getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void saveSD() {
		try {
			File file = new File(Environment.getExternalStorageDirectory(),
					"sd.txt");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write("我是sd卡的文件".getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void saveAll() {
		try {
			FileOutputStream fos = this.openFileOutput("all.txt",
					MODE_WORLD_WRITEABLE | MODE_WORLD_READABLE);
			fos.write("我是全局可读可写文件".getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void savewriteable() {
		try {
			FileOutputStream fos = this.openFileOutput("writeable.txt",
					MODE_WORLD_WRITEABLE);
			fos.write("我是全局可写文件".getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void saveReadble() {
		try {
			FileOutputStream fos = this.openFileOutput("readable.txt",
					MODE_WORLD_READABLE);
			fos.write("我是全局可读的文件".getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void savePrivate() {
		// File file = new File(this.getFilesDir(),"1.txt");
		// FileOutputStream
		try {
			FileOutputStream fos = this.openFileOutput("private.txt",
					MODE_PRIVATE);
			fos.write("我是私有的文件".getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void writeappend(View view){
		
		try {
			FileOutputStream fos = this.openFileOutput("append.txt",
					MODE_APPEND);
			fos.write(".... 我是新添加到的内容".getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void writecache(View view){
		try {
			File file = new File(this.getCacheDir(),"temp.txt");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write("我是缓存".getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
