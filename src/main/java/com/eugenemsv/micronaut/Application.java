package com.eugenemsv.micronaut;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Micronaut 2 demo",
                version = "0.1",
                description = "Movie API"
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}
