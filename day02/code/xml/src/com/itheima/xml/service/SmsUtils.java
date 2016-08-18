package com.itheima.xml.service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.xmlpull.v1.XmlSerializer;

import android.util.Xml;

import com.itheima.xml.domain.SmsInfo;

public class SmsUtils {

	/**
	 * ���ű��ݵĹ��߷���
	 * @param file ���ű��ݵ��ĸ��ļ�����
	 * @param smsInfos Ҫ���ݵĶ��Ŷ���ļ���.
	 */
	public static void backUpSms(File file, List<SmsInfo> smsInfos) throws Exception{
		//xml�ļ������к���  ��������һ��xml�ļ�
		FileOutputStream fos = new FileOutputStream(file);
		//1.��ȡ��xml�����к���
		XmlSerializer serializer = Xml.newSerializer();
		//2.���л����ĳ�ʼ��
		serializer.setOutput(fos, "utf-8"); //�ļ��ı��뷽ʽ utf-8
		//3.����xml�ļ�
		serializer.startDocument("utf-8", true);
		serializer.startTag(null, "smss");
		
		//ѭ���İ����еĶ������ݶ�д�� xml�ļ�����
		for(SmsInfo info: smsInfos){
			serializer.startTag(null, "sms");
			serializer.attribute(null, "id", String.valueOf(info.getId()));
			
			serializer.startTag(null, "body");
			serializer.text(info.getBody());
			serializer.endTag(null, "body");
			
			serializer.startTag(null, "type");
			serializer.text(info.getType()+"");
			serializer.endTag(null, "type");
			
			serializer.startTag(null, "number");
			serializer.text(info.getNumber());
			serializer.endTag(null, "number");
			
			serializer.endTag(null, "sms");
		}
		serializer.endTag(null, "smss");
		serializer.endDocument();
		
		fos.flush();
		fos.close();
	}
}