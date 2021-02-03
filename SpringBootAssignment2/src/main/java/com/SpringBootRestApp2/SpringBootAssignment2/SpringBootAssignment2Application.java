package com.SpringBootRestApp2.SpringBootAssignment2;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestClientException;

import com.SpringBootRestApp2.SpringBootAssignment2.controller.CommunicationController;

@SpringBootApplication
public class SpringBootAssignment2Application {

	public static void main(String[] args) throws RestClientException, IOException {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootAssignment2Application.class, args);
		
		CommunicationController communicationController=ctx.getBean(CommunicationController.class);
		communicationController.getFoodMenu();
	}
	
	public CommunicationController communicationController()
	{
		return new CommunicationController();
	}

}
