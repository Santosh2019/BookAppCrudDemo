package com.bookapp.SrvcImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.Service.BookAppService;
import com.bookapp.bean.Book;
import com.bookapp.dao.BookRepository;

@Service
public class BookServiceImplementation implements BookAppService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public void add(Book name) {
		// TODO Auto-generated method stubs
		bookRepository.save(name);
	}

	@Override
	public void update(Book name) {
		// TODO Auto-generated method stub
		bookRepository.save(name);

	}

	@Override
	public void delete(int bookPrice) {
		// TODO Auto-generated method stub
		
		bookRepository.deleteById(bookPrice);
	}

	@Override
	public List<Book> getAllBooks(Book name) {
		// TODO Auto-generated method stub
		List<Book>list=bookRepository.findAll();
		
		return list;
	}

	@Override
	public Book getBook(int bookPrice) {
		// TODO Auto-generated method stub
		Optional<Book>getOnebook=bookRepository.findById(bookPrice);
		return getOnebook.get();
	}



}
