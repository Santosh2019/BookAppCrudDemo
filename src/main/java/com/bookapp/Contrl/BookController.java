package com.bookapp.Contrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.SrvcImpl.BookServiceImplementation;
import com.bookapp.bean.Book;

@RestController
public class BookController {

	@Autowired
	BookServiceImplementation serviceImplementaion;

	@PostMapping("/create")
	public void addBook(@RequestBody Book bookName) {
		
		System.out.println("\t Record Added Successfully");
	
		serviceImplementaion.add(bookName);
	}

	@PutMapping("/update/{bookPrice}")
	public void updateBook(@PathVariable("bookPrice") int bookPrice, @RequestBody Book bookName) {

		System.out.println(" \t Record Updated Successfully");
		serviceImplementaion.update(bookName);
	}

	@DeleteMapping("/delete/{bookPrice}")
	public void deleteBook(@PathVariable("bookPrice") int bookPrice) {
		
		System.out.println("\t Record Deleted Successfully");
		serviceImplementaion.delete(bookPrice);

	}

}
