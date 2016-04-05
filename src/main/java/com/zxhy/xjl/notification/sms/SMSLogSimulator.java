package com.zxhy.xjl.notification.sms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
@Service
public class SMSLogSimulator implements SMS{
	Log log = LogFactory.getLog(SMSLogSimulator.class);
	public boolean send(String phone, String content) {
		log.info("往手机号码(" + phone + ") 发送短信(" + content + ") 成功");
		return true;
	};
}
