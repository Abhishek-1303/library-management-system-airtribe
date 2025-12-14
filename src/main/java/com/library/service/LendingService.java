package com.library.service;

public interface LendingService {
    void checkoutBook(String isbn, String patronId);
    void returnBook(String isbn);
}