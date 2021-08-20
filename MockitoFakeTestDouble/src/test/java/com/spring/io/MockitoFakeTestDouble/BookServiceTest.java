package com.spring.io.MockitoFakeTestDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.io.MockitoFakeTestDouble.model.Book;
import com.spring.io.MockitoFakeTestDouble.repository.BookRepository;
import com.spring.io.MockitoFakeTestDouble.service.BookService;

@SpringBootTest
public class BookServiceTest {

	BookRepository bookRepository = mock(BookRepository.class);
	BookService bookService = new BookService(bookRepository);
	@Test
	public void fakeTestDouble()
	{
		Book book1 = new Book(UUID.randomUUID().toString(), "The Linux Programming Interface", "Michael Kerrisk", 5000.0);
		Book book2 = new Book(UUID.randomUUID().toString(), "Linux System Programming", "Robert Love", 1560.0);
		Book book3 = new Book(UUID.randomUUID().toString(), "Linux in a Nutshell", "Robert Love", 5000.0);
		
		Collection<Book> bookStore = new ArrayList<>();
		
		bookStore.add(book1);
		bookStore.add(book2);
		bookStore.add(book3);
		
		when(bookRepository.findAll()).thenReturn(bookStore);
		
		assertEquals(3, bookService.findNumberOfBooks());
	}
}
