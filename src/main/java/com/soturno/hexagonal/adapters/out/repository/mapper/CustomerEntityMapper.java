package com.soturno.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.soturno.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.soturno.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

	CustomerEntity toCustomerEntity(Customer customer);
}
