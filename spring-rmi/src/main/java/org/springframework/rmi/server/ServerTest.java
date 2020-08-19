package org.springframework.rmi.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerTest {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("rmi/server/applicationContext.xml");
	}
}
