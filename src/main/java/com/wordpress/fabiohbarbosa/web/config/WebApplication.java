package com.wordpress.fabiohbarbosa.web.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Web Application Using Spring Boot
 * To run application, run method main or mvn spring-boot:run
 */
@ComponentScan("com.wordpress.fabiohbarbosa")
@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }
}