package com.microservice.Admin.pojo;

public class Product {

	private int id;
	private String itemName;
	private String  design;
	private String size;
	private String price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String itemName, String design, String size, String price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.design = design;
		this.size = size;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
