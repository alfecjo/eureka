package com.singular.servicec.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceb", url = "http://localhost:8082")
public interface ServiceBClient {

    @GetMapping("/helloServiceA")
    String helloWorld();
}