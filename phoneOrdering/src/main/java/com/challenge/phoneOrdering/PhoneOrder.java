package com.challenge.phoneOrdering;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.web.client.RestTemplate;


@Data
@Entity
public class PhoneOrder {
	private @Id @GeneratedValue Long id;
	private String name;
	private String surname;
	private String email;
	private ArrayList<Long> phones;
	private long price;
	
	private static String PHONE_SERVICE_URI="http://localhost:8000/phones";
	
	public PhoneOrder(String name, String surname, String email, ArrayList<Long> phones) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phones = phones;
		
	}

	public String getName() { 
		return this.name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Long> getPhones() {
		return phones;
	}

	public void setPhones(ArrayList<Long> phones) {
		this.phones = phones;
	}

	public long getPrice() {
		return price;
	}

	public void calcPrice() {
		price=0;
		Long phonePrice;
		RestTemplate restPhones= new RestTemplate();
		Iterator<Long> itrPhones= phones.iterator();
		while(itrPhones.hasNext()) {
			phonePrice=restPhones.getForObject(PHONE_SERVICE_URI+"/"+itrPhones.next()+"/price", Long.class);
			if (phonePrice == null)  {
				throw new ResourceNotFoundException("The phone id "+itrPhones+ " is not in the catalog");
			}
			else price=price+phonePrice;
		}
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "id:"+id+" name:"+name+" surname:"+surname+" email:"+email+" phones"+phones+" total price:"+ price;
	}
}
