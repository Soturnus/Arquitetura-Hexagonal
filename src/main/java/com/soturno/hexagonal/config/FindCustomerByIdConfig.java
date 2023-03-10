package com.soturno.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soturno.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.soturno.hexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class FindCustomerByIdConfig {

	@Bean
	public FindCustomerByIdUseCase findCustomerByIdUseCase(
			FindCustomerByIdAdapter findCustomerByIdAdapter
			) {
		return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
	}
	
}
