package org.zucc.weixin.menu;

/**
 * click���͵İ�ť
 * 
 * @author haobo
 * @date 2014-10-14
 */
public class ClickButton extends Button {
	private String type;
	private String key;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}