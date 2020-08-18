package com.bookapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_tble")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_price")
	private int bookPrice;

	@Column(name = "book_name")
	private String bookName;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookPrice, String bookName) {
		super();
		this.bookPrice = bookPrice;
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookPrice=" + bookPrice + ", bookName=" + bookName + "]";
	}

}
