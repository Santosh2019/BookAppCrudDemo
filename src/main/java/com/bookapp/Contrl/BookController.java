package com.bookapp.Contrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.SrvcImpl.BookServiceImplementation;
import com.bookapp.bean.Book;
import com.example.exceptionHandler.BookNotFoundException;

@RestController
public class BookController {

	@Autowired
	BookServiceImplementation serviceImplementaion;

	@GetMapping("/allList")
	public List<Book> getAllBook_list(Book name) {

		return serviceImplementaion.getAllBooks(name);

	}

	@GetMapping("/getSingleBook/{bookPrice}")
	public Book getSingleBook_list(@PathVariable("bookPrice") int bookPrice){	
		
		if(true) throw new BookNotFoundException("Book Id Not found");
		
		@SuppressWarnings("unused")
		Book bookObj = serviceImplementaion.getBook(bookPrice);
		return bookObj;

	}

	@PostMapping("/create")
	public String addBook(@RequestBody Book bookName) {

		serviceImplementaion.add(bookName);

		return "Record Added Successfully";

	}

	@PutMapping("/update/{bookPrice}")
	public String updateBook(@PathVariable("bookPrice") int bookPrice, @RequestBody Book bookName) {


		
		serviceImplementaion.update(bookName);

		return "Record Updated Successfully";
	}

	@DeleteMapping("/delete/{bookPrice}")
	public String deleteBook(@PathVariable("bookPrice") int bookPrice) {

		serviceImplementaion.delete(bookPrice);

		return "Record Deleted Successfully";

	}

}
