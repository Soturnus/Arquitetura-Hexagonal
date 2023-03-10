package com.soturno.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soturno.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.soturno.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.soturno.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.soturno.hexagonal.application.core.usecase.UpdateCustomerUseCase;

@Configuration
public class UpdateCustomerConfig {

	@Bean
	public UpdateCustomerUseCase updateCustomerUseCase (
			FindCustomerByIdUseCase findCustomerByIdUseCase,
			FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
			UpdateCustomerAdapter updateCustomerAdapter
			) {
		return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
	}
}
