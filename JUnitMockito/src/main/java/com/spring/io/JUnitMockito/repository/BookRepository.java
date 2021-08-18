package com.spring.io.JUnitMockito.repository;

import java.util.Collection;

import com.spring.io.JUnitMockito.model.Book;

public interface BookRepository {
	public void addBook(Book book);
	Collection<Book> findAll();
}
