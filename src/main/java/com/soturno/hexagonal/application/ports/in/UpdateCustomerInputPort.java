package com.soturno.hexagonal.application.ports.in;

import com.soturno.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

	void update(Customer customer, String zipCode);
	
}
