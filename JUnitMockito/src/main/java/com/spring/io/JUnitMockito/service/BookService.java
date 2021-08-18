package com.spring.io.JUnitMockito.service;

import com.spring.io.JUnitMockito.model.Book;
import com.spring.io.JUnitMockito.repository.BookRepository;

public class BookService {
	
	BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
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
