package com.soturno.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import com.soturno.hexagonal.adapters.out.client.response.AddressResponse;
import com.soturno.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

	Address toAddress(AddressResponse addressResponse);
}
