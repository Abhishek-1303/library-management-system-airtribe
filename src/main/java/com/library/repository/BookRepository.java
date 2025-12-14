package com.library.repository;

import com.library.entity.Book;
import java.util.*;

public interface BookRepository {
    void save(Book book);
    Optional<Book> findByIsbn(String isbn);
    Collection<Book> findAll();
}