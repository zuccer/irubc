package org.zucc.weixin.message.req;

/**
 * ͼƬ��Ϣ
 * 
 * @author haobo
 * @date 2014-09-11
 */
public class ImageMessage extends BaseMessage {
	// ͼƬ����
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}
