package com.itheima.weather.domain;

public class Weather {
	private int wendu;
	private int wind;
	private String type;
	private int id;
	public int getWendu() {
		return wendu;
	}
	public void setWendu(int wendu) {
		this.wendu = wendu;
	}
	public int getWind() {
		return wind;
	}
	public void setWind(int wind) {
		this.wind = wind;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "天气信息 [温度=" + wendu + ", 风力=" + wind + "级 , 天气状况=" + type
				+ ", 未来第=" + id + "天]";
	}
	
	
}
