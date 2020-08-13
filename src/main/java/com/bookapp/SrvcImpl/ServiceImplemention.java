package com.bookapp.SrvcImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookapp.Repository.BookRepository;
import com.bookapp.bean.Book;

public class ServiceImplemention {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("/add")
	public void add(Book bookName) {
		
		bookRepository.save(bookName);
	}
	
}