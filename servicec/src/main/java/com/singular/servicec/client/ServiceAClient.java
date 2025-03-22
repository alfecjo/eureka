package com.singular.servicec.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicea", url = "http://localhost:8081")
public interface ServiceAClient {

    @GetMapping("/helloWorld")
    String helloWorld();
}