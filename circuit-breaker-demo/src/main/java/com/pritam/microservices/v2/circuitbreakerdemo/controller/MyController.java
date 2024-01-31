package com.pritam.microservices.v2.circuitbreakerdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
public class MyController {
	
	private Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/myapi-1")
	@Bulkhead(name="myapi1")
	public String myApi1() {
		logger.info("====INSIDE MY API 1====");
		return "This is my Api 1";
	}
	
	@GetMapping("/myapi-2")
	public String myApi2() {
		logger.info("====INSIDE MY API 2====");
		return "This is my Api 2";
	}
}
