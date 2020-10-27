package com.danilson.appspringboot.exceptions;

public class BookIdNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BookIdNotFoundException() {
	}

	public BookIdNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
