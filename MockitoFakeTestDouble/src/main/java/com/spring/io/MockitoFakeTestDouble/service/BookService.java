package com.spring.io.MockitoFakeTestDouble.service;

import com.spring.io.MockitoFakeTestDouble.model.Book;
import com.spring.io.MockitoFakeTestDouble.repository.BookRepository;

public class BookService {
	
	BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
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
