package com.challenge.phoneOrdering;

import lombok.Data;

import java.net.URL;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class PhoneOrder {
	private @Id @GeneratedValue Long id;
	private String name;
	private String surname;
	private String email;
	private Long[] phones;
	private Long price;
	
	public PhoneOrder(Long id, String name, String surname, String email, Long[] phones, Long price) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phones = phones;
		this.price = price;
	}


		
	PhoneOrder() {
		
	}
	
}
