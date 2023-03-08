package com.soturno.hexagonal.adapters.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soturno.hexagonal.adapters.out.repository.CustomerRepository;
import com.soturno.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.soturno.hexagonal.application.core.domain.Customer;
import com.soturno.hexagonal.application.ports.out.InsertCustomerOutputPort;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerEntityMapper customerEntityMapper;
	
	@Override
	public void insert(Customer customer) {
		
		var customerEntity = customerEntityMapper.toCustomerEntity(customer);
		customerRepository.save(customerEntity);
	}

}
