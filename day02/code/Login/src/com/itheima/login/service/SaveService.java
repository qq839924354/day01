package com.itheima.login.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Environment;

import com.itheima.login.utils.StreamTools;

public class SaveService {
	/**
	 * 保存数据到手机rom的文件里面.
	 * @param context 应用程序的上下文 提供环境
	 * @param name 用户名
	 * @param password 密码
	 * @throws Exception
	 */
	public static void saveToRom(Context context, String name , String password) throws Exception{
		//File file = new File("/data/data/com.itheima.login/files/pwd.txt");
		File file = new File(context.getFilesDir(),"pwd.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String txt = name+":"+password;
		fos.write(txt.getBytes());
		fos.flush();
		fos.close();
	}
	/**
	 * 从rom读取用户的密码信息
	 * @param context
	 * @return
	 */
	public static String readFromRom(Context context) throws Exception{
		File file = new File(context.getFilesDir(),"pwd.txt");
		FileInputStream fis = new FileInputStream(file);
		String result = StreamTools.readFromStream(fis);
		return result;
	}
	
	/**
	 * 保存数据到SD卡
	 * @param name 用户名
	 * @param password 密码
	 * @throws Exception
	 */
	public static void saveTOSD(String name ,String password) throws Exception{
		File file = new File(Environment.getExternalStorageDirectory(),"pwd.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String txt = name+":"+password;
		fos.write(txt.getBytes());
		fos.flush();
		fos.close();
	}
	
	/**
	 * 保存应用程序数据 到sharedpreference
	 * @param context 上下文
	 * @param name 姓名
	 * @param password 密码
	 */
	public static void saveTOSP (Context context, String name, String password){
		//获取系统的一个sharedpreference文件  名字叫 sp
		SharedPreferences sp = context.getSharedPreferences("sp", Context.MODE_WORLD_READABLE|Context.MODE_WORLD_WRITEABLE);
		//创建一个编辑器 可以编辑 sp
		Editor editor = sp.edit();
		editor.putString("name", name);
		editor.putString("password", password);
		editor.putBoolean("boolean", false);
		editor.putInt("int", 8888);
		editor.putFloat("float",3.14159f);
		//注意:调用 commit 提交 数据到文件.
		editor.commit();
		//editor.clear();
	}
	
	/**
	 * 获取系统sharepreference里面的数据
	 * @param context
	 * @return
	 */
	public static Map<String,String> readFromSP(Context context){
		Map<String,String> map = new HashMap<String, String>();
		SharedPreferences sp = context.getSharedPreferences("sp", Context.MODE_PRIVATE);
		String name = sp.getString("name", "defaultname");
		String password = sp.getString("password", "password");
		map.put("name", name);
		map.put("password", password);
		return map;
	}
	
	
}
