package com.bookapp.Contrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookapp.SrvcImpl.ServiceImplemention;
import com.bookapp.bean.Book;

@RestController
public class BookController extends ServiceImplemention{
	
	
	@Autowired
	ServiceImplemention serviceImplementaion;
	
	@GetMapping("/addEmployee")
	public void addEmployee(Book bookName) {
		
		serviceImplementaion.add(bookName);
	}
	
	
	

}
