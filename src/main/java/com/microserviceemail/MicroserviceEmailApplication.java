package com.microserviceemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "models")
@SpringBootApplication
public class MicroserviceEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEmailApplication.class, args);
	}

}
