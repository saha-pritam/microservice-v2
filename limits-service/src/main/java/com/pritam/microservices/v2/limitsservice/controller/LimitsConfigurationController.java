package com.pritam.microservices.v2.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v2.limitsservice.component.Configuration;
import com.pritam.microservices.v2.limitsservice.model.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration() {
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
}
