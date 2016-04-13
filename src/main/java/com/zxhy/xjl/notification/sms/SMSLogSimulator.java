package com.zxhy.xjl.notification.sms;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
@Service
public class SMSLogSimulator implements SMS{
	Log log = LogFactory.getLog(SMSLogSimulator.class);
	public boolean send(String phone, String content) {
		log.info("往手机号码(" + phone + ") 发送短信(" + content + ") 成功");
		return true;
	}
	public int sendMessage(String tel, int time, String code) {
		String url = "/sms/Api/Send.do";
		String host = "nx.ums86.com";
		HttpClient httpClient = new HttpClient();
		// httpClient.getHostConfiguration().setProxy("10.45.40.148",8080);
		httpClient.getHostConfiguration().setHost(host, 8899, "http");
		PostMethod post = new PostMethod(url);
		post.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=gbk");
		NameValuePair[] param = { new NameValuePair("SpCode", "218784"), new NameValuePair("LoginName", "yc_spj"),
				new NameValuePair("Password", "spj123"),
				new NameValuePair("MessageContent",
						"门户网站，" + code + "是您本次身份校验码，" + time + "分钟内有效．审批局工作人员绝不会向您索取此校验码，切勿告知他人．"),
				new NameValuePair("UserNumber", tel) };
		post.setRequestBody(param);
		post.releaseConnection();
		try {
			httpClient.executeMethod(post);

			String result = new String(post.getResponseBodyAsString().getBytes("gbk"));
			result = result.substring(result.indexOf("=") + 1, result.indexOf("&"));

			log.debug("调用短信平台正常 ");

			if (Integer.parseInt(result) == 0) {
				return 0;// 发送成功
			} else {
				return 1;// 发送失败
			}
		} catch (HttpException e) {
			e.printStackTrace();
			log.debug("调用短信平台异常 ");
			return 1;// 发送失败
		} catch (IOException e) {
			e.printStackTrace();
			log.debug("调用短信平台异常 ");
			return 1;// 发送失败
		}

	}
}
