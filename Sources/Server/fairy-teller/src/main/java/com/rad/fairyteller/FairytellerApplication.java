package com.rad.fairyteller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

//@EnableAutoConfiguration
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FairytellerApplication {
	public static void main(String[] args) {
		SpringApplication.run(FairytellerApplication.class, args);
	}
}