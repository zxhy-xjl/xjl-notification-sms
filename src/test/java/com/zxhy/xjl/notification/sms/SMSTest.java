package com.zxhy.xjl.notification.sms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-sms.xml"})
public class SMSTest {
	@Autowired
	private SMS sms;
	@Test
	public void send(){
		this.sms.send("138", "测试信息");
	}
}
