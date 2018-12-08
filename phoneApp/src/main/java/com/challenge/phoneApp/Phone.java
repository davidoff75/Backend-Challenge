package com.challenge.phoneApp;

import lombok.Data;

import java.net.URL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
 class Phone {

	private @Id @GeneratedValue Long id;
	private String name;
	private String description;
	private URL image;
	private long price;
	
	 Phone(String name, String description, URL image, long price) {
		this.name=name;
		this.description=description;
		this.image=image;
		this.price=price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public URL getImage() {
		return image;
	}

	public void setImage(URL image) {
		this.image = image;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}
