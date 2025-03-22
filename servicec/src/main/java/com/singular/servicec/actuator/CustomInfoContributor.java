package com.singular.servicec.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("app.serviceA", "Microservice-C")
               .withDetail("app.version", "1.0.0")
               .withDetail("app.description", "Descrição Service-C - personalizada da aplicação");
    }
}
