package org.zucc.weixin.message.resp;

/**
 * ��Ƶ��Ϣ
 * 
 * @author haobo
 * @date 2014-09-11
 */
public class VideoMessage extends BaseMessage {
	// ��Ƶ
	private Video Video;

	public Video getVideo() {
		return Video;
	}

	public void setVideo(Video video) {
		Video = video;
	}
}
