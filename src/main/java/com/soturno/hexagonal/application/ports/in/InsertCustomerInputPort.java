package com.soturno.hexagonal.application.ports.in;

import com.soturno.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
	
	void insert(Customer customer, String zipCode);

}
