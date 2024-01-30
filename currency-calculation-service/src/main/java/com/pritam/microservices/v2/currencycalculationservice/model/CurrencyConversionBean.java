package com.pritam.microservices.v2.currencycalculationservice.model;

public class CurrencyConversionBean {
	private int id;
	private String fromCurrency;
	private String toCurrency;
	private double conversionMultiple;
	private double quantity;
	private double totalCalculatedAmount;
	private int port;

	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyConversionBean(int id, String fromCurrency, String toCurrency, double conversionMultiple,
			double quantity, int port) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.port = port;
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount() {
		this.totalCalculatedAmount = this.quantity * this.conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
