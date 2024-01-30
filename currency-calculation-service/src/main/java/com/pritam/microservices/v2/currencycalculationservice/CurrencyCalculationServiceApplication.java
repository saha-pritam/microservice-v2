package com.pritam.microservices.v2.currencycalculationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.pritam.microservices.v2.currencycalculationservice")
public class CurrencyCalculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCalculationServiceApplication.class, args);
	}

}
