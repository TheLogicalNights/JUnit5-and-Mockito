package com.spring.io.MockitoDummyTestDouble.service;

import com.spring.io.MockitoDummyTestDouble.model.Book;
import com.spring.io.MockitoDummyTestDouble.repository.BookRepository;

public class BookService {
	
	BookRepository bookRepository;
	EmailService emailService;
	
	public BookService(BookRepository bookRepository, EmailService emailService) {
		super();
		this.bookRepository = bookRepository;
		this.emailService = emailService;
	}
	
	public void add(Book book)
	{
		bookRepository.add(book);
	}
	
	public int findNumberOfBooks()
	{
		return bookRepository.findAll().size();
	}
}
