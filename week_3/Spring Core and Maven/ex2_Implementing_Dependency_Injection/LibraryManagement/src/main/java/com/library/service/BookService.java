package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepository;
	
	// there is a very thin line between spring configuration and dependency injection
	// and i did it in a way that it is easy to understand and implement di in the foundation code itself from exercise 1
	// and now its also used for ex 2 as well
	
	// setter for dependency injection
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public void addBook(String title) {
		System.out.println("Adding book : " + title);
		bookRepository.saveBook(title);
	}
}
