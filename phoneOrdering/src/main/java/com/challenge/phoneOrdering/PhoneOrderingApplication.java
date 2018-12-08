package com.challenge.phoneOrdering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhoneOrderingApplication {

	private static final Logger log= LoggerFactory.getLogger(PhoneOrderingApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PhoneOrderingApplication.class, args);
	}
}
