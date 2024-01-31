package com.pritam.microservices.v2.circuitbreakerdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class MyController {
	
	private Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/myapi-1")
	//@Retry(name="myapi1",fallbackMethod = "onFailure")
	@CircuitBreaker(name="myapi1",fallbackMethod = "onFailure")
	public String myApi1() {
		logger.info("====INSIDE MY API 1====");
		throw new ArithmeticException("Exception at my api 1");
	}
	
	@GetMapping("/myapi-2")
	public String myApi2() {
		RestTemplate restTemplate = new RestTemplate();
		for(;;) {
			restTemplate.getForEntity("http://localhost:8080/myapi-1", String.class);
		}
			
	}
	
	private String onFailure(RuntimeException re) {
		return "Fallback method for runtime exception was executed";
	}
	
	private String onFailure(ArithmeticException ae) {
		return "Fallback method for arithmetic exception was executed";
	}
}
