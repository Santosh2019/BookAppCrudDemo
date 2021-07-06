package com.bookapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "book_tble")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

	@Id
	@Column(name = "book_price")
	private int bookPrice;

	@Column(name = "book_name")
	private String bookName;

}
