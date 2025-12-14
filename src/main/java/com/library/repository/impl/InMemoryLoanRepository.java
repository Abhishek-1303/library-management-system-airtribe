package com.library.repository.impl;

import com.library.entity.Loan;
import com.library.repository.LoanRepository;
import java.util.*;

public class InMemoryLoanRepository implements LoanRepository {

    private final List<Loan> loans = new ArrayList<>();

    @Override
    public void save(Loan loan) {
        loans.add(loan);
    }

    @Override
    public Optional<Loan> findActiveLoanByIsbn(String isbn) {
        return loans.stream()
            .filter(l -> !l.isReturned() && l.getBook().getIsbn().equals(isbn))
            .findFirst();
    }
}