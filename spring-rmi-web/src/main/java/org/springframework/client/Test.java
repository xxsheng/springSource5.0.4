package org.springframework.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.server.httpinvoker.HttpInvokerTest;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-client.xml");
		HttpInvokerTest remoteService = classPathXmlApplicationContext.getBean("remoteService", HttpInvokerTest.class);

		String dddd = remoteService.getTestPo("dddd");
		System.out.println(dddd);
	}
}
