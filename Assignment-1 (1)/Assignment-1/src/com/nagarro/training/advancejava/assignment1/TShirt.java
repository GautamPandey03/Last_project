package com.nagarro.training.advancejava.assignment1;


class TSHIRT {
	private String id ;
	private String name ;
	private String colour ;
	private String gender ;
	private String size ;
	private float price ;
	private float rating ;
	private String availability ;

	public TSHIRT(String id, String name, String colour, String gender, String size,float price, float rating,
			String availability) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.rating = rating;
		this.availability = availability;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public void showAttributes() {
		
		System.out.println(" Name:"+name+" ID:"+id+" Colour:"+colour+" Gender:"+gender+" Size:"+size+" Price:"+price+" Rating:"+rating+" Availability:"+availability);
		
		}
	
	



	
}
