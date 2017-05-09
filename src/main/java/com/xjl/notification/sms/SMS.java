package com.xjl.notification.sms;
/**
 * 短信发送和管理类
 * @author leasonlive
 *
 */
public interface SMS {
	/**
	 * 向某个手机号码发送短信
	 * @param phone 手机号码
	 * @param content 短信内容
	 * @return
	 */
	public boolean sendSMS(String phone, String content);
	/**
	 * 向某个手机发送验证码
	 * @param phone 手机号码
	 * @param verifyCode 验证码
	 * @return
	 */
	public boolean sendVerifyCode(String phone,String verifyCode);
}
