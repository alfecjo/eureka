package com.singular.servicec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.singular.servicec.client")
public class ServicecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicecApplication.class, args);
	}

}
