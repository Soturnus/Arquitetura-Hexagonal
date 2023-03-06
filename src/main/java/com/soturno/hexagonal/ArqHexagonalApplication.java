package com.soturno.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ArqHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArqHexagonalApplication.class, args);
	}

}
