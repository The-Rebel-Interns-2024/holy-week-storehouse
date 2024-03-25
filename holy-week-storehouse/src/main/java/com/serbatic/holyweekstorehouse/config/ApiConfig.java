package com.serbatic.holyweekstorehouse.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
    @Bean
    public OpenAPI api(){
        return new OpenAPI().info(new Info()
                .title("Store house API REST")
                .version("1.0")
                .description("Storage microservice for Holy Week task"));
    }
}
