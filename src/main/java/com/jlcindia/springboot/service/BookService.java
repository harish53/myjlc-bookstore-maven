package com.jlcindia.springboot.service;

import java.util.List;


import com.jlcindia.springboot.entity.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public void addBook(Book book);
}
