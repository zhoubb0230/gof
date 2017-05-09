package com.zbb.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Messager {

	@Autowired
	final MessageService service;
	
	public Messager(MessageService service){
		this.service = service;
	}
	
	public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
