package com.library.entity;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private final String id;
    private String name;
    private final List<Loan> borrowingHistory = new ArrayList<>();

    public Patron(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void addLoan(Loan loan) {
        borrowingHistory.add(loan);
    }
}