package com.spring.io.MockitoStubTestDouble.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.io.MockitoStubTestDouble.model.Book;
import com.spring.io.MockitoStubTestDouble.repository.BookRepository;
import com.spring.io.MockitoStubTestDouble.repository.FakeBookRepository;

@SpringBootTest
public class BookServiceTest {
	BookRepository bookRepository = new FakeBookRepository();
	BookService bookService = new BookService(bookRepository);
	
	@Test
	public void testStubTestDouble()
	{
		List<Book> result = bookService.newPriceWithDiscount(10, 5); 
		
		assertEquals(3, result.size());
		assertEquals(4500, result.get(0).getBookPrice());
		assertEquals(1404, result.get(1).getBookPrice());
		assertEquals(4500, result.get(2).getBookPrice());
	}
}
