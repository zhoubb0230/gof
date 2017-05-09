package com.zbb.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	
	@Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
              return "Hello World!";
            }
        };
    }

	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		Messager messager = context.getBean(Messager.class);
		messager.printMessage();
	}
}
