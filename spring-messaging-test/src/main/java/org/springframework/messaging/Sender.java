package org.springframework.messaging;

import javax.jms.*;

public class Sender {
	public static void main(String[] args) throws JMSException, InterruptedException {
		// 8161是后台管理系统，61616是给java用的tcp端口
		org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory = new org.apache.activemq.ActiveMQConnectionFactory();
		javax.jms.Connection connection = activeMQConnectionFactory.createConnection();
		Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
		Queue queue = session.createQueue("my-queue");
		MessageProducer producer = session.createProducer(queue);
		for (int i = 0; i < 3; i++) {
			TextMessage message = session.createTextMessage("大家好这是个消息");
			Thread.sleep(1000);
			// 通过消费生成者发出消息
			producer.send(message);
		}
		session.commit();
		session.close();
		connection.close();
	}
}
