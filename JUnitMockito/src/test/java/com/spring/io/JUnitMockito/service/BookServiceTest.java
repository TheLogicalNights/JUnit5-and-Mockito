package com.spring.io.JUnitMockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.io.JUnitMockito.model.Book;
import com.spring.io.JUnitMockito.repository.BookRepository;
import com.spring.io.JUnitMockito.repository.FakeBookRepository;

@SpringBootTest
public class BookServiceTest {

	BookRepository bookRepository = new FakeBookRepository();
	BookService book = new BookService(bookRepository);
	@Test
	public void testAddBook()
	{
		book.addBook(new Book(UUID.randomUUID().toString(), "The Linux Programming Interface", "Michael Kerrisk", 5000));
		book.addBook(new Book(UUID.randomUUID().toString(), "Linux System Programming", "Robert Love", 1560));
		book.addBook(new Book(UUID.randomUUID().toString(), "Linux in a Nutshell", "Robert Love", 5000));
		
		assertEquals(3, book.findNumberOfBooks());
	}
}
