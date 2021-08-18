package com.spring.io.JUnitMockitoDummyTestDouble.service.repository;

import java.util.Collection;

import com.spring.io.JUnitMockitoDummyTestDouble.model.Book;

public interface BookRepository {
	public void addBook(Book book);
	Collection<Book> findAll();
}
