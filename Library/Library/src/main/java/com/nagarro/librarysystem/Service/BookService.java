package com.nagarro.librarysystem.Service;

import java.util.List;

import com.nagarro.librarysystem.Entity.Book;

public interface BookService {
	public String add(Book obj);
	public List<Book> getAll();
	public Book search(int id);
	public String updateBook(Book obj);
	public String delete(int id);

}
