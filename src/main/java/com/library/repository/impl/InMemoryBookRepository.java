package com.library.repository.impl;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import java.util.*;

public class InMemoryBookRepository implements BookRepository {

    private final Map<String, Book> store = new HashMap<>();

    @Override
    public void save(Book book) {
        store.put(book.getIsbn(), book);
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.ofNullable(store.get(isbn));
    }

    @Override
    public Collection<Book> findAll() {
        return store.values();
    }
}