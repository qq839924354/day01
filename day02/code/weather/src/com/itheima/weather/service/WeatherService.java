package com.itheima.weather.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.util.Xml;

import com.itheima.weather.domain.Weather;

public class WeatherService {
	/**
	 * ������ȡ������Ϣ
	 * 
	 * @param is
	 *            ������Ϣxml�ļ���Ӧ����
	 * @return
	 * @throws Exception
	 */
	public static List<Weather> getWeather(InputStream is) throws Exception {
		// ���� ������xml�ļ�.
		// 1.��ȡ��һ��xml�ļ��Ľ�����.
		XmlPullParser parser = Xml.newPullParser();
		// 2.��ʼ��������.
		parser.setInput(is, "utf-8");
		// 3.����xml�ļ�.
		// �õ���ǰ������Ŀ�Ľڵ�����.
		int eventType = parser.getEventType(); // ��һ�α����õ�ʱ�� ��λ��xml��ͷ
		List<Weather> weatherInfos = null;
		Weather weatherInfo = null;
		while (eventType != XmlPullParser.END_DOCUMENT) {// ��Ҫ ��ͣ���� ������������һ���ڵ�
			switch (eventType) {
			case XmlPullParser.START_TAG:
				if ("weather".equals(parser.getName())) {
					// ���ֿ�ʼ�ڵ� Ϊweather ��������
					weatherInfos = new ArrayList<Weather>();
				} else if ("day".equals(parser.getName())) {
					// ����һ���µ����� ��Ӧ������
					weatherInfo = new Weather();
					String id = parser.getAttributeValue(0);
					weatherInfo.setId(Integer.parseInt(id));
				} else if ("wendu".equals(parser.getName())) {
					String wendu = parser.nextText();
					weatherInfo.setWendu(Integer.parseInt(wendu));
				} else if ("wind".equals(parser.getName())) {
					String wind = parser.nextText();
					weatherInfo.setWind(Integer.parseInt(wind));
				} else if ("type".equals(parser.getName())) {
					String type = parser.nextText();
					weatherInfo.setType(type);
				}

				break;

			case XmlPullParser.END_TAG:
				if ("day".equals(parser.getName())) {
					weatherInfos.add(weatherInfo);
				}
				break;
			}
			eventType = parser.next();// ���ƽ����� ������һ���ڵ�
		}
		is.close();
		return weatherInfos;

	}
}