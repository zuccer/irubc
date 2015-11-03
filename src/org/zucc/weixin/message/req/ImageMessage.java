package org.zucc.weixin.message.req;

/**
 * Í¼Æ¬ÏûÏ¢
 * 
 * @author haobo
 * @date 2014-09-11
 */
public class ImageMessage extends BaseMessage {
	// Í¼Æ¬Á´½Ó
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}
