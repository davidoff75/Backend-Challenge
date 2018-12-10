package com.challenge.phoneAppCatalog;

import lombok.Data;

import java.net.URL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Entity
public class Phone {

	private @Id @GeneratedValue Long id;
	private @NotNull String name;
	private String description;
	private URL image;
	private @Min(1) long price;
	
	Phone () {
		
	}
	
	public Phone(String name, String description, URL image, long price) {
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
