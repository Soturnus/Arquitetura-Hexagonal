package com.soturno.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soturno.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.soturno.hexagonal.adapters.out.InsertCustomerAdapter;
import com.soturno.hexagonal.application.core.usecase.InsertCustomerUseCase;

@Configuration
public class InsertCustomerConfig {

	@Bean
	public InsertCustomerUseCase insertCustomerUseCase(
			FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
			InsertCustomerAdapter insertCustomerAdapter
			) {
		return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
	}
	
}
