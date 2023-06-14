package com.nagarro.librarysystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.librarysystem.Entity.Book;
import com.nagarro.librarysystem.Repo.BookRepository;
@Service
public class BookServiceImp implements BookService {
	@Autowired
	BookRepository bRepo;

	@Override
	public String add(Book obj) {
		// TODO Auto-generated method stub
		System.out.println("Call");
		bRepo.save(obj);
		System.out.println("chal rha");
		return "success";
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		System.out.println("All Book");
		List<Book> objBooks=bRepo.findAll();
		
		return objBooks;
	}

	@Override
	public Book search(int id) {
		Optional<Book> book=bRepo.findById(id);
		Book book2=book.get();
		return book2;
	}

	@Override
	public String updateBook(Book obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("Yes!!");
		String string="";
		Optional<Book> b=bRepo.findById(id);
		if(b.isPresent())
		{
			bRepo.deleteById(id);
			string="success";
		}
		return string;
	}

}
