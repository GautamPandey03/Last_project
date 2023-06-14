package com.nagarro.librarysystem.Entity;

import java.sql.Date;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookDetail")
public class Book {
	@Id
	int id;
	String  bookName;
	String author;
	Date date;
	
	public Book(int id, String bookName, String author, Date date) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.date = date;
	}
	public Book() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", date=" + date + "]";
	}


}
