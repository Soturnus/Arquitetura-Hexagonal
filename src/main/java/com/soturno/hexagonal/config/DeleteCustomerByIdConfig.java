package com.soturno.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soturno.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.soturno.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.soturno.hexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class DeleteCustomerByIdConfig {

	@Bean
	public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
			FindCustomerByIdUseCase findCustomerByIdAUseCase,
			DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
			) {
		return new DeleteCustomerByIdUseCase(findCustomerByIdAUseCase, deleteCustomerByIdAdapter);
	}
	
}
