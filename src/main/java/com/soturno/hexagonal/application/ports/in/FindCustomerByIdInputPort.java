package com.soturno.hexagonal.application.ports.in;

import com.soturno.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

	Customer find(String id);
	
}
