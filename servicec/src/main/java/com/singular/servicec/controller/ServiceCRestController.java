package com.singular.servicec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.singular.servicec.client.ServiceAClient;
import com.singular.servicec.client.ServiceBClient;

@RestController
public class ServiceCRestController {

    @Autowired
    private ServiceAClient serviceAClient;

    @Autowired
    private ServiceBClient serviceBClient;

    @GetMapping("/helloServiceA")
    public String helloFromServiceA() {
        return serviceAClient.helloWorld();
    }

    @GetMapping("/helloServiceB")
    public String helloFromServiceB() {
        return serviceBClient.helloWorld();
    }
}