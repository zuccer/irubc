package org.zucc.weixin.message.resp;

/**
 * ��Ƶmodel
 * 
 * @author haobo
 * @date 2014-09-11
 */
public class Video {
	// ý���ļ�id
	private String MediaId;
	// ����ͼ��ý��id
	private String ThumbMediaId;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
}
