package com.library.controller;

import com.library.repository.*;
import com.library.repository.impl.*;
import com.library.service.*;
import com.library.service.impl.*;

public class LibraryFacade {

    private final BookService bookService;
    private final PatronService patronService;
    private final LendingService lendingService;

    public LibraryFacade() {
        BookRepository bookRepo = new InMemoryBookRepository();
        PatronRepository patronRepo = new InMemoryPatronRepository();
        LoanRepository loanRepo = new InMemoryLoanRepository();

        this.bookService = new BookServiceImpl(bookRepo);
        this.patronService = new PatronServiceImpl(patronRepo);
        this.lendingService = new LendingServiceImpl(bookRepo, patronRepo, loanRepo);
    }

    public void addBook(String title, String author, String isbn, int year) {
        bookService.addBook(title, author, isbn, year);
    }

    public void addPatron(String id, String name) {
        patronService.addPatron(id, name);
    }

    public void checkoutBook(String isbn, String patronId) {
        lendingService.checkoutBook(isbn, patronId);
    }

    public void returnBook(String isbn) {
        lendingService.returnBook(isbn);
    }
}