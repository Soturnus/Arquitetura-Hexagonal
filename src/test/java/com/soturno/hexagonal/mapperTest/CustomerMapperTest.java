//package com.soturno.hexagonal.mapperTest;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.soturno.hexagonal.adapters.in.controller.mapper.CustomerMapper;
//import com.soturno.hexagonal.adapters.in.controller.response.CustomerResponse;
//import com.soturno.hexagonal.application.core.domain.Address;
//import com.soturno.hexagonal.application.core.domain.Customer;
//
//public class CustomerMapperTest {
//
//	
//	@Autowired 
//	private CustomerMapper customerMapper;
//	
//	@Test
//	public void givenCustomerResponsetoCustomer_thenCorrect() {
//		Address ad = new Address();
//		ad.setCity("jp");
//		ad.setState("pb");
//		ad.setStreet("lg");
//		
//	    Customer entity = new Customer();
//	    entity.setId("1");
//	    entity.setName("Rivas");
//	    entity.setAddress(ad);
//	    entity.setCpf("10449090485");
//	    entity.setIsValidCpf(true);
//
//	    CustomerResponse customerResponse = new CustomerResponse();
//	    		
//	    customerResponse = customerMapper.toCustomerResponse(entity);
//	    
//	    assertThat(customerResponse.getAddress().equals(entity.getAddress()))
//	    assertThat(customerResponse.getName()).isEqualTo(entity.getName());
//	    assertThat(customerResponse.getCpf()).isEqualTo(entity.getCpf());
//	    assertThat(customerResponse.getIsValidCpf()).isEqualTo(entity.getIsValidCpf());
//	    
//	}
//
//}
