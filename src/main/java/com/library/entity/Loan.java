package com.library.entity;

import java.time.LocalDate;

public class Loan {
    private final Book book;
    private final Patron patron;
    private final LocalDate borrowDate;
    private LocalDate returnDate;

    public Loan(Book book, Patron patron) {
        this.book = book;
        this.patron = patron;
        this.borrowDate = LocalDate.now();
    }

    public Book getBook() {
        return book;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    public void markReturned() {
        this.returnDate = LocalDate.now();
    }
}