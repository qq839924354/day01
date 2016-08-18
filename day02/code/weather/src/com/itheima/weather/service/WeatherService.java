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
	 * 解析获取天气信息
	 * 
	 * @param is
	 *            天气信息xml文件对应的流
	 * @return
	 * @throws Exception
	 */
	public static List<Weather> getWeather(InputStream is) throws Exception {
		// 解析 天气的xml文件.
		// 1.获取到一个xml文件的解析器.
		XmlPullParser parser = Xml.newPullParser();
		// 2.初始化解析器.
		parser.setInput(is, "utf-8");
		// 3.解析xml文件.
		// 得到当前解析条目的节点类型.
		int eventType = parser.getEventType(); // 第一次被调用的时候 定位在xml开头
		List<Weather> weatherInfos = null;
		Weather weatherInfo = null;
		while (eventType != XmlPullParser.END_DOCUMENT) {// 需要 不停的让 解析器解析下一个节点
			switch (eventType) {
			case XmlPullParser.START_TAG:
				if ("weather".equals(parser.getName())) {
					// 发现开始节点 为weather 创建集合
					weatherInfos = new ArrayList<Weather>();
				} else if ("day".equals(parser.getName())) {
					// 发现一个新的日期 对应的天气
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
			eventType = parser.next();// 控制解析器 解析下一个节点
		}
		is.close();
		return weatherInfos;

	}
}
