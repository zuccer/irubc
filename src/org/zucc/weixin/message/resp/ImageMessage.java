package org.zucc.weixin.message.resp;

/**
 * ͼƬ��Ϣ
 * 
 * @author haobo
 * @date 2014-09-11
 */
public class ImageMessage extends BaseMessage {
	// ͼƬ
	private Image Image;

	public Image getImage() {
		return Image;
	}

	public void setImage(Image image) {
		Image = image;
	}
}
