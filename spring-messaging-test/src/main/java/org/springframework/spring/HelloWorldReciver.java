package org.springframework.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;

public class HelloWorldReciver {
	public static void main(String[] args) throws JMSException {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		JmsTemplate jmsTemplate = classPathXmlApplicationContext.getBean("jmsTemplate", JmsTemplate.class);
		Destination destination = (Destination) classPathXmlApplicationContext.getBean("destination");
		jmsTemplate.send(destination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage("大家好，这是个测试");
			}
		});
		TextMessage receive = (TextMessage) jmsTemplate.receive(destination);
		System.out.println(receive.getText());
	}
}
