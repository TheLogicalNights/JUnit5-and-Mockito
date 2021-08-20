package com.spring.io.MockitoFakeTestDouble.repository;

import java.util.Collection;

import com.spring.io.MockitoFakeTestDouble.model.Book;

public interface BookRepository {
	public void add(Book book);
	Collection<Book> findAll();
}
