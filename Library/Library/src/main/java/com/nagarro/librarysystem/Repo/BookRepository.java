package com.nagarro.librarysystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.librarysystem.Entity.Book;
@Repository

public interface BookRepository extends JpaRepository<Book, Integer> {

}
