package com.pritam.microservices.v2.circuitbreakerdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class MyController {
	
	private Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/myapi-1")
	@Retry(name="myapi1")
	public String myApi1() {
		logger.info("====INSIDE MY API 1====");
		throw new RuntimeException("Exception at my api 1");
	}
	
	@GetMapping("/myapi-2")
	public String myApi2() {
		logger.info("====INSIDE MY API 2====");
		throw new RuntimeException("Exception at my api 2");
	}
}
