package com.library.service.impl;

import com.library.entity.Patron;
import com.library.repository.PatronRepository;
import com.library.service.PatronService;

public class PatronServiceImpl implements PatronService {

    private final PatronRepository repository;

    public PatronServiceImpl(PatronRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addPatron(String id, String name) {
        repository.save(new Patron(id, name));
    }
}