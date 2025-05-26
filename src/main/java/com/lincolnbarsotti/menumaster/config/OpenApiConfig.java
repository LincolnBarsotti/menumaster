package com.lincolnbarsotti.menumaster.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Info info = new Info()
                .title("Menumaster API")
                .version("1.0")
                .description("The Restaurant Management System is an integrated " +
                        "platform that enables food establishments to efficiently " +
                        "manage their operations while providing customers with a seamless" +
                        " digital experience to browse menus, place online orders, and leave reviews.")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"));

        info.addExtension("x-contacts", List.of(
                Map.of("name", "Lincoln", "email", "lincoln@example.com", "url", "https://linkedin.com/in/lincoln"),
                Map.of("name", "Rene", "email", "rene@example.com", "url", "https://linkedin.com/in/rene")
        ));

        return new OpenAPI().info(info);
    }
}
