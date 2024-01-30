package com.pritam.microservices.v2.currencycalculationservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pritam.microservices.v2.currencycalculationservice.model.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retriveCurrencyConversionBean(@PathVariable String from, @PathVariable String to, @PathVariable double quantity) {
		Map<String,String> uriVariables = new HashMap<String,String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,uriVariables);
		CurrencyConversionBean currencyConversionBean = responseEntity.getBody();
		if(currencyConversionBean!=null) {
			currencyConversionBean.setQuantity(quantity);
			currencyConversionBean.setTotalCalculatedAmount();
		}
		return currencyConversionBean;
	}
}
