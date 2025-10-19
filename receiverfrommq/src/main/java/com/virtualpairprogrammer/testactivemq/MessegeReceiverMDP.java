package com.virtualpairprogrammer.testactivemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessegeReceiverMDP {
	
	@JmsListener(destination="positionqueue")
	public void processMessage(String message) {
			
		System.out.println(message);
	}
	

}
