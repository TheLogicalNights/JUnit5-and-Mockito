package com.spring.io.JUnitMockitoDummyTestDouble.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.io.JUnitMockitoDummyTestDouble.model.Book;
import com.spring.io.JUnitMockitoDummyTestDouble.repository.FakeBookRepository;
import com.spring.io.JUnitMockitoDummyTestDouble.service.repository.BookRepository;

@SpringBootTest
public class BookServiceTest {
	
	BookRepository bookRepository = new FakeBookRepository();
	EmailService emailService = new FakeEmailService();
	
	BookService bookService = new BookService(bookRepository, emailService);
	
	@Test
	public void test()
	{
		bookService.addBook(new Book(UUID.randomUUID().toString(), "The Linux Programming interface", "Michael Kerrisk", "5000"));
		bookService.addBook(new Book(UUID.randomUUID().toString(), "The C Programming Approch", "Ajay Mittal", "350"));
		bookService.addBook(new Book(UUID.randomUUID().toString(), "Core Java", "Nageshwar Rao", "500"));
		bookService.addBook(new Book(UUID.randomUUID().toString(), "CLR via C#", "ORILE'", "5000"));
		
		assertEquals(4, bookService.findNumberOfBooks());
	}
}
