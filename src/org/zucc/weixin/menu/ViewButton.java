package org.zucc.weixin.menu;

/**
 * view���͵İ�ť
 * 
 * @author haobo
 * @date 2014-10-14
 */
public class ViewButton extends Button {
	private String type;
	private String url;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}