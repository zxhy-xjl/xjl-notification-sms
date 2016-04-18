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
	/**
	 * 这个方法不赞成使用，请使用上面的方法，所有的短信内容都在业务中进行拼装，而不是在这里拼装
	 * @deprecated 请使用send方法
	 * @param tel
	 * @param time
	 * @param code
	 * @return
	 */
	//public int sendMessage(String tel, int time, String code);
}
