package com.pritam.microservices.v2.currencyexchangeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v2.currencyexchangeservice.model.ExchangeValue;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		List<ExchangeValue> list = List.of(
				new ExchangeValue(10001, "USD", "INR", 65,
						Integer.parseInt(environment.getProperty("local.server.port"))),
				new ExchangeValue(10002, "EUR", "INR", 75,
						Integer.parseInt(environment.getProperty("local.server.port"))),
				new ExchangeValue(10003, "AUD", "INR", 25,
						Integer.parseInt(environment.getProperty("local.server.port"))));

		return list.stream().filter(exchangeValue -> exchangeValue.getFromCurrency().equals(from)
				&& exchangeValue.getToCurrency().equals(to)).findFirst().orElse(null);
	}
}
