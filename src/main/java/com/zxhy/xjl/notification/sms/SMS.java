package com.zxhy.xjl.notification.sms;
/**
 * 短信发送和管理类
 * @author leasonlive
 *
 */
public interface SMS {
	/**
	 * 向某个手机号码发送短信
	 * @param phone
	 * @param content
	 * @return
	 */
	public boolean send(String phone, String content);
}
