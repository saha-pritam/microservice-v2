package com.pritam.microservices.v2.currencycalculationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v2.currencycalculationservice.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retriveCurrencyConversionBean(@PathVariable String from, @PathVariable String to, @PathVariable double quantity) {
		return new CurrencyConversionBean(1,from,to,1,quantity,8100);
	}
}
