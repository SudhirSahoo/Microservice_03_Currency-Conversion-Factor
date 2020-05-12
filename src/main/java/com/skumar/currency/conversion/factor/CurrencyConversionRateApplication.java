package com.skumar.currency.conversion.factor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyConversionRateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionRateApplication.class, args);
	}

}
