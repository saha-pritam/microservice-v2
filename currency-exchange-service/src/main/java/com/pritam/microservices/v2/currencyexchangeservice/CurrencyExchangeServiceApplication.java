package com.pritam.microservices.v2.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pritam.microservices.v2.currencyexchangeservice.model.ExchangeValue;
import com.pritam.microservices.v2.currencyexchangeservice.repository.ExchangeValueRepository;

@SpringBootApplication
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
		ExchangeValueRepository repository = context.getBean(ExchangeValueRepository.class);
		repository.save(new ExchangeValue(10001, "USD", "INR", 65));
		repository.save(new ExchangeValue(10002, "EUR", "INR", 75));
		repository.save(new ExchangeValue(10003, "AUD", "INR", 25));
	}

}
