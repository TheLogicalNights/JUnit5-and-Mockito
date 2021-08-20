package com.spring.io.MockitoDummyTestDouble.repository;

import java.util.Collection;

import com.spring.io.MockitoDummyTestDouble.model.Book;

public interface BookRepository {
	public void add(Book book);
	Collection<Book> findAll();
}
