package com.challenge.phoneApp;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PhoneController {

		private final PhoneRepository phoneRepository;
		
		PhoneController(PhoneRepository repository){
			this.phoneRepository=repository;
		}
		
		@GetMapping("/phones")
		List<Phone> all(){
			return phoneRepository.findAll();
		}
		
		@PostMapping("/phones")
		Phone newPhone(@RequestBody Phone phone) {
			return phoneRepository.save(phone);
		}
}
