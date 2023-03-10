package com.soturno.hexagonal.application.core.usecase;

import com.soturno.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.soturno.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.soturno.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

	private final FindCustomerByIdInputPort findCustomerByIdInputPort;
	
	private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;
	
	public DeleteCustomerByIdUseCase(
			FindCustomerByIdInputPort findCustomerByIdInputPort,
			DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {		
		this.findCustomerByIdInputPort = findCustomerByIdInputPort;
		this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
	}
	
	@Override
	public void delete(String id) {
		
		findCustomerByIdInputPort.find(id);
		deleteCustomerByIdOutputPort.delete(id);
	}
	
}
