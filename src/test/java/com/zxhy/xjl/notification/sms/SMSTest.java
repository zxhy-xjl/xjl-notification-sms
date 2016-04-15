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
		this.sms.sendMessage("18809507419", 120, "1234");
	}
}
