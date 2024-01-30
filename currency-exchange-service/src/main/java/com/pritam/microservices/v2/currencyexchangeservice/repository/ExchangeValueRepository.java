package com.pritam.microservices.v2.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pritam.microservices.v2.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {
	public ExchangeValue findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);
}
