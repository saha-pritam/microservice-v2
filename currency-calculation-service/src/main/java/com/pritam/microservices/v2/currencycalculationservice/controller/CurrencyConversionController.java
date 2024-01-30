package com.pritam.microservices.v2.currencycalculationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v2.currencycalculationservice.model.CurrencyConversionBean;
import com.pritam.microservices.v2.currencycalculationservice.proxy.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retriveCurrencyConversionBean(@PathVariable String from, @PathVariable String to, @PathVariable double quantity) {
		CurrencyConversionBean currencyConversionBean = currencyExchangeServiceProxy.retriveExchangeValue(from, to);
		if(currencyConversionBean!=null) {
			currencyConversionBean.setQuantity(quantity);
			currencyConversionBean.setTotalCalculatedAmount();
		}
		return currencyConversionBean;
	}
}
