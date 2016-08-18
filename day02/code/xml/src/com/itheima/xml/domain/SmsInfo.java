package com.itheima.xml.domain;

/**
 * 短信的业务bean
 * @author Administrator
 *
 */
public class SmsInfo {
	private String body;
	private String number;
	private int type;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SmsInfo() {
	}

	public SmsInfo(String body, String number, int type,long id) {
		this.body = body;
		this.number = number;
		this.type = type;
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
