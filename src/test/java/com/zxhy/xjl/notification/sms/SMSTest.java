package com.zxhy.xjl.notification.sms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @author  yangzaixiong
* 创建时间             2016年4月13日上午11:28:10
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-sms.xml"})
public class SMSTest {
	@Autowired
	private SMS sms;
	@Test
	public void send(){
		this.sms.send("18809507419", "门户网站，123456 是您本次身份校验码，5 分钟内有效．审批局工作人员绝不会向您索取此校验码，切勿告知他人．");
	}
}
