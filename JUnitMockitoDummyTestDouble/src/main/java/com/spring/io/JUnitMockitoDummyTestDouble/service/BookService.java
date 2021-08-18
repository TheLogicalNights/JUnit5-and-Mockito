package com.spring.io.JUnitMockitoDummyTestDouble.service;

import com.spring.io.JUnitMockitoDummyTestDouble.model.Book;
import com.spring.io.JUnitMockitoDummyTestDouble.service.repository.BookRepository;

public class BookService {

	BookRepository bookRepository;
	EmailService emailService;
	
	public BookService(BookRepository bookRepository, EmailService emailService) {
		super();
		this.bookRepository = bookRepository;
		this.emailService = emailService;
	}
	
	public void addBook(Book book)
	{
		bookRepository.addBook(book);
	}
	
	public int findNumberOfBooks()
	{
		return bookRepository.findAll().size();
	}
}
