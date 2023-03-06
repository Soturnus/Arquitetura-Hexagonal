package com.soturno.hexagonal.application.ports.out;

import com.soturno.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
	
	void insert(Customer customer);
	
}
