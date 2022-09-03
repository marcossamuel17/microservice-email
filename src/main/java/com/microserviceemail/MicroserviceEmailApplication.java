package com.microserviceemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "")
@ComponentScan(basePackages = {"com.microserviceemail.controllers"})
@ComponentScan(basePackages = {"com.microserviceemail.services"})
@SpringBootApplication
public class MicroserviceEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEmailApplication.class, args);
	}

}
