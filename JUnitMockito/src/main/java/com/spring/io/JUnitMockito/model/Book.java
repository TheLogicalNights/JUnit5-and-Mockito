package com.spring.io.JUnitMockito.model;

public class Book {
	String bookId;
	String bookName;
	String bookWriter;
	float price;
	
	public Book(String bookId, String bookName, String bookWriter, float price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.price = price;
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
