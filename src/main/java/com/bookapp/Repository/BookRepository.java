package com.bookapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.bean.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
