package com.bookapp.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookapp.bean.Book;

public interface BookService extends JpaRepository<Book, Integer>{

	public void add(Book book);

	public void update(Book book);

	public void delete(int bookPrice);
	
	
}
