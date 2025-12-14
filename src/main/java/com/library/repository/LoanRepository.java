package com.library.repository;

import com.library.entity.Loan;
import java.util.Optional;

public interface LoanRepository {
    void save(Loan loan);
    Optional<Loan> findActiveLoanByIsbn(String isbn);
}