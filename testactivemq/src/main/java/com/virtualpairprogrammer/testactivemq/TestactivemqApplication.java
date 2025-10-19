package com.virtualpairprogrammer.testactivemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class TestactivemqApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TestactivemqApplication.class, args);

		JmsTemplate jmsTemplate = ctx.getBean(JmsTemplate.class);
		jmsTemplate.convertAndSend("positionqueue", "I am running again.");

	}

}
