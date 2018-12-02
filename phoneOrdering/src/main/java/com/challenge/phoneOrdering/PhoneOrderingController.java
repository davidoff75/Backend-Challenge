package com.challenge.phoneOrdering;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneOrderingController {

		private final PhoneOrderingRepository phoneOrderingRepo;
		
		PhoneOrderingController(PhoneOrderingRepository repository){
			this.phoneOrderingRepo=repository;
		}
		
		@GetMapping("/orders")
		List<PhoneOrder> all(){
			return phoneOrderingRepo.findAll();
		}
		
		@PostMapping("/orders")
		PhoneOrder newPhoneOrder(@RequestBody PhoneOrder phoneOrder) {
			return phoneOrderingRepo.save(phoneOrder);
		}
	
}
