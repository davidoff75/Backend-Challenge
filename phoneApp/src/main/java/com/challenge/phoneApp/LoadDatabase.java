package com.challenge.phoneApp;

import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Slf4j
public class LoadDatabase {
	@Bean
	CommandLineRunner initDatabase(PhoneRepository repository){
		return args -> {
			System.out.println("Preloading "+ repository.save(new Phone("Moto G","Android 5.0 1Gb", new URL("http://www.motorola.com/motoG"), 124)));
			//System.out.println("Hola Mundo");
			System.out.println("Preloading "+ repository.save(new Phone("iPhone X","6inches,8Gb", new URL("http://www.apple.com/iPHoneX"), 609)));
		};
	}
}
