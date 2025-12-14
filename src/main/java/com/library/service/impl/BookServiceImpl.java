package com.library.service.impl;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import com.library.service.BookService;

public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addBook(String title, String author, String isbn, int year) {
        repository.save(new Book(isbn, title, author, year));
    }
}