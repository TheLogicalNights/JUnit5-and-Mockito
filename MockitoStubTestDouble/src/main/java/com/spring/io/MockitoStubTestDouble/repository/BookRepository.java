package com.spring.io.MockitoStubTestDouble.repository;

import java.util.List;

import com.spring.io.MockitoStubTestDouble.model.Book;

public interface BookRepository {
	public List<Book> findAll();
}
