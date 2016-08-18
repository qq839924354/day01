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
	 * �������ݵ��ֻ�rom���ļ�����.
	 * @param context Ӧ�ó���������� �ṩ����
	 * @param name �û���
	 * @param password ����
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
	 * ��rom��ȡ�û���������Ϣ
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
	 * �������ݵ�SD��
	 * @param name �û���
	 * @param password ����
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
	 * ����Ӧ�ó������� ��sharedpreference
	 * @param context ������
	 * @param name ����
	 * @param password ����
	 */
	public static void saveTOSP (Context context, String name, String password){
		//��ȡϵͳ��һ��sharedpreference�ļ�  ���ֽ� sp
		SharedPreferences sp = context.getSharedPreferences("sp", Context.MODE_WORLD_READABLE|Context.MODE_WORLD_WRITEABLE);
		//����һ���༭�� ���Ա༭ sp
		Editor editor = sp.edit();
		editor.putString("name", name);
		editor.putString("password", password);
		editor.putBoolean("boolean", false);
		editor.putInt("int", 8888);
		editor.putFloat("float",3.14159f);
		//ע��:���� commit �ύ ���ݵ��ļ�.
		editor.commit();
		//editor.clear();
	}
	
	/**
	 * ��ȡϵͳsharepreference���������
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
