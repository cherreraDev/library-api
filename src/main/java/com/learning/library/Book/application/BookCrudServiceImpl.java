package com.learning.library.Book.application;

import com.learning.library.Book.domain.interfaces.BookCrudRepository;
import com.learning.library.Book.domain.interfaces.BookCrudService;
import com.learning.library.Book.domain.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookCrudServiceImpl implements BookCrudService {

    private final BookCrudRepository repository;

    public BookCrudServiceImpl(BookCrudRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Book> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Book book) {
        repository.update(book);
    }
}
