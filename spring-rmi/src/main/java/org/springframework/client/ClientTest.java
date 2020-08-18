package org.springframework.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.rmi.xxq.service.HelloRMIService;

public class ClientTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("client/clientApplicationContext.xml");
		HelloRMIService myClient = classPathXmlApplicationContext.getBean("myClient", HelloRMIService.class);
		System.out.println(myClient.getAdd(1, 2));
	}

}
