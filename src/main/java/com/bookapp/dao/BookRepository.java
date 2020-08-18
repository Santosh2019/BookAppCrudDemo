package com.bookapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.bean.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	

}
