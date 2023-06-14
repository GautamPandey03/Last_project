package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brand=" + brand + ", price=" + price + ", description="
				+ description + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String name;
	private String brand;
	private String price;
	private String description;
	private String image;
	public Product(int id, String name, String brand, String price, String description,String image) {
		super();
		this.pid = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.description = description;
		this.image=image;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return pid;
	}
	public void setId(int id) {
		this.pid = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
