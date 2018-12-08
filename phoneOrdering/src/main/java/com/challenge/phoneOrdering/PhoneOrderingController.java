package com.challenge.phoneOrdering;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PhoneOrderingController {

		private final PhoneOrderingRepository phoneOrderingRepo;
		Logger logger =LoggerFactory.getLogger(PhoneOrderingController.class);
		PhoneOrderingController(PhoneOrderingRepository repository){
			this.phoneOrderingRepo=repository;
		}
		
		@GetMapping("/orders")
		List<PhoneOrder> all(){
			return phoneOrderingRepo.findAll();
		}
		
		@PostMapping("/orders")
		PhoneOrder newPhoneOrder(@RequestBody PhoneOrder phoneOrder) {
			phoneOrder.calcPrice();
			logger.info("Getting richer! Order created:"+phoneOrder.toString());
			return phoneOrderingRepo.save(phoneOrder);
		}
	
}
