package com.pritam.microservices.v2.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v2.limitsservice.model.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration() {
		return new LimitConfiguration(1, 100);
	}
}
