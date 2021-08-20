package com.spring.io.MockitoStubTestDouble.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.spring.io.MockitoStubTestDouble.model.Book;

public class FakeBookRepository implements BookRepository {

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		List<Book> bookStub = new ArrayList<>();
		
		Book book1 = new Book(UUID.randomUUID().toString(), "The Linux Programming Interface", "Michael Kerrisk", 5000);
		Book book2 = new Book(UUID.randomUUID().toString(), "Linux System Programming", "Robert Love", 1560);
		Book book3 = new Book(UUID.randomUUID().toString(), "Linux in a Nutshell", "Robert Love", 5000);
		
		bookStub.add(book1);
		bookStub.add(book2);
		bookStub.add(book3);
		
		return bookStub;
	}

}
 