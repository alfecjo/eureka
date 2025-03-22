package com.singular.servicea.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("app.serviceA", "Microservice-A")
               .withDetail("app.version", "1.0.0")
               .withDetail("app.description", "Descrição Service-A - personalizada da aplicação");
    }
}
