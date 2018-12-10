package com.challenge.phoneAppCatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mangofactory.swagger.plugin.EnableSwagger;

@SpringBootApplication
@EnableSwagger
public class PhoneAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneAppApplication.class, args);
	}
}
