package com.pritam.microservices.v2.currencyexchangeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ExchangeValue")
public class ExchangeValue {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="fromCurrency")
	private String fromCurrency;
	@Column(name="toCurrency")
	private String toCurrency;
	@Column(name="conversionMultiple")
	private double conversionMultiple;
	@Transient
	private int port;
	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExchangeValue(int id, String fromCurrency, String toCurrency, double conversionMultiple) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.conversionMultiple = conversionMultiple;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public double getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
