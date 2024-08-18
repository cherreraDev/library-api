package com.learning.library.Book.domain.interfaces;

import com.learning.library.Book.domain.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookCrudService {
    Book save(Book book);
    List<Book> findAll();
    Optional<Book> findById(UUID id);
    void deleteById(UUID id);
    void update(Book book);
}
