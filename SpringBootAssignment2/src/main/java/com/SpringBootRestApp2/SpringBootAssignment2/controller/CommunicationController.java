package com.SpringBootRestApp2.SpringBootAssignment2.controller;

import java.io.IOException;
import org.springframework.http.HttpHeaders;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class CommunicationController {
	
	@GetMapping("/FoodMenu")
	public String getFoodMenu() throws RestClientException, IOException
	{
		String baseURL="localhost:8080/getData/getAllFoodMenu";
		RestTemplate restTemplate=new RestTemplate();
		
		ResponseEntity<String> response=null;
		try
		{
			response=restTemplate.exchange(baseURL, HttpMethod.GET,getHeaders(),String.class);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(response.getBody());
		return response.getBody().toString();
	}
	
	
	private static HttpEntity<?> getHeaders() throws IOException
	{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Acccept",MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}

}
