package com.challenge.phoneApp;

import java.util.List;

import javax.servlet.UnavailableException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		
		@GetMapping("/phones/{id}")
		Phone single(@PathVariable Long id) throws UnavailableException {
			return phoneRepository.findById(id).orElseThrow(() -> new UnavailableException("FALLO") );
		}
		
		@GetMapping("/phones/{id}/price")
		long phonePrice(@PathVariable Long id) throws UnavailableException {
			return phoneRepository.findById(id).orElseThrow(() -> new UnavailableException("FALLO")).getPrice();
		}
		
		@PostMapping("/phones")
		Phone newPhone(@RequestBody Phone phone) {
			return phoneRepository.save(phone);
		}
}
