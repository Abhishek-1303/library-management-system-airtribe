package com.library.repository.impl;

import com.library.entity.Patron;
import com.library.repository.PatronRepository;
import java.util.*;

public class InMemoryPatronRepository implements PatronRepository {

    private final Map<String, Patron> store = new HashMap<>();

    @Override
    public void save(Patron patron) {
        store.put(patron.getId(), patron);
    }

    @Override
    public Optional<Patron> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }
}