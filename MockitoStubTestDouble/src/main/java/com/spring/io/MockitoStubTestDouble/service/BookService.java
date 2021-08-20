package com.spring.io.MockitoStubTestDouble.service;

import java.util.List;

import com.spring.io.MockitoStubTestDouble.model.Book;
import com.spring.io.MockitoStubTestDouble.repository.BookRepository;

public class BookService {

	BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public List<Book> newPriceWithDiscount(int rateOfDiscount, int days)
	{
		List<Book> newBooks = bookRepository.findAll();
		
		for(Book book : newBooks)
		{
			int price = book.getBookPrice();
			int newPrice = price - (price * rateOfDiscount / 100);
			book.setBookPrice(newPrice);
		}
		
		return (List<Book>) newBooks;
	}
	
}
