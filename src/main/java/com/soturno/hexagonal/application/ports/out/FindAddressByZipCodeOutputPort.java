package com.soturno.hexagonal.application.ports.out;

import com.soturno.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
	
	Address find(String zipCode);
	
}
