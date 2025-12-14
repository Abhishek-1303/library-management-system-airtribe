package com.library;

import com.library.controller.LibraryFacade;

public class Main {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();

        library.addBook("Clean Code", "Robert Martin", "ISBN-1", 2008);
        library.addBook("Effective Java", "Joshua Bloch", "ISBN-2", 2018);

        library.addPatron("P1", "Abhishek");

        library.checkoutBook("ISBN-1", "P1");
        library.returnBook("ISBN-1");
    }
}