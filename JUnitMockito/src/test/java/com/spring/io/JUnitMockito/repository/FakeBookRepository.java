package com.spring.io.JUnitMockito.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.spring.io.JUnitMockito.model.Book;

public class FakeBookRepository implements BookRepository{

	Map<String, Book> bookStore = new HashMap<>();
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookStore.put(book.getBookId(), book);
	}

	@Override
	public Collection<Book> findAll() {
		// TODO Auto-generated method stub
		return bookStore.values();
	}
}
