package com.library.service.impl;

import com.library.entity.*;
import com.library.repository.*;
import com.library.service.LendingService;

public class LendingServiceImpl implements LendingService {

    private final BookRepository bookRepo;
    private final PatronRepository patronRepo;
    private final LoanRepository loanRepo;

    public LendingServiceImpl(BookRepository bookRepo,
                              PatronRepository patronRepo,
                              LoanRepository loanRepo) {
        this.bookRepo = bookRepo;
        this.patronRepo = patronRepo;
        this.loanRepo = loanRepo;
    }

    @Override
    public void checkoutBook(String isbn, String patronId) {
        Book book = bookRepo.findByIsbn(isbn).orElseThrow();
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book already borrowed");
        }

        Patron patron = patronRepo.findById(patronId).orElseThrow();
        book.markBorrowed();

        Loan loan = new Loan(book, patron);
        patron.addLoan(loan);
        loanRepo.save(loan);
    }

    @Override
    public void returnBook(String isbn) {
        Loan loan = loanRepo.findActiveLoanByIsbn(isbn).orElseThrow();
        loan.markReturned();
        loan.getBook().markReturned();
    }
}