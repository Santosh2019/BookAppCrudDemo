package com.bookapp.Service;

import java.util.List;

import com.bookapp.bean.Book;

public interface BookAppService{
	
	public void add(Book name);

	public void update(Book name);
	
	public void delete(int bookPrice);
	
	public Book getBook(int bookPrice);
	
	public List<Book>getAllBooks(Book name);
	
	
}
