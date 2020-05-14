package com.skumar.currency.conversion.factor.controller;

public class ConversionFactor {

	private Long id;
	private String currency;
	private String country;	
	private Integer conversionFactor;
	
	public ConversionFactor() {
		super();
	}


	public ConversionFactor(Long id, String currency, String country, Integer conversionFactor) {
		super();
		this.id = id;
		this.currency = currency;
		this.country = country;
		this.conversionFactor = conversionFactor;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(Integer conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	
	
}
