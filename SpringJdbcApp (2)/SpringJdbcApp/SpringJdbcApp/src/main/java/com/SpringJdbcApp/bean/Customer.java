package com.SpringJdbcApp.bean;
/*	Id INT AUTO_INCREMENT PRIMARY KEY,
	FirstName VARCHAR(100) NOT NULL,
	MiddleName VARCHAR(100) NULL,
	LastName VARCHAR(100) NULL,
	EmailAddress VARCHAR(500),
	PASSWORD VARCHAR(50));*/
public class Customer {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String firstname;
	private String middlename;
	private String lastname;
	private String emailaddress;
	private String password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", emailaddress=" + emailaddress + ", password=" + password + "]";
	}
}
