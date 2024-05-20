package com.example.leadtech;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	@Bean
	OpenAPI customAPI() {
		return new OpenAPI().info(new Info()
				.title("Projeto Leadtech")
				.description("Aplicação Java com Spring Boot para gerenciamento de clientes e\r\n"
						+ "		produtos")
				.version("1.0.0")
				.license(new License().name("Leadtech 1.0").url("www.google.com")));
	}
	
}
