package com.rest.webservices.RestWebServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestWebServicesApplication {
	
	@RequestMapping("/")
	public String hello() {
		return "hello\n";
	}

	public static void main(String[] args) {
		SpringApplication.run(RestWebServicesApplication.class, args);
	}

}

