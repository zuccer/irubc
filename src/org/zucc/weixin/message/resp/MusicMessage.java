package org.zucc.weixin.message.resp;

/**
 * ������Ϣ
 * 
 * @author haobo
 * @date 2014-09-11
 */
public class MusicMessage extends BaseMessage {
	// ����
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}
}
