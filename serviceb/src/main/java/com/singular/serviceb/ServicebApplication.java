package com.singular.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.singular.serviceb.client")
public class ServicebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicebApplication.class, args);
	}

}
