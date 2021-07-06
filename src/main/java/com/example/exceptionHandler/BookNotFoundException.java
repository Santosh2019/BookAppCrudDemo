package com.example.exceptionHandler;

public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BookNotFoundException() {

	}

	public BookNotFoundException(String message) {
		super("Id does not exit");
	}

}
