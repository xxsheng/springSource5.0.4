package org.springframework.messaging;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import javax.jms.Message;

public class Receiver {
	public static void main(String[] args) throws JMSException {
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
		Connection connection = activeMQConnectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("my-queue");
		MessageConsumer consumer = session.createConsumer(destination);
		int i = 0;
		while (i<3) {
			i++;
			TextMessage receive = (TextMessage) consumer.receive();
			session.commit();
			System.out.println("收到消息"+ receive.getText());
		}
		session.close();
		connection.close();
	}
}
