package com.singular.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.singular.serviceb.client.ServiceAClient;

@RestController
public class ServiceBRestController {

    @Autowired
    private ServiceAClient serviceAClient;

    @GetMapping("/helloServiceA")
    public String helloFromServiceA() {
        return serviceAClient.helloWorld();
    }
}