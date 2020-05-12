package com.skumar.currency.conversion.factor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionFactorController {

	
	@GetMapping(path = "/conversionfactor/{currency}")
	public ConversionFactor getCurrencyConversionFactor(@PathVariable String currency)
	{
		ConversionFactor conversionFactor  = new ConversionFactor(new Long(1), "USD", "USA", 5.0);
		
		return conversionFactor;
	}
	
}
