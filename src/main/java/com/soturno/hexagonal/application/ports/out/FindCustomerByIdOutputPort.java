package com.soturno.hexagonal.application.ports.out;

import java.util.Optional;

import com.soturno.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdOutputPort {

	Optional<Customer> find(String id); 
	
}
