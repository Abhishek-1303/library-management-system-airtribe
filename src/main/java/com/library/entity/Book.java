package com.library.entity;

public class Book {
    private final String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean available = true;

    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markBorrowed() {
        this.available = false;
    }

    public void markReturned() {
        this.available = true;
    }
}