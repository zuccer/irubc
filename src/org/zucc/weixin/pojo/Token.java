package org.zucc.weixin.pojo;

/**
 * ƾ֤
 * 
 * @author haobo
 * @date 2014-10-17
 */
public class Token {
	// �ӿڷ���ƾ֤
	private String accessToken;
	// ƾ֤��Ч�ڣ���λ����
	private int expiresIn;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}
}