package org.zucc.weixin.message.resp;

/**
 * ������Ϣ
 * 
 * @author haobo
 * @date 2014-09-11
 */
public class VoiceMessage extends BaseMessage {
	// ����
	private Voice Voice;

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}
}
