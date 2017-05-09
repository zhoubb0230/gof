package zbb.spring;

import org.springframework.stereotype.Component;

@Component
public class Message {

	final MessageService service;
	
	public Message(MessageService service){
		this.service = service;
	}
	
	public void printMessage() {
        System.out.println(this.service.getMessage());
    }

}
